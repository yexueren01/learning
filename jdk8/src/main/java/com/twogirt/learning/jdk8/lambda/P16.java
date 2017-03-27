package com.twogirt.learning.jdk8.lambda;

import java.util.AbstractMap;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class P16 {
    public static <T> List<T> dropEveryNth(List<T> list, int n) {
        if (n == 0) {
            return list;
        }
        return IntStream.range(0, list.size())
                .mapToObj(i -> new AbstractMap.SimpleEntry<T, Integer>(list.get(i), i))
                .filter(simpleEntity -> (simpleEntity.getValue() + 1) % 3 > 0)
                .map(simpleEntity -> simpleEntity.getKey()).collect(Collectors.toList());
    }
}
