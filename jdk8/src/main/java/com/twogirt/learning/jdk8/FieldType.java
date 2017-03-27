package com.twogirt.learning.jdk8;

/**
 * Created by kezhang on 17/1/19.
 */
public enum FieldType {
    STRING {
        @Override
        public  String parse(Object obj) {
            return (String) obj;
        }
    }, INT {
        @Override
       public Integer parse(Object obj) {
            return (Integer) obj;
        }
    }, BOOLEAN {
        @Override
        public Boolean parse(Object obj) {
            return (Boolean) obj;
        }
    };


    public abstract <T> T parse(Object obj);
}
