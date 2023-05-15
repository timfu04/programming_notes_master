package com.clementlee.security.config;

import com.clementlee.security.token.TokenRepository;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.lang.NonNull;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;

@Component // Spring annotation
@RequiredArgsConstructor // Lombok's annotation (helps to depedency injection)
public class JwtAuthenticationFilter extends OncePerRequestFilter {

    private final JwtService jwtService;
    private final UserDetailsService userDetailsService;
    private final TokenRepository tokenRepository;

    @Override
    protected void doFilterInternal(
            @NonNull HttpServletRequest request, // our request
            @NonNull HttpServletResponse response, // our response
            @NonNull FilterChain filterChain)
            throws ServletException, IOException {
        // Ignore requests from "/api/v1/auth" to be processed with this filter
        if (request.getServletPath().contains("/api/v1/auth")) {
            filterChain.doFilter(request, response);
            return;
        }
        final String authHeader = request.getHeader("Authorization"); // extract JWT from authentication header named "Authorization"
        final String jwt;
        final String userEmail;
        if (authHeader == null | !authHeader.startsWith("Bearer ")){ // if authentication header is empty or does not starts with "Bearer "
            filterChain.doFilter(request, response); // pass request and response to the next filter
            return; // return to end the method
        }
        jwt = authHeader.substring(7); // 7 to get substring after "Bearer "
        userEmail = jwtService.extractUsername(jwt); // extract username(email) with method from JwtService class
        // "SecurityContextHolder.getContext().getAuthentication() == null" means user not yet authenticated
        // If we have user email and user not yet authenticated, check whether user is in database with UserDetailsService
        if (userEmail != null && SecurityContextHolder.getContext().getAuthentication() == null){
            UserDetails userDetails = this.userDetailsService.loadUserByUsername(userEmail); // get user details from database
            var isTokenValid = tokenRepository.findByToken(jwt)
                    .map(t -> !t.isExpired() && !t.isRevoked())
                    .orElse(false); // check token from request against database, whether still valid or not
            if (jwtService.isTokenValid(jwt, userDetails) && isTokenValid){ // check whether user valid or not with the token
                UsernamePasswordAuthenticationToken authToken = new UsernamePasswordAuthenticationToken(
                        userDetails,
                        null, // User don't have credentials, so null value
                        userDetails.getAuthorities()
                );
                authToken.setDetails( // enforce authentication token with request details
                        new WebAuthenticationDetailsSource().buildDetails(request)
                );
                SecurityContextHolder.getContext().setAuthentication(authToken);
            }
        }
        filterChain.doFilter(request, response);
    }

}
