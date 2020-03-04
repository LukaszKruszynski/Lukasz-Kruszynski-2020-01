package com.kodilla.rps;

import java.util.Random;

public class AI {

    public static ComputerSelection getMove() {
        Random random = new Random();
        int n = random.nextInt(100);
        if (n < 33) return ComputerSelection.PAPER;
        if (n < 66) return ComputerSelection.ROCK;
        return ComputerSelection.SCISSORS;
    }

    public static Winner getWinner(UserSelection userSelection, ComputerSelection computerSelection) {
        if (userSelection == UserSelection.PAPER) {
            if (computerSelection == ComputerSelection.PAPER) return Winner.DRAW;
            if (computerSelection == ComputerSelection.SCISSORS) return Winner.COMPUTER;
            return Winner.HUMAN;

        } else if (userSelection == UserSelection.ROCK) {
            if (computerSelection == ComputerSelection.ROCK) return Winner.DRAW;
            if (computerSelection == ComputerSelection.SCISSORS) return Winner.HUMAN;
            return Winner.COMPUTER;

        } else {
            if (computerSelection == ComputerSelection.SCISSORS) return Winner.DRAW;
            if (computerSelection == ComputerSelection.PAPER) return Winner.HUMAN;
            return Winner.COMPUTER;
        }
    }
}


