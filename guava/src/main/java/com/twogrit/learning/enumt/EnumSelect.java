package com.twogrit.learning.enumt;

/**
 * Created by kezhang on 17/1/11.
 */
public class EnumSelect {

    public  static<T extends IEnum> T kOf(T[] es, String k){
        for(T t: es){
            if(k.equals(t.getK())) return t;
        }
        throw  new RuntimeException("can not found.");
    }

}
