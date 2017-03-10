package com.twogrit.learning.guava.concurrent;

import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/**
 * Created by kezhang on 17/3/10.
 */
public class JarUpdateParamsCallable implements Callable<String> {
    JarUpdateParams jarUpdateParams;

    public JarUpdateParamsCallable(JarUpdateParams jarUpdateParams) {
        this.jarUpdateParams = jarUpdateParams;
    }

    @Override
    public String call() throws Exception {
        System.out.println("jarUpdateParams.name[" + jarUpdateParams.getName() + "] call execute..");
        TimeUnit.SECONDS.sleep(5);
         System.out.println("jarUpdateParams.name[" + jarUpdateParams.getName()  + "] 5s later");
         return jarUpdateParams.getName();
    }

}
