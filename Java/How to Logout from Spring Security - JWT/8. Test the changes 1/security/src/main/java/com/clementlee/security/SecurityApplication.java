package com.clementlee.security;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Arrays;

@SpringBootApplication
public class SecurityApplication {

	public static void main(String[] args) {
//		SpringApplication.run(SecurityApplication.class, args);

		// print all beans in application context
		ConfigurableApplicationContext context = SpringApplication.run(SecurityApplication.class, args);
		System.out.println();
//		Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
	}

}
