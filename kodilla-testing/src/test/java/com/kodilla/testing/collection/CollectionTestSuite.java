package com.kodilla.testing.collection;

import org.junit.*;
import org.junit.rules.TestName;

import java.util.ArrayList;
import java.util.Arrays;

public class CollectionTestSuite {

    @Rule
    public TestName name = new TestName();

    @Before
    public void before() {
        System.out.println("Test Case: " + name.getMethodName());
    }

    @After
    public void after() {
        System.out.println("Test Case: end");
    }

    @Test
    public void testOddNumbersExterminatorEmptyList() {
        //Given
        OddNumbersExterminator testListForEmptyList = new OddNumbersExterminator();
        ArrayList<Integer> emptyList = new ArrayList<>();
        //When
        ArrayList<Integer> shouldBeEmptyList = new ArrayList<>(testListForEmptyList.exterminate(emptyList));
        System.out.println("Testing Empty List");
        // Then
        Assert.assertTrue(shouldBeEmptyList.isEmpty());
        System.out.println("Here should be empty list: " + shouldBeEmptyList);
    }

    @Test
    public void testOddNumbersExterminatorNormalList() {
        //Given
        OddNumbersExterminator testListForEvenList = new OddNumbersExterminator();
        ArrayList<Integer> allNumbersList = new ArrayList<>();
        allNumbersList.addAll(Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9));
        ArrayList<Integer> correctNumbersList = new ArrayList<>();
        correctNumbersList.addAll(Arrays.asList(2, 4, 6, 8));
        //When
        ArrayList<Integer> shouldBeEvenNumbersList = new ArrayList<>(testListForEvenList.exterminate(allNumbersList));
        System.out.println("Testing Even List");
        // Then
        Assert.assertEquals(correctNumbersList, shouldBeEvenNumbersList);
        System.out.println("Here should be only even numbers: " + shouldBeEvenNumbersList);
    }
}
