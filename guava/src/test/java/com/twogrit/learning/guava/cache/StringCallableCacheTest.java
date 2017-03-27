package com.twogrit.learning.guava.cache;

import org.junit.Before;
import org.junit.Test;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

/**
 * Created by kezhang on 17/3/8.
 */
public class StringCallableCacheTest {

    StringCallableCache stringCallableCache = new StringCallableCache();

    @Before
    public void setUp() {
        stringCallableCache.cache.put("nocallkey", "nocalvalue");
        stringCallableCache.cache.put("nocallkey0", "nocalvalue0");

    }

    @Test
    public void test() {
        assertThat(stringCallableCache.get("nocallkey"), equalTo("nocalvalue"));
        assertThat(stringCallableCache.get("nocallkey0"), equalTo("nocalvalue0"));
        assertThat(stringCallableCache.get("aaa"), equalTo("callaaa"));
    }
}
