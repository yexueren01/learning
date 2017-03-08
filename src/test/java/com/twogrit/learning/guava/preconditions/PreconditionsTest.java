package com.twogrit.learning.guava.preconditions;

import org.junit.Test;

import static com.google.common.base.Preconditions.checkArgument;
import static com.google.common.base.Preconditions.checkNotNull;

/**
 * Created by kezhang on 17/3/8.
 */
public class PreconditionsTest {

    @Test(expected = NullPointerException.class)
    public void test() {
        checkNotNull(null, "id can not null");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testArg() {
        checkArgument(100 < 1, "id can not null");
    }
}
