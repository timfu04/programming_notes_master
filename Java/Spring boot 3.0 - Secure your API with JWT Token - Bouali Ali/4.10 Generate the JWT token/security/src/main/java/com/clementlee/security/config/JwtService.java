package com.clementlee.security.config;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import java.security.Key;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

@Service
public class JwtService {

    private static final String SECRET_KEY = "576E5A7234753778214125442A472D4B614E645267556B58703273357638792F";

    public String extractUsername(String token) {
        return extractClaim(token, Claims::getSubject); // call getSubject method for given Claims object (subject usually refers username or email)
    }

    // extract a single claim
    // "Function<Claims, T>" means take Claims object as input, and return T (generic type) as output
    public <T> T extractClaim(String token, Function<Claims, T> claimsResolver){
        final Claims claims = extractAllClaims(token);
        return claimsResolver.apply(claims);
    }

    // Method overloading
    // Generate token without extra claims
    public String generateToken(UserDetails userDetails){
        return generateToken(new HashMap<>(), userDetails); // pass empty hashmap to exclude extra claims
    }

    public String generateToken(Map<String, Object> extraClaims, UserDetails userDetails){
        return Jwts
                .builder()
                .setClaims(extraClaims)
                .setSubject(userDetails.getUsername()) // subject usually refers username or user email
                .setIssuedAt(new Date(System.currentTimeMillis())) // issued/created at current time in milliseconds
                .setExpiration(new Date(System.currentTimeMillis() + 1000 * 60 * 60 * 24)) // will expire after 1 day (1000ms *60 *60 *24 = 24hours)
                .signWith(getSignInKey(), SignatureAlgorithm.HS256) // signing key and hashing algorithm
                .compact(); // generate the token
    }

    private Claims extractAllClaims(String token){
        return Jwts
                .parserBuilder()
                .setSigningKey(getSignInKey()) // set signing key, required to verify the signature of existing token
                .build()
                .parseClaimsJws(token)
                .getBody();
    }

    private Key getSignInKey() {
        byte [] keyBytes = Decoders.BASE64.decode(SECRET_KEY);
        return Keys.hmacShaKeyFor(keyBytes);
    }

}