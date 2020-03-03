package com.kodilla.rps;

import java.util.Scanner;

public class UserDialogs {
    public static String getUserName() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter your name: ");
            String name = scanner.nextLine().trim();
            if (name.length() < 2) {
                System.out.println("Minimum length equals to 2, try again.");
            } else {
                return name;
            }
        }
    }

    public static int getNumberOfRounds() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter number of rounds: ");
            String s = scanner.nextLine();
            try {
                int n = Integer.parseInt(s);
                if (n <= 0) {
                    throw new Exception();
                }
                return n;
            } catch (Exception e) {
                System.out.println("Wrong number, try again.");
            }
        }
    }

    public static UserSelection getDecision() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("End of session? (N)o (Y)es: ");
            String s = scanner.nextLine().trim().toUpperCase();
            switch (s) {
                case "Y":
                    return UserSelection.YES;
                case "N":
                    return UserSelection.NO;
            }
        }
    }

    public static UserSelection getUserSelection() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter your move: (S)cissors, (P)aper, (R)ock or select (Q)uit or (N)ew game: ");
            String s = scanner.nextLine().trim().toUpperCase();
            switch (s) {
                case "S":
                    return UserSelection.SCISSORS;
                case "P":
                    return UserSelection.PAPER;
                case "R":
                    return UserSelection.ROCK;
                case "Q":
                    return UserSelection.QUIT;
                case "N":
                    return UserSelection.NEW_GAME;
                default:
                    System.out.println("Wrong selection, try again");
            }
        }
    }

    public static void displayPartialScore(Winner winner, UserSelection userSelection, ComputerSelection computerSelection, int humanScore, int computerScore) {

        System.out.println("You choice " + userSelection + ".\n Computer choice " + computerSelection + ".\n " +
                winner + " win round.\n " + "Your score: " + humanScore + "\n Computer score: " + computerScore);
    }
}
