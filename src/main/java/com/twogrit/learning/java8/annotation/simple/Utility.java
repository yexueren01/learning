package com.twogrit.learning.java8.annotation.simple;

/**
 * Created by kezhang on 17/1/19.
 */
@Description
public class Utility {
    @Author
    public String work() {
        return "work over!";
    }

    @Author(name = "changedName", group = "com.out")
    public String offWork() {
        return "off work!";
    }
}
