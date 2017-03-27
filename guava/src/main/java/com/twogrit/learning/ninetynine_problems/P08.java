package com.twogrit.learning.ninetynine_problems;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class P08 {
    public static<T> List<T> compress(List<T> strings) {
        List<T> compressedList=new ArrayList<T>();
        T compareObject=null;
        for (int i = 0; i < strings.size(); i++) {
            T element = strings.get(i);
            if(!Objects.equals(element,compareObject)){
                compressedList.add(element);
                compareObject=element;
            }
        }
        return compressedList;
    }
}
