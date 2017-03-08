package com.twogrit.learning.guava.cache;

import com.google.common.cache.*;

import java.util.concurrent.TimeUnit;

/**
 * http://ifeve.com/google-guava-cachesexplained/
 * Created by kezhang on 17/3/8.
 */
public class StringLoadingCache {
    LoadingCache<String, String> graphs = CacheBuilder.newBuilder()
            .maximumSize(1000)
            .expireAfterWrite(3, TimeUnit.SECONDS)
            .removalListener(new RemovalListener<String, String>() {
                @Override
                public void onRemoval(RemovalNotification<String, String> removalNotification) {
                    System.out.println(removalNotification.getCause().toString() + ":" + removalNotification.getKey() + ":" + removalNotification.getValue());
                }
            })
            .build(new CacheLoader<String, String>() {
                       @Override
                       public String load(String key) throws Exception {
                           return getFromDb(key);
                       }
                   }
            );


    public String getFromDb(String key) {
        System.out.println("from db");
        return "db" + key;

    }


}
