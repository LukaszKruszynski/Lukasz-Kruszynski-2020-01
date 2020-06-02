package com.kodilla.sudoku;

public class AppSudoku {
    public static void main(String[] args) {
        Board board = new Board();
        board.setValue(2,2,4);
        board.setValue(6,3,6);
        board.setValue(1,5,2);
        System.out.println(board);
        board.resolve();
        System.out.println(board);
    }
}
