package com.twogrit.learning.jdk8.lambda;

import com.twogirt.learning.jdk8.lambda.P16;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.hasSize;
import static org.junit.Assert.assertThat;

public class P16Test {
    @Test
    public void shouldDropEveryNthElement() throws Exception {
        List<String> result = P16.dropEveryNth(Arrays.asList("a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k"), 3);
        assertThat(result, hasSize(8));
        assertThat(result, contains("a", "b", "d", "e", "g", "h", "j", "k"));
    }


}
