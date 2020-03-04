package com.kodilla.rps;

public class RPSGame {

    public boolean run() {
        String userName = UserDialogs.getUserName();
        String computerName = "Opponent";
        int rounds = UserDialogs.getNumberOfRounds();
        int round = 0;
        int computerScore = 0;
        int humanScore = 0;
        Winner winner = null;
        while (round < rounds) {
            round++;
            UserSelection userSelection = UserDialogs.getUserSelection();

            if (userSelection == UserSelection.NEW_GAME) {
                UserSelection userSelectionDecision = UserDialogs.getDecisionToNewGame();
                if (userSelectionDecision == UserSelection.YES) return true;
                else {
                    round--;
                    continue;
                }
            }

            if (userSelection == UserSelection.QUIT) {
                UserSelection userSelectionDecision = UserDialogs.getDecisionToQuit();
                if (userSelectionDecision == UserSelection.YES) return false;
                else {
                    round--;
                    continue;
                }
            }

            ComputerSelection computerSelection = AI.getMove();
            winner = AI.getWinner(userSelection, computerSelection);
            if (winner == Winner.COMPUTER) {
                computerScore++;
            } else if (winner == Winner.HUMAN) {
                humanScore++;
            } else {
                computerScore++;
                humanScore++;
            }
            UserDialogs.displayPartialScore(winner, userSelection, computerSelection, humanScore, computerScore);
        }

        if (humanScore != computerScore) {
            UserDialogs.displayGameScore(userName, computerName, humanScore, computerScore, winner);
        } else {
            UserDialogs.displayGameScoreDraw(humanScore, computerScore);
        }
        UserSelection userSelection = UserDialogs.replayGame();
        if (userSelection == UserSelection.YES) {
            return true;
        } else {
            return false;
        }
    }
}

