package com.twogrit.learning.guava.concurrent;

import com.google.common.util.concurrent.*;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;

/**
 * Created by kezhang on 17/3/10.
 */
public class JarUpdateTaskCreaterListeningExecutorService {

    ListeningExecutorService executorService = MoreExecutors.listeningDecorator(Executors.newCachedThreadPool());

    public ListenableFuture<String>    submit(JarUpdateParams jarUpdateParams) throws ExecutionException, InterruptedException {

        JarUpdateParamsCallable jarUpdateParamsCallable =new JarUpdateParamsCallable(jarUpdateParams );
        final ListenableFuture<String> listenableFuture = executorService.submit(jarUpdateParamsCallable);
        Futures.addCallback(listenableFuture, new JarUpdateCreatedFutureCallback(jarUpdateParams));
        return  listenableFuture;
    }
}
