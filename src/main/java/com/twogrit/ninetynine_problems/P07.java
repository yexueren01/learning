package com.twogrit.ninetynine_problems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class P07 {

    public static <T> List<T> flatten(List<?> objects, Class<T> elementType) {
        List<T> flattenList = new ArrayList();
        P07.cun(flattenList, (List<T>) objects);
        return flattenList;
    }

    private static <T> void cun(List<T> flattenList, List<T> oList) {
        for (int i = 0; i < oList.size(); i++) {
            Object o = oList.get(i);
            if (o instanceof List) {
                P07.cun(flattenList, (List) o);
            } else {
                flattenList.add((T) o);
            }
        }
    }

}
