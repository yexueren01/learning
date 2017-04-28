package com.twogrit.learning.guava.strings;

import com.google.common.base.CharMatcher;
import org.junit.Test;

/**
 * Created by kezhang on 17/4/21.
 */
public class CharMatcherTest {
    String string="  abc       2 dd3##cc$$%%,a  ";

    @Test
    public void test() {


        String noControl = CharMatcher.javaIsoControl().removeFrom(string); //移除control字符
        String theDigits = CharMatcher.digit().retainFrom(string); //只保留数字字符
        String spaced = CharMatcher.whitespace().trimAndCollapseFrom(string, ' ');
//去除两端的空格，并把中间的连续空格替换成单个空格
        String noDigits = CharMatcher.javaDigit().replaceFrom(string, "*"); //用*号替换所有数字
        String lowerAndDigit = CharMatcher.javaDigit().or(CharMatcher.JAVA_LOWER_CASE).retainFrom(string);
// 只保留数字和小写字母

    }
}
