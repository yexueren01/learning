package com.twogrit.learning.guava.concurrent.service;

import com.google.common.util.concurrent.AbstractExecutionThreadService;

/**
 * Created by kezhang on 17/4/27.
 */
public class AbstractExecutionThreadServiceImpl extends AbstractExecutionThreadService {
    @Override
    protected void run() throws Exception {
        while (isRunning()) {
            // perform a unit of work
            System.out.println("test");
            this.stopAsync();
        }
    }
}
