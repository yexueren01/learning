package com.twogrit.learning.regex;

import org.junit.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

/**
 * Created by kezhang on 17/1/24.
 */
public class RegexSpealWordTest {
    String str = "abcABC.\"a'a(a)";

    @Test
    public void test() {
      //  assertThat(Pattern.compile("(\\(a\\))").matcher(str).group(1), equalTo("(a)"));
    }
}
