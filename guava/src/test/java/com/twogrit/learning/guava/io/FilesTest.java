package com.twogrit.learning.guava.io;

import com.google.common.io.FileWriteMode;
import com.google.common.io.Files;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;

/**
 * Created by kezhang on 17/3/10.
 */
public class FilesTest {

    @Test
    public void testSlink() throws IOException {
        File file = new File("./doc/a.txt");
        System.out.println(file.getAbsolutePath());
        Files.asByteSink(file, FileWriteMode.APPEND).write("aaa".getBytes());
    }


    @Test
    public void testSource() throws IOException {
        File file = new File("./doc/config.properties");
        System.out.println(file.getAbsolutePath());

        InputStream inputStream = Files.asByteSource(file).openStream();
        Properties properties = new Properties();
        properties.load(inputStream);
        assertThat(properties.get("db.url"), equalTo("db.url.value"));
    }

}
