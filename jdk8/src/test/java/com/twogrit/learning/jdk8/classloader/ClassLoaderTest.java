//package com.twogrit.learning.jdk8.classloader;
//
//import org.junit.Test;
//
//import java.io.IOException;
//import java.io.InputStream;
//import java.util.Properties;
//
///**
// * Created by kezhang on 17/3/27.
// */
//public class ClassLoaderTest {
//    @Test
//    public void test() throws IOException {
//        String PROPERTY_FILE_NAME = "/Users/kezhang/code/learning/guava/doc/config.properties";
//
//        Properties properties = new Properties();
//        ClassLoader classLoader = this.getClass().getClassLoader();
//        InputStream inputStream =
//                classLoader.getResourceAsStream(PROPERTY_FILE_NAME);
//        properties.load(inputStream);
//    }
//}
