package com.twogrit.learning.ninetynine_problems;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class P09 {
//    public static<T> List<List<T>> pack(List<T> objects) {
//        List<List<T>> packList= new ArrayList<List<T>>();
//        T compareObj=null;
//        List<T> subPackList=null;
//        for (int i = 0; i < objects.size(); i++) {
//            T object =  objects.get(i);
//            if (!Objects.equals(object,compareObj)) {
//                compareObj=object;
//                if(subPackList!=null&&subPackList.size()>0){
//                    packList.add((List<T>) subPackList.stream().collect(toList()));
//                }
//                subPackList=new ArrayList<T>();
//            }
//            subPackList.add(object);
//            if(i ==objects.size()-1){
//                packList.add((List<T>) subPackList.stream().collect(toList()));
//            }
//        }
//        return packList;
//    }

    public static <T> List<List<T>> pack(List<T> list) {
        T lastElement = null;
        List<List<T>> packedList = new ArrayList<List<T>>();
        List<T> elements = new ArrayList<T>();
        for (T el : list) {
            if (!Objects.equals(lastElement, el)) {
                elements = new ArrayList<T>();
                packedList.add(elements);
            }
            elements.add(el);
            lastElement = el;
        }
        return packedList;
    }



}
