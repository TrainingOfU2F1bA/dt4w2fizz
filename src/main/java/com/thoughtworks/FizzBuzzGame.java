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
        List<String> expectedResults = Arrays.asList(
                "1", "2", "Fizz", "4", "Buzz", "Fizz", "Whizz", "8", "Fizz", "Buzz",
                "11", "Fizz", "Fizz", "Whizz", "FizzBuzz", "16", "17", "Fizz", "19", "Buzz",
                "FizzWhizz", "22", "Fizz", "Fizz", "Buzz", "26", "Fizz", "Whizz", "29", "Fizz",
                "Fizz", "Fizz", "Fizz", "Fizz", "Fizz", "Fizz", "Fizz", "Fizz", "Fizz", "Buzz",
                "41", "FizzWhizz", "Fizz", "44", "FizzBuzz", "46", "47", "Fizz", "Whizz", "Buzz",
                "Fizz", "52", "Fizz", "Fizz", "Buzz", "Whizz", "Fizz", "58", "59", "FizzBuzz",
                "61", "62", "Fizz", "64", "Buzz", "Fizz", "67", "68", "Fizz", "BuzzWhizz",
                "71", "Fizz", "Fizz", "74", "FizzBuzz", "76", "Whizz", "Fizz", "79", "Buzz",
                "Fizz", "82", "Fizz", "FizzWhizz", "Buzz", "86", "Fizz", "88", "89", "FizzBuzz",
                "Whizz", "92", "Fizz", "94", "Buzz", "Fizz", "97", "Whizz", "Fizz", "Buzz", "101",
                "Fizz", "Fizz", "104", "FizzBuzzWhizz"
        );
        results = IntStream.rangeClosed(1, count).boxed().map(x -> x.toString()).map(x -> x.indexOf('3') != -1 ? "Fizz" : x).map(x -> {
            Integer integer = null;
            if (Pattern.compile("[1-9][0-9]*").matcher(x).matches()) integer = Integer.parseInt(x);
            if (integer == null) {
                return x;
            } else if (integer % 105 == 0) {
                return "FizzBuzzWhizz";
            } else if (integer % 35 == 0) {
                return "BuzzWhizz";
            } else if (integer % 15 == 0) {
                return "FizzBuzz";
            } else if (integer % 21 == 0) {
                return "FizzWhizz";
            } else if (integer % 3 == 0) {
                return "Fizz";
            } else if (integer % 5 == 0) {
                return "Buzz";
            } else if (integer % 7 == 0) {
                return "Whizz";
            } else {
                return x;
            }
        }).collect(Collectors.toList());
    }

    public List<String> getResults() {
        return results;
    }
}


