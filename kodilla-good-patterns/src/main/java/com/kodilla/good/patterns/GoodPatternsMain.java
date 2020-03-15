package com.kodilla.good.patterns;

import com.kodilla.good.patterns.challenges.MovieStore;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GoodPatternsMain {
    public static void main(String[] args) {
        MovieStore movieStore = new MovieStore();
        movieStore.getMovies();
        Map<String, List<String>> flatMapMovies = new HashMap<>(movieStore.getMovies());
        flatMapMovies
                .values()
                .stream()
                .flatMap(x -> x.stream())
                .forEach(System.out::println);
    }
}