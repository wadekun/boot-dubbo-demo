package com.jackliang.bddemo.provider.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * dubbo configuration
 *
 * @author liangck
 * @version 1.0
 * @since 16/4/26 17:43
 */
@Configuration
@ImportResource("classpath:config/dubbo-provider.xml")
public class DubboConfig {
}
