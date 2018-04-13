package com.thoughtworks;

import org.junit.Before;
import org.junit.Test;
import org.mockito.internal.matchers.Equals;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.List;

public class FizzBuzzGameTest {

    private FizzBuzzGame fizzBuzzGame;
    private List<String> expectedResults;

    @Before
    public void setUp() throws Exception {
        expectedResults = Arrays.asList(
                "1", "2", "Fizz", "4", "Buzz", "Fizz", "Whizz", "8", "Fizz", "Buzz",
                "11", "Fizz", "Fizz", "Whizz", "FizzBuzz", "16", "17", "Fizz", "19", "Buzz",
                "FizzWhizz", "22", "Fizz", "Fizz", "Buzz", "26", "Fizz", "Whizz", "29", "Fizz",
                "Fizz", "Fizz", "Fizz", "Fizz", "Fizz", "Fizz", "Fizz", "Fizz", "Fizz", "Buzz",
                "41", "FizzWhizz", "Fizz", "44", "FizzBuzz", "46", "47", "Fizz", "Whizz", "Buzz",
                "Fizz", "52", "Fizz", "Fizz", "Buzz", "Whizz", "Fizz", "58", "59", "FizzBuzz",
                "61", "62", "Fizz", "64", "Buzz", "Fizz", "67", "68", "Fizz", "BuzzWhizz",
                "71", "Fizz", "Fizz", "74", "FizzBuzz", "76", "Whizz", "Fizz", "79", "Buzz",
                "Fizz", "82", "Fizz", "FizzWhizz", "Buzz", "86", "Fizz", "88", "89", "FizzBuzz",
                "Whizz", "92", "Fizz", "94", "Buzz", "Fizz", "97", "Whizz", "Fizz", "Buzz","101",
                "Fizz","Fizz","104","FizzBuzzWhizz"
        );
        fizzBuzzGame = new FizzBuzzGame();
    }

    @Test
    public void should_return_Fizz_when_have_3() {
        fizzBuzzGame.start(3);
        assertThat(expectedResults.subList(0,3).toArray(),new Equals(fizzBuzzGame.getResults().toArray()));
    }

    @Test
    public void should_return_three_different_zz() {
        fizzBuzzGame.start(9);
        assertThat(expectedResults.subList(0,9).toArray(),new Equals(fizzBuzzGame.getResults().toArray()));
    }

    @Test
    public void should_return_Fizz_include_3() {
        fizzBuzzGame.start(13);
        assertThat(expectedResults.subList(0,13).toArray(),new Equals(fizzBuzzGame.getResults().toArray()));
    }
    @Test
    public void should_return_FizzBuzz() {
        fizzBuzzGame.start(15);
        assertThat(expectedResults.subList(0,15).toArray(),new Equals(fizzBuzzGame.getResults().toArray()));
    }
    @Test
    public void should_return_FizzWhizz() {
        fizzBuzzGame.start(21);
        assertThat(expectedResults.subList(0,21).toArray(),new Equals(fizzBuzzGame.getResults().toArray()));
    }
    @Test
    public void should_return_Fizz_include3_and_can_be_divided_with_7or5() {
        fizzBuzzGame.start(35);
        assertThat(expectedResults.subList(0,35).toArray(),new Equals(fizzBuzzGame.getResults().toArray()));
    }
    @Test
    public void should_return_BuzzWhizz() {
        fizzBuzzGame.start(70);
        assertThat(expectedResults.subList(0,70).toArray(),new Equals(fizzBuzzGame.getResults().toArray()));
    }
    @Test
    public void should_return_FizzBuzzWhizz() {
        fizzBuzzGame.start(105);
        assertThat(expectedResults.subList(0,105).toArray(),new Equals(fizzBuzzGame.getResults().toArray()));
    }
}
