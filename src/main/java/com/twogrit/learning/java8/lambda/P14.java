package com.twogrit.learning.java8.lambda;

import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class P14 {
    public static <T> List<T> duplicate(List<T> objList) {
        return objList.stream().flatMap(e -> Stream.of(e, e)).collect(toList());
    }

    public static <T> List<T> duplicate(List<T> objList, int times) {
        return objList.stream().flatMap(e -> Collections.nCopies(times, e).stream()).collect(toList());
    }
}
