package com.twogrit.learning.guava.collections;

import com.google.common.base.Joiner;
import com.google.common.collect.HashMultiset;
import com.google.common.collect.Multiset;
import com.google.common.collect.Multisets;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

/**
 * Created by kezhang on 17/3/9.
 */
public class MultisetsTest {

    @Test
    public void testEqual() {
        Multiset multiset = HashMultiset.create();
        multiset.add("a", 2);
        multiset.add("b", 2);


        Multiset multiset0 = HashMultiset.create();

        multiset0.add("b", 2);
        multiset0.add("a", 2);

        assertThat(multiset, equalTo(multiset0));

    }

    @Test
    public void multi() {
        Multiset multiset = HashMultiset.create();
        multiset.add("a", 2);
        multiset.add("b", 2);
        assertThat(Joiner.on(",").join(multiset), equalTo("a,a,b,b"));

    }
}
