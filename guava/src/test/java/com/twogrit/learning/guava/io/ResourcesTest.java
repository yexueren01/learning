package com.twogrit.learning.guava.io;

import com.google.common.io.FileWriteMode;
import com.google.common.io.Files;
import com.google.common.io.Resources;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.net.URL;

/**
 * Created by kezhang on 17/3/10.
 */
public class ResourcesTest {

    @Test
    public void testSlink() throws IOException {
        URL url = new URL("http://ifeve.com/google-guava-io/");
        System.out.println(url.getFile());
        File file = new File("./doc/a.txt");
        Resources.asByteSource(url).copyTo(Files.asByteSink(file, FileWriteMode.APPEND));
    }


//    @Test
//    public void testSource() throws IOException {
//        File file = new File("./doc/config.properties");
//        System.out.println(file.getAbsolutePath());
//
//        InputStream inputStream = Files.asByteSource(file).openStream();
//
//
//        Properties properties = new Properties();
//        properties.load(inputStream);
//        assertThat(properties.get("db.url"), equalTo("db.url.value"));
//    }

}
