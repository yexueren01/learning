package com.twogrit.learning.guava.concurrent.service;

import com.google.common.util.concurrent.AbstractScheduledService;

import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * Created by kezhang on 17/4/27.
 */
public class AbstractScheduledServiceImpl extends AbstractScheduledService {
    @Override
    protected void runOneIteration() throws Exception {
        System.out.println(new Date().getTime());

    }

    @Override
    protected Scheduler scheduler() {
       return  AbstractScheduledService.Scheduler.newFixedDelaySchedule(10L,10L, TimeUnit.SECONDS);
        // AbstractScheduledService.Scheduler.newFixedRateSchedule();
      //  return null;
    }
}
