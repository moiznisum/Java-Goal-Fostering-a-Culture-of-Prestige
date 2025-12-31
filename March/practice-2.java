package com.example.demo.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CustomConfig {

    @Bean
    @ConditionalOnClass(name = "com.example.demo.SomeOptionalService")
    public String optionalServiceBean() {
        return "This bean is created only if SomeOptionalService is on the classpath";
    }
}
