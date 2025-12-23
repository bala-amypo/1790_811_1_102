    package com.example.demo.security;

    import org.springframework.stereotype.Component;

    @Component
    public class JwtProperties {

        private final String secret = "yourSecretKey12345"; // replace with your actual secret

        private final long expiration = 3600000;

        private final String tokenPrefix = "Bearer ";

        private final String header = "Authorization";

        public String getSecret() {
            return secret;
        }

        public long getExpiration() {
            return expiration;
        }

        public String getTokenPrefix() {
            return tokenPrefix;
        }

        public String getHeader() {
            return header;
        }
    }
