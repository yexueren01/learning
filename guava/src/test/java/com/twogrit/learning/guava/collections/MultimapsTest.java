package com.twogrit.learning.guava.collections;

import com.google.common.base.Function;
import com.google.common.base.Joiner;
import com.google.common.collect.ImmutableListMultimap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Multimaps;
import org.junit.Test;

import static com.google.common.base.Joiner.*;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;

/**
 * Created by kezhang on 17/3/9.
 */
public class MultimapsTest {

    @Test
    public void t() {
        ImmutableSet digits = ImmutableSet.of("zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine");
        Function<String, Integer> lengthFunction = new Function<String, Integer>() {
            public Integer apply(String string) {
                return string.length();
            }
        };
        ImmutableListMultimap<Integer, String> digitsByLength = Multimaps.index(digits, lengthFunction);
        assertThat(Joiner.on(",").withKeyValueSeparator(":").join(digitsByLength.asMap()), equalTo("4:[zero, four, five, nine],3:[one, two, six],5:[three, seven, eight]"));

    }
}
