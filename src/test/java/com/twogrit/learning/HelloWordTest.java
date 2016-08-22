package com.twogrit.learning;

import org.junit.Assert;
import org.junit.Test;

public class HelloWordTest {
    private HelloWord helloWord=new HelloWord();

    @Test
    public void shouldSayHello(){
        Assert.assertEquals("Hello yexueren01", helloWord.sayHello("yexueren01"));
    }

}
