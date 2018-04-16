package com.thoughtworks;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class FizzBuzzGame {
    private List<String> results = new ArrayList<>();

    public void start(int count) {
        results = IntStream.rangeClosed(1, count).boxed().
                map(luckyNumberMap("Fizz")).
                map(map2FizzBuzzWhizz(105, "FizzBuzzWhizz")).
                map(map2FizzBuzzWhizz(35, "BuzzWhizz")).
                map(map2FizzBuzzWhizz(15, "FizzBuzz")).
                map(map2FizzBuzzWhizz(21, "FizzWhizz")).
                map(map2FizzBuzzWhizz(3, "Fizz")).
                map(map2FizzBuzzWhizz(5, "Buzz")).
                map(map2FizzBuzzWhizz(7, "Whizz")).collect(Collectors.toList());
    }

    private Function<Integer, String> luckyNumberMap(String fizz) {
        return x -> x.toString().indexOf('3') != -1 ? fizz : x.toString();
    }

    private Function<String, String> map2FizzBuzzWhizz(int i, String fizzBuzzWhizz) {
        return x -> canBeDivided(x, i) ? fizzBuzzWhizz : x;
    }

    private boolean canBeDivided(String integer, int i) {
        if (isMatches(integer))  return Integer.parseInt(integer) % i == 0;
         return false;
    }

    private boolean isMatches(String x) {
        return Pattern.compile("[1-9][0-9]*").matcher(x).matches();
    }

    public List<String> getResults() {
        return results;
    }
}


