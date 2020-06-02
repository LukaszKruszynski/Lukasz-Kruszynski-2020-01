package com.kodilla.sudoku;

import java.util.ArrayList;
import java.util.List;

public class SudokuElement {
    public static final int EMPTY = -1;
    private int value;
    private List<Integer> possibles = new ArrayList<>();

    public SudokuElement() {
        value = EMPTY;
        for (int n = 1; n <= 9; n++)
            possibles.add(n);
    }

    public int getValue() {
        return value;
    }

    public List<Integer> getPossibles() {
        return possibles;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        if (value != EMPTY)
            return "" + value;
        else
            return " ";
    }
}
