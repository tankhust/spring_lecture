package com.tank.boot.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author tank
 * @create 2019/12/18 14:36
 */
@Configuration
public class MyConfig {

    @Bean
    public MyConfigBean myConfigBean() {
        return new MyConfigBean();
    }
}
