package com.twogrit.learning.java8.annotation.reflect;


import java.lang.annotation.*;

/**
 * Created by kezhang on 17/1/19.
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface ValueBind {

    FieldType type();
    String value();
}
