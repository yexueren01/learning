package com.twogrit.ninetynine_problems;

import java.util.ArrayList;
import java.util.List;

public class P07 {

    public static <T> List<T> flatten(List<?> objects, Class<T> elementType) {
        List<T> flattenList = new ArrayList();
        for (int i = 0; i < objects.size(); i++) {
            T t = (T)objects.get(i);
            if (t instanceof List) {
                flattenList.addAll(P07.flattenList((List<T>) t));
            } else {
                flattenList.add(t);
            }
        }
        return flattenList;
    }

    private static <T> List<T> flattenList(List<T> oList) {
        List<T> flattenList = new ArrayList();
        for (int i = 0; i < oList.size(); i++) {
            T t = oList.get(i);
            if (t instanceof List) {
                flattenList.addAll(P07.flattenList((List<T>) t));
            } else {
                flattenList.add(t);
            }
        }
        return flattenList;
    }

}
