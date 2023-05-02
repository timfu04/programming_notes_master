package com.clementlee.contentcalendar.config;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

// bean definition methods (@Bean) must be within configuration(@Configuration) class
@Configuration
public class MyWebConfig {

    // "@Bean" is method-level annotation
    // "@Bean" indicate "restTemplate" method is a Spring-managed component (included in Application Context)
    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplateBuilder().build();
    }
}
