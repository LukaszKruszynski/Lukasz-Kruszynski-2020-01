package com.kodilla.spring.calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Calculator {

    @Autowired
    private Display display;

    public double addition(double a, double b) {
        double result = a + b;
        display.displayValue(result);
        return result;
    }

    public double subtraction(double a, double b) {
        double result = a - b;
        display.displayValue(result);
        return result;
    }

    public double division(double a, double b) {
        double result = a / b;
        display.displayValue(result);
        return result;
    }

    public double multiplication(double a, double b) {
        double result = a * b;
        display.displayValue(result);
        return result;
    }
}
