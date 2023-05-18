package com.pokemonreview.api.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
            .csrf().disable()// disable CSRF for development
            .authorizeHttpRequests()
            .anyRequest().authenticated() // any request would need to be authenticated
            .and()
            .httpBasic(); // use HTTP instead of HTTPS

        return http.build();
    }
}
