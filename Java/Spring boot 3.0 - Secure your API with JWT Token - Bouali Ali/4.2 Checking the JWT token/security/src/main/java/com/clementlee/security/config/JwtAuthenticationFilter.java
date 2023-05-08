package com.clementlee.security.config;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;

@Component // Spring annotation
@RequiredArgsConstructor // Lombok annotation
public class JwtAuthenticationFilter extends OncePerRequestFilter {

    @Override
    protected void doFilterInternal(
            @NonNull HttpServletRequest request, // our request
            @NonNull HttpServletResponse response, // our response
            @NonNull FilterChain filterChain)
            throws ServletException, IOException {
        final String authHeader = request.getHeader("Authorization"); // extract JWT from authentication header named "Authorization"
        final String jwt;
        if (authHeader == null | !authHeader.startsWith("Bearer ")){ // if authentication header is empty or does not starts with "Bearer "
            filterChain.doFilter(request, response); // pass request and response to the next filter
            return; // return to end the method
        }
        jwt = authHeader.substring(7); // 7 to get substring after "Bearer "

    }

}
