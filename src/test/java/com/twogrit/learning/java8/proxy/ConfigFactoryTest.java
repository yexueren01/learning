package com.twogrit.learning.java8.proxy;

import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

/**
 * Created by kezhang on 17/1/19.
 */
public class ConfigFactoryTest {

    @Test
    public void te() throws FileNotFoundException {
        File file = new File("doc/config.properties");
        System.out.println(file.getAbsolutePath());
        FileInputStream fileInputStream = new FileInputStream(file);
        IConfig config = ConfigFactory.create(fileInputStream);
        String dbUrl = config.dbUrl();
        assertThat(dbUrl, equalTo("db.url.value"));
//        boolean isLoginValidated = config.isValidated();
//        int dbPoolSize = config.poolSize();
    }

}
