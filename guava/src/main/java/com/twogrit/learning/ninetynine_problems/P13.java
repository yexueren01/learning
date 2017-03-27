package com.twogrit.learning.ninetynine_problems;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.List;

public class P13 {
    public static<T> List<AbstractMap.SimpleEntry<Integer,T >> encode_direct(List<T> objectList) {
        List<AbstractMap.SimpleEntry<Integer,T >> simpleEntryList=new ArrayList<AbstractMap.SimpleEntry<Integer, T>>();
        T currentT=null;
        int currentTcounts=0;

        for (int i = 0; i < objectList.size(); i++) {
            T t = objectList.get(i);
            if(currentT==null){
                currentT=t;
            }
            if(t!=currentT){
                simpleEntryList.add(new AbstractMap.SimpleEntry<Integer, T>(currentTcounts,currentT));
                currentT=t;
                currentTcounts=0;
            }else if((i+1==objectList.size())){
                simpleEntryList.add(new AbstractMap.SimpleEntry<Integer, T>(currentTcounts+1,currentT));
            }
            currentTcounts++;
        }
        return simpleEntryList;
    }
}
