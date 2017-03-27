package com.twogrit.learning.guava.cache;

import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;

/**
 * Created by kezhang on 17/3/8.
 */
public class StringCallableCache {

    Cache<String, String> cache = CacheBuilder.newBuilder()
            .maximumSize(1000)
            .build();

    // look Ma, no CacheLoader
    // If the key wasn't in the "easy to compute" group, we need to
    // do things the hard way.
    public String get(String key) {
        try {
            return cache.get(key, new Callable<String>() {
                @Override
                public String call() throws Exception {
                    System.out.println("key:" + key);
                    return "call" + key;
                }
            });
        } catch (ExecutionException e) {
            throw new RuntimeException((e));
        }
    }


}
