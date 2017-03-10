package com.twogrit.learning.guava.io;

import com.google.common.io.ByteStreams;
import com.google.common.io.FileWriteMode;
import com.google.common.io.Files;
import com.google.common.io.Resources;
import org.junit.Test;

import java.io.File;
import java.io.IOException;

/**
 * Created by kezhang on 17/3/10.
 */
public class ResourcesTest {

    @Test
    public void test() throws IOException {
        File file = new File("./doc/a.txt");
        System.out.println(file.getAbsolutePath());
        Files.asByteSink(file, FileWriteMode.APPEND).write("aaa".getBytes());
    }
}
