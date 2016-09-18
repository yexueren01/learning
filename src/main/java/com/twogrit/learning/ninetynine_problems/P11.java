package com.twogrit.learning.ninetynine_problems;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.List;

import static java.util.AbstractMap.*;

public class P11 {
    public static  List  encode_modified(List  objectList) {
        List<List>  packList= P09.pack(objectList);
        List list=new ArrayList();
        for (int i = 0; i < packList.size(); i++) {
            List subList = packList.get(i);
            if(1 == subList.size()){
                list.add(subList.get(0));
            }else {
                list.add(new SimpleEntry(subList.size(),subList.get(0)));
            }
        }
        return list;
    }
}
