package com.jackliang.bddemo.provider;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.core.env.Environment;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @author liangck
 * @version 1.0
 * @since 16/4/26 17:22
 */
@SpringBootApplication
public class ProviderApplication extends SpringBootServletInitializer implements EmbeddedServletContainerCustomizer{

    private static final Logger LOGGER = LoggerFactory.getLogger(ProviderApplication.class);

    @Override
    public void customize(ConfigurableEmbeddedServletContainer configurableEmbeddedServletContainer) {

    }

    public static void main(String[] args) throws UnknownHostException{
        Environment env = SpringApplication.run(ProviderApplication.class, args).getEnvironment();
        String port = env.getProperty("server.port", "8080");

        LOGGER.info("Access URLS:\n--------------------------------------------\n\t"
                        + "Local: \t http://127.0.0.1:{}\n\t"
                        + "External: \thttp://{}:{}",
                port,
                InetAddress.getLocalHost().getHostAddress(),
                port);
    }
}
