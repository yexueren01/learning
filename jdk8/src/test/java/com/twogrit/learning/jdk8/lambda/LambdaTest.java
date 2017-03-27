package com.twogrit.learning.jdk8.lambda;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class LambdaTest {
    List<String> players;

    @Before
    public void setUp() {
        String[] atp = {"Rafael Nadal", "Novak Djokovic",
                "Stanislas Wawrinka",
                "David Ferrer", "Roger Federer",
                "Andy Murray", "Tomas Berdych",
                "Juan Martin Del Potro"};
        players = Arrays.asList(atp);
    }
    @Test
    public void testHelloWord() {
        Object o = (Runnable) () -> { System.out.println("Hello word!"); }; // correct

    }

    @Test
    public void test() {
       players.forEach((player) -> System.out.println(player + "; "));
    }
}
