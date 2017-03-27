package com.twogirt.learning.jdk8.lambda;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class P19 {
    public static <T> List<T> rotate(List<T> list, int i) {
        if(i<0)i=list.size()+i;
        return Stream.of(P18.slice(list, i +1, list.size() + 1), P18.slice(list, 0, i )).flatMap(e -> e.stream()).collect(Collectors.toList());
    }
}
