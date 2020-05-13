package com.kodilla.spring.calculactor;

import com.kodilla.spring.calculator.Calculator;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorTestSuite {
    @Test

    public void testCalculations() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        double addition = calculator.addition(7, 4);
        double subtraction = calculator.subtraction(12, 3);
        double multiplication = calculator.multiplication(8, 3);
        double division = calculator.division(9, 3);
        //Then
        Assert.assertEquals(11,addition,0.001);
        Assert.assertEquals(9,subtraction,0.001);
        Assert.assertEquals(24,multiplication,0.001);
        Assert.assertEquals(3,division,0.001);

    }
}
