package com.twogrit.learning.jdk8.lambda;

import com.twogirt.learning.jdk8.lambda.P17;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static org.hamcrest.Matchers.contains;
import static org.junit.Assert.assertThat;

public class P17Test {
    @Test
    public void shouldSplitInTwoHalves() throws Exception {
        Map<Boolean, List<String>> result = P17.split(Arrays.asList("a", "b", "c", "d", "e", "f", "g", "h", "i", "k"), 3);
        assertThat(result.get(true), contains("a", "b", "c"));
        assertThat(result.get(false), contains("d", "e", "f", "g", "h", "i", "k"));
    }
}
