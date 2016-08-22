package com.twogrit.ninetynine_problems;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.List;

public class P10 {
    public static<T> List<AbstractMap.SimpleEntry<Integer, T>> encode(List<T> strings) {
        List<List<T>>  listList= P09.pack(strings);
        List<AbstractMap.SimpleEntry<Integer, T>> simpleEntryList=new ArrayList<AbstractMap.SimpleEntry<Integer, T>>();
        for(List<T> list:listList){
            simpleEntryList.add(new AbstractMap.SimpleEntry(list.size(),list.get(0)));

        }
        return simpleEntryList;
    }
}
