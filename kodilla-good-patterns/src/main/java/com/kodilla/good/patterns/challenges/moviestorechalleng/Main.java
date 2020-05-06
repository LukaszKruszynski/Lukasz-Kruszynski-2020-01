package com.kodilla.good.patterns.challenges.moviestorechalleng;

import com.kodilla.good.patterns.challenges.moviestorechalleng.MovieStore;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        MovieStore movieStore = new MovieStore();
        Map<String, List<String>> movies = movieStore.getMovies();
        String result = movies.entrySet().stream()
                .flatMap(e -> e.getValue().stream())
                .collect(Collectors.joining("!"));
        System.out.println(result);



    }
}
