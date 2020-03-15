package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

import static com.kodilla.stream.array.ArrayOperations.getAverage;

public class ArrayOperationsTestSuite {
    @Test
    public void testGetAverage() {
        //Given
        int[] teatArray = {1, 2, 3, 4, 5, 6};

        //When
        double calculatedAverage = getAverage(teatArray);
        double expectedAverage = 3.5;

        //Then
        Assert.assertEquals(expectedAverage, calculatedAverage, 0.01);
    }

    @Test
    public void testGetAverageEmptyArray() {
        //Given
        int[] teatArray = {};

        //When
        double calculatedAverage = getAverage(teatArray);
        double expectedAverage = 0;

        //Then
        Assert.assertEquals(expectedAverage, calculatedAverage, 0.01);
    }
}
