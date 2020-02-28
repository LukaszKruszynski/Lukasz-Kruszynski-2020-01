package com.kodilla.exception.test;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class FirstChallenge {
    String messageOfDivideBy0 = "Divide by 0 is forbidden. Changing result to 0.";

    public double divide(double a, double b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException();
        }
        return a / b;
    }

    /**
     * This main can throw an ArithmeticException!!!
     *
     * @param args
     */
    public static void main(String[] args) {

        FirstChallenge firstChallenge = new FirstChallenge();
        double result = 0;
        try {
            result = firstChallenge.divide(3, 0);
        } catch (ArithmeticException e) {
            System.out.println(firstChallenge.messageOfDivideBy0);

        } finally {
            System.out.println("Time of result: " + LocalTime.now());
        }
        System.out.println(result);
    }
}

