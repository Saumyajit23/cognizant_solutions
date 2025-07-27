package com.cognizant.jwt_auth_demo;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import javax.crypto.SecretKey;
import java.util.Base64;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@RestController
public class AuthenticationController {

    @GetMapping("/authenticate")
    public Map<String, String> authenticate(@RequestHeader(value = "Authorization", required = false) String authHeader) {
        if (authHeader == null || !authHeader.startsWith("Basic ")) {
            throw new RuntimeException("Missing or invalid Authorization header");
        }

        String username = extractUsername(authHeader);
        String token = generateJwt(username);

        Map<String, String> response = new HashMap<>();
        response.put("token", token);
        return response;
    }

    private String extractUsername(String authHeader) {
        String base64Credentials = authHeader.substring("Basic ".length());
        byte[] decodedBytes = Base64.getDecoder().decode(base64Credentials);
        String decoded = new String(decodedBytes);
        return decoded.split(":")[0];
    }

    private String generateJwt(String username) {
        // ✅ Key must be at least 32 characters for HMAC-SHA-256
        SecretKey key = Keys.hmacShaKeyFor("your-256-bit-secret-your-256-bit-secret".getBytes());

        return Jwts.builder()
                .setSubject(username)
                .setIssuedAt(new Date())
                .setExpiration(new Date(System.currentTimeMillis() + 20 * 60 * 1000)) // 20 mins
                .signWith(key)
                .compact();
    }
}
