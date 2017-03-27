package com.twogirt.learning.jdk8.lambda;

import java.util.AbstractMap;
import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.mapping;
import static java.util.stream.Collectors.partitioningBy;
import static java.util.stream.Collectors.toList;

public class P17 {
    public static <T> Map<Boolean, List<T>> split(List<T> list, int index) {
        return IntStream.range(0, list.size())
                .mapToObj(i -> new AbstractMap.SimpleEntry<T, Integer>(list.get(i), i))
                .collect(partitioningBy(entry -> entry.getValue() < index, mapping(AbstractMap.SimpleEntry::getKey, toList())));
    }
}
