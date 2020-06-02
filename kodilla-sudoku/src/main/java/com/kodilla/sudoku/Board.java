package com.kodilla.sudoku;

import java.util.ArrayList;
import java.util.List;

public class Board {
    private List<BoardRow> rows = new ArrayList<>();

    public Board() {
        for (int n = 0; n < 9; n++)
            rows.add(new BoardRow());
    }
    public void resolve() {

    }

    public void setValue(int x, int y, int value) {
        rows.get(y).getCols().get(x).setValue(value);
    }

    public int getValue(int x, int y) {
        return rows.get(y).getCols().get(x).getValue();
    }

    public List<Integer> getPossibles(int x, int y) {
        return rows.get(y).getCols().get(x).getPossibles();
    }

    @Override
    public String toString() {
        String s = "|---|---|---|---|---|---|---|---|---|\n";
        for (int n = 0; n < 9; n++) {
            s += rows.get(n);
            s += "|---|---|---|---|---|---|---|---|---|\n";
        }
        return s;
    }
}
