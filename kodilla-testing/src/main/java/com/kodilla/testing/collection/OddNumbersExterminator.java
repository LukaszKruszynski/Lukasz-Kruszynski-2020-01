package com.kodilla.testing.collection;

import java.util.ArrayList;

public class OddNumbersExterminator {
    ArrayList<Integer> result = new ArrayList<>();

    public ArrayList<Integer> exterminate(ArrayList<Integer> numbers) {
        for (int n = 0; n < numbers.size(); n++) {
            Integer number = numbers.get(n);
            if (number % 2 == 0) {
                result.add(number);
            }
        }
        return result;
    }
}
