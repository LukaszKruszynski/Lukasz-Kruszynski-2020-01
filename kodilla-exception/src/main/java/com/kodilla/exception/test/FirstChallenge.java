package com.kodilla.exception.test;

import java.time.LocalTime;

public class FirstChallenge {

    public double divide(double a, double b) throws ArithmeticException {

        try {
            if (b == 0) {
                throw new ArithmeticException();
            }
        } catch (ArithmeticException e) {
            System.out.println("Nie dzielimy przez 0. Zmieniam wynik na 0.");
            return 0;
        } finally {
            System.out.println("Godzina utworzenia wyniku: " + LocalTime.now());
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

        double result = firstChallenge.divide(3, 0);

        System.out.println(result);

    }
}