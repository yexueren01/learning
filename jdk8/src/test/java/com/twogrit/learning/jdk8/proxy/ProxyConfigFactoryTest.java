package com.twogrit.learning.jdk8.proxy;

import com.twogirt.learning.jdk8.proxy.jdkdefault.DefaultConfig;
import com.twogirt.learning.jdk8.proxy.jdkdefault.IConfig;
import com.twogirt.learning.jdk8.proxy.jdkdefault.ProxyConfigFactory;
import org.junit.Test;

import java.io.FileNotFoundException;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

/**
 * Created by kezhang on 17/1/19.
 */
public class ProxyConfigFactoryTest {

    @Test
    public void te() throws FileNotFoundException, InstantiationException, IllegalAccessException {
        ProxyConfigFactory proxyConfigFactory = new ProxyConfigFactory();
        IConfig config = proxyConfigFactory.getProxyInstance(new DefaultConfig());

        assertThat(config.dbUrl(), equalTo("defaultValue"));
        assertThat(config.isValidated(), equalTo(true));
        assertThat(config.poolSize(), equalTo(100));
    }

}
