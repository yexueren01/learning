package com.twogrit.learning.guava.concurrent.service;

import org.junit.Test;

import java.util.concurrent.TimeUnit;

/**
 * Created by kezhang on 17/4/27.
 */
public class AbstractScheduledServiceImplTest {
    AbstractScheduledServiceImpl abstractScheduledService = new AbstractScheduledServiceImpl();

    @Test
    public void test() throws InterruptedException {
        abstractScheduledService.startAsync();
        TimeUnit.MINUTES.sleep(1);
    }
}
