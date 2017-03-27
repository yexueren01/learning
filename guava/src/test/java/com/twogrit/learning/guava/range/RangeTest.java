package com.twogrit.learning.guava.range;

import com.google.common.collect.*;
import org.junit.Test;

import java.util.Iterator;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

/**
 * Created by kezhang on 17/3/9.
 */
public class RangeTest {

    @Test
    public void iterablesFilter() {
        List<Integer> scores = Lists.newArrayList(1, 2, 3, 4, 5, 6, 7, 8);
        int median = 5;
        Iterator belowMedian = Iterables.filter(scores, Range.lessThan(median)).iterator();
        assertThat(Lists.newArrayList(belowMedian), equalTo(Lists.newArrayList(1, 2, 3, 4)));
    }

    @Test
    public void testRangeInteger() {
        Range validGrades = Range.closed(1, 2);
        ContiguousSet<Integer> set = ContiguousSet.create(validGrades, DiscreteDomain.integers());
        assertThat(Lists.newArrayList(set), equalTo(Lists.newArrayList(1, 2)));

    }


}
