package com.jackliang.bddemo.consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @author liangck
 * @version 1.0
 * @since 16/4/28 13:58
 */
@SpringBootApplication
public class ConsumerApplication {

    private static final Logger LOGGER = LoggerFactory.getLogger(ConsumerApplication.class);

    public static void main(String[] args) throws UnknownHostException {
        Environment env = SpringApplication.run(ConsumerApplication.class, args).getEnvironment();
        String port = env.getProperty("server.port", "8080");

        LOGGER.info("Access URLS:\n--------------------------------------------\n\t"
                        + "Local: \t http:127.0.0.1:{}\n\t"
                        + "External: \thttp://{}:{}",
                port,
                InetAddress.getLocalHost().getHostAddress(),
                port);
    }

}
