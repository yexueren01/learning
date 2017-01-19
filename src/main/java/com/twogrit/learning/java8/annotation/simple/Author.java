package com.twogrit.learning.java8.annotation.simple;

import java.lang.annotation.*;

/**
 * Created by kezhang on 17/1/19.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Documented
public @interface Author {
    String name() default "ke.zhang";
    String group() default "com.alipay";
}
