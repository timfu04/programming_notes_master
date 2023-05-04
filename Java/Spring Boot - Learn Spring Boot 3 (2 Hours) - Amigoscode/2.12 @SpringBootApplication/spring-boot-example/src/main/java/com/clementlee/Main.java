package com.clementlee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//@SpringBootApplication

// "@SpringBootApplication" the three annotations below combined
@ComponentScan(basePackages = "com.clementlee") // tells it which package to look for components
@EnableAutoConfiguration
@Configuration

@RestController
public class Main {

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

    @GetMapping("/greet") // http://localhost:8080/greet
    public String greet(){
        return "Hello";
    }

}