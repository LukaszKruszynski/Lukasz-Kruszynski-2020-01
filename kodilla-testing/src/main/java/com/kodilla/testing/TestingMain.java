package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
    public static void main(String[] args) {
        //com.kodilla.testing.user
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }
        //com.kodilla.testing.calculator
        Calculator calculator = new Calculator();
        int resultAddAtoB = calculator.addAtoB(4, 3);
        int resultSubstracAfromB = calculator.substractAfromB(12, 3);
        if ((resultAddAtoB == 7) && (resultSubstracAfromB == 9)) {
            System.out.println("calculator test - OK!");
        } else{
            System.out.println("calculator test - ERROR!");
        }
    }
}
