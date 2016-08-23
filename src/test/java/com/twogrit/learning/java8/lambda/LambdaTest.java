package com.twogrit.learning.java8.lambda;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LambdaTest {
    List<String> players;
    @Before
    public void setUp(){
        String[] atp = {"Rafael Nadal", "Novak Djokovic",
                "Stanislas Wawrinka",
                "David Ferrer","Roger Federer",
                "Andy Murray","Tomas Berdych",
                "Juan Martin Del Potro"};
          players =  Arrays.asList(atp);
    }
    @Test
    public void test(){
        players.forEach((player) -> System.out.println(player + "; "));
    }
}
