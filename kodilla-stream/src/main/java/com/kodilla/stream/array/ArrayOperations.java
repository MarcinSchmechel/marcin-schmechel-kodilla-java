package com.kodilla.stream.array;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

public interface ArrayOperations {
    public static double getAverage(int[] numbers) {
        double result = 0;
        if (numbers.length!=0) {
            IntStream.range(0, numbers.length)
                    .forEach(x -> System.out.println(numbers[x]));
            OptionalDouble average = IntStream.range(0, numbers.length)
                    .map(n -> numbers[n])
                    .average();
            result = average.getAsDouble();
        } else {
            System.out.println("Tablica pusta");
        }
        return result;
    }
}