package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyCustomAutoConfig {

    @Bean
    public String customBean() {
        return "Custom auto-configured bean";
    }
}
