package com.twogrit.learning.java8.lambda;

import java.util.AbstractMap;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class P18 {
    public static <T> List<T> slice(List<T> list, int start, int end) {
        return IntStream.range(0, list.size())
                .mapToObj(i -> new AbstractMap.SimpleEntry<T, Integer>(list.get(i), i + 1))
                .filter(simpleEntry -> simpleEntry.getValue() >= start && simpleEntry.getValue() <= end)
                .map(simpleEntry -> simpleEntry.getKey())
                .collect(Collectors.toList());
    }
}
