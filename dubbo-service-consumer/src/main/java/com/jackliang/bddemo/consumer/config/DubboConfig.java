package com.jackliang.bddemo.consumer.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * @author liangck
 * @version 1.0
 * @since 16/4/28 13:55
 */
@Configuration
@ImportResource("classpath:config/dubbo-consumer.xml")
public class DubboConfig {
}
