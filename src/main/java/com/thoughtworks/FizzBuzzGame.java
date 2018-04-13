package com.thoughtworks;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;


public class FizzBuzzGame {
    private List<String> results = new ArrayList<>();

    public void start(int count) {
        results = IntStream.rangeClosed(1, count).boxed().
                map(x -> x.toString()).map(x -> x.indexOf('3') != -1 ? "Fizz" : x).
                map(x ->canBeDivided(x,105)?"FizzBuzzWhizz":x).
                map(x ->canBeDivided(x,35)?"BuzzWhizz":x).
                map(x ->canBeDivided(x,15)?"FizzBuzz":x).
                map(x ->canBeDivided(x,21)?"FizzWhizz":x).
                map(x ->canBeDivided(x,3)?"Fizz":x).
                map(x ->canBeDivided(x,5)?"Buzz":x).
                map(x ->canBeDivided(x,7)?"Whizz":x).collect(Collectors.toList());
    }

    private boolean canBeDivided(String integer, int i) {
        if (isMatches(integer)) {
            return Integer.parseInt(integer) % i == 0;
        }
        else return false;
    }

    private boolean isMatches(String x) {
        return Pattern.compile("[1-9][0-9]*").matcher(x).matches();
    }

    public List<String> getResults() {
        return results;
    }
}


