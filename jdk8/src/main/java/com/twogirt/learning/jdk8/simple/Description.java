package com.twogirt.learning.jdk8.simple;

import java.lang.annotation.*;

/**
 * Created by kezhang on 17/1/19.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
public @interface Description {
    String value() default "default des";
}
