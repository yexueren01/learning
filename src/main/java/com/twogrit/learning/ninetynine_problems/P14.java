package com.twogrit.learning.ninetynine_problems;


import java.util.ArrayList;
import java.util.List;

public class P14 {
    public static <T> List<T> duplicate(List<T> objs) {
        return duplicate(objs, 2);
    }

    public static <T> List<T> duplicate(List<T> objs, int times) {
        List<T> list =  new ArrayList();
        for (int i = 0; i < objs.size(); i++) {
            T t = objs.get(i);
            list.addAll(times(t, times));
        }
        return list;
    }

    public static <T> List<T> times(T t, int times) {
        List<T> list =new ArrayList();
        for (int i = 0; i < times; i++) {
            list.add(t);
        }
        return list;
    }
}
