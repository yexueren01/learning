package com.twogrit.learning.guava.listenableFuture;

import com.google.common.collect.Lists;
import com.google.common.util.concurrent.ListenableFuture;
import com.twogrit.learning.guava.concurrent.JarUpdateParams;
import com.twogrit.learning.guava.concurrent.JarUpdateParamsCallable;
import com.twogrit.learning.guava.concurrent.JarUpdateTaskCreaterListeningExecutorService;
import org.junit.Test;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/**
 * Created by kezhang on 17/3/10.
 */
public class JarUpdateTaskCreaterListeningExecutorServiceTest {
    JarUpdateTaskCreaterListeningExecutorService jarUpdateTaskCreaterListeningExecutorService = new JarUpdateTaskCreaterListeningExecutorService();

    @Test
    public void test() throws InterruptedException, ExecutionException {
        //  List<ListenableFuture<String>> listenableFutureList = Lists.newArrayList();
        for (int i = 0; i < 10; i++) {
            jarUpdateTaskCreaterListeningExecutorService.submit(new JarUpdateParams(Integer.toString(i)));
        }

        //WEB 程序中不用 sleep主线程一直在
        TimeUnit.SECONDS.sleep(11);


    }
}
