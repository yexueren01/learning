package com.twogrit.learning.java8.annotation.process;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by kezhang on 17/1/19.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Assignment {
    String assign() default  "ke.zhang";
    int effort();
    double finished() default  0;
}
