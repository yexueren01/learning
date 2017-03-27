package com.twogrit.learning.ninetynine_problems;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import static java.util.Arrays.asList;

public class P12 {
    public static<T> List<T> decode(List  objectList) {
        List<T> tList=new ArrayList<T>();
        for (int i = 0; i < objectList.size(); i++) {
            Object o = objectList.get(i);
            tList.addAll(P12.<T>decodeSub(o));
        }
        return tList;
    }

    private static<T> List<T> decodeSub(Object o) {
        List<T> subTlist=new ArrayList<T>();
        if(o instanceof AbstractMap.SimpleEntry){
            AbstractMap.SimpleEntry<Integer,T>  simpleEntry=(AbstractMap.SimpleEntry<Integer,T>)o;
            for (int i=0;i<simpleEntry.getKey();i++){
                subTlist.add((T)simpleEntry.getValue());
            }
        }else {
             subTlist.add((T)o);
        }
        return  subTlist;
    }

}
