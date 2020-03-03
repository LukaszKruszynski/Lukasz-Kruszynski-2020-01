package com.kodilla.rps;

public class RPSGame {
    public boolean run() {
        String userName = UserDialogs.getUserName();
        int rounds = UserDialogs.getNumberOfRounds();
        int round = 0;
        int computerScore = 0;
        int humanScore =0;
        while (round < rounds) {
            round++;
            UserSelection userSelection = UserDialogs.getUserSelection();
            if (userSelection==UserSelection.NEW_GAME) return true;
            if (userSelection==UserSelection.QUIT) return false;
            ComputerSelection computerSelection = AI.getMove();
            Winner winner = AI.getWinner (userSelection,computerSelection);
            if(winner==Winner.COMPUTER) {
                computerScore++;
            }else if (winner==Winner.HUMAN) {
                humanScore++;
            }else {
                computerScore++;
                humanScore++;
            }
            UserDialogs.displayPartialScore(winner,userSelection,computerSelection,humanScore,computerScore);
        }
        return false;
    }
}

