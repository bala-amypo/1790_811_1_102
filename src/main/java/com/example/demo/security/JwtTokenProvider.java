package com.example.demo.security;

import org.springframework.stereotype.Component;

@Component
public class JwtTokenProvider {

    private final String SECRET_KEY = "mySecretKey"; // In real app, use application.properties

    public String generateToken(String username) {
        return username + "-token"; // Dummy token for now
    }

    public String getUsernameFromToken(String token) {
        return token.replace("-token", "");
    }
}
