package com.twogrit.learning.regex;

import org.junit.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

/**
 * Created by kezhang on 17/1/24.
 */
public class RegexGroupTest {
    String a = "aaaa(ccc)ddd(ee)";

    @Test
    public void simpleTest() {

        // 按指定模式在字符串查找
        String line = "dog";
        String pattern = "((d)((o)(g)))";
        // 创建 Pattern 对象
        Pattern r = Pattern.compile(pattern);
        // 现在创建 matcher 对象
        Matcher m = r.matcher(line);
        assertThat(m.groupCount(),
                equalTo(5));
        //按左括号记共5个分别为 （dog) (d) (og) (o) (g) ,0为origin
        if (m.find()) {
            System.out.println("0Found value: " + m.group(0));

            System.out.println("1Found value: " + m.group(1));
            System.out.println("2Found value: " + m.group(2));
            System.out.println("3Found value: " + m.group(3));
            System.out.println("3Found value: " + m.group(4));
            System.out.println("3Found value: " + m.group(5));

        } else {
            System.out.println("NO MATCH");
        }

    }

    public void test() {

        // 按指定模式在字符串查找
        String line = "This order was placed for QT3000! OK?";
        /* group 3:1,2,3:(\\D*)，(\\d+)，(.*) :所有非数字【0，无穷大），数字【1，到无穷大），任意
           0是原先的字符串
         */
        String pattern = "(\\D*)(\\d+)(.*)";

        // 创建 Pattern 对象
        Pattern r = Pattern.compile(pattern);

        // 现在创建 matcher 对象
        Matcher m = r.matcher(line);
        if (m.find()) {
            System.out.println("Found value: " + m.group(0));
            System.out.println("Found value: " + m.group(1));
            System.out.println("Found value: " + m.group(2));
            System.out.println("Found value: " + m.group(3));
        } else {
            System.out.println("NO MATCH");
        }
    }

}
