package com.kodilla.stream.array;

import java.util.stream.IntStream;

public interface ArrayOperations {

    static double getAverage(int[] numbers) {
        return IntStream.range(0, numbers.length)
                .map(i -> numbers[i])
                .map(ArrayOperations::display)
                .average()
                .getAsDouble();
    }

    static int display(int n) {
        System.out.println(n);
        return n;
    }
}
