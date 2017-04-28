package com.twogrit.learning.guava.concurrent.service;

import org.junit.Test;

/**
 * Created by kezhang on 17/4/27.
 */
public class AbstractExecutionThreadServiceImplTest {

    AbstractExecutionThreadServiceImpl abstractExecutionThreadService = new AbstractExecutionThreadServiceImpl();

    @Test
    public void test() throws Exception {
        abstractExecutionThreadService.startAsync();
        abstractExecutionThreadService.run();
        System.out.println("main theard.");
       // TimeUnit.MILLISECONDS.sleep(1);
    }
}
