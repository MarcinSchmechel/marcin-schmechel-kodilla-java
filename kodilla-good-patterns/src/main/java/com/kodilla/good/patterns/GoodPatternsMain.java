package com.kodilla.good.patterns;

import com.kodilla.good.patterns.challenges.MovieStore;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GoodPatternsMain {
    public static void main(String[] args) {
        MovieStore movieStore = new MovieStore();

        Map<String, List<String>> flatMapMovies = new HashMap<>(movieStore.getMovies());
        String moviesJoined = flatMapMovies
                .values()
                .stream()
                .flatMap(Collection::stream)
                .collect(Collectors.joining(" ! "));
        System.out.println(moviesJoined);
    }
}