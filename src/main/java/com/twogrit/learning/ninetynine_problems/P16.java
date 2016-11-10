package com.twogrit.learning.ninetynine_problems;

import com.google.common.collect.Lists;

import java.util.List;

public class P16 {
    public static <T> List<T> dropEveryNth(List<T> objList, int n) {
        if(n<=0) return  objList;
        List<T> tList = Lists.newArrayList();
        for (int j = 0; j < objList.size(); j++) {
            T t = objList.get(j);
            if ((j + 1) % n == 0) {
                continue;
            }
            tList.add(t);

        }
        return tList;
    }
}
