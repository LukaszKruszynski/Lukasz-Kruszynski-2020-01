package com.kodilla.exception.test;

public class ExceptionHandling {
    public static void main(String[] args) {

        SecondChallenge secondChallenge = new SecondChallenge();

        try {
            secondChallenge.probablyIWillThrowException(1.5, 1.5);
        } catch (Exception e) {
            System.out.println("Your value or values are incorrect. Enter values excepted (x >= 2) and (x < 1) and (y == 1.5)");
        }finally {
            System.out.println("Preparing to task...");
        }
    }
}


