package com.twogrit.learning.guava.primitives;

import com.google.common.collect.Lists;
import com.google.common.primitives.Ints;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

/**
 * Created by kezhang on 17/4/21.
 */
public class IntsTest {

    @Test
    public void t(){
        assertThat(Ints.asList(1,2,3),equalTo(Lists.newArrayList(1,2,3)) );
    }
}
