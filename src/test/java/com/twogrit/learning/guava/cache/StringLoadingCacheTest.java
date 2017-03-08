package com.twogrit.learning.guava.cache;

import org.junit.Before;
import org.junit.Test;

import java.util.concurrent.ExecutionException;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;

/**
 * Created by kezhang on 17/3/8.
 */
public class StringLoadingCacheTest {
    StringLoadingCache stringLoadingCache = new StringLoadingCache();

    @Before
    public void setUp() {
        stringLoadingCache.graphs.put("notDb", "notDbValue");
        stringLoadingCache.graphs.put("notDb0", "notDbValue0");
    }

    @Test
    public void test() throws ExecutionException, InterruptedException {
        assertThat(stringLoadingCache.graphs.get("notDb"), equalTo("notDbValue"));
        assertThat(stringLoadingCache.graphs.get("notDb0"), equalTo("notDbValue0"));
        Thread.sleep(4000L);
        assertThat(stringLoadingCache.graphs.get("notDb"), equalTo("dbnotDb"));
        assertThat(stringLoadingCache.graphs.get("notDb"), equalTo("dbnotDb"));

    }

}
