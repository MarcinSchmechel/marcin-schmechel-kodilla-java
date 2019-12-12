package com.kodilla.testing.collection;

import java.util.*;

public class OddNumbersExterminator{

    public List<Integer> exterminate(ArrayList<Integer> numbers){
        List<Integer> evenList = new ArrayList<>();
            for (Integer number : numbers) {
                if (number % 2 == 0) {
                    evenList.add(number);
                }
            }
        return evenList;
    }
}
