package com.kodilla.stream.array;

import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.IntStream;

public interface ArrayOperations {
    static void getAverage(int[] numbers) {
        IntStream.range(0,numbers.length)
                .map(i-> numbers[i])
                .forEach(System.out::println);
        OptionalDouble average = IntStream.range(0,numbers.length)
                .map(i-> numbers[i])
                .average();
        System.out.println("Average of array: " + average.getAsDouble());









    }
}
