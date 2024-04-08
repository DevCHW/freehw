package com.nemam.support;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;

import java.security.Key;
import java.util.Date;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class JwtUtil {

    private JwtUtil() {

    }

    public static String createToken(CreateTokenParam tokenParam, String secretKey, Long expiredMs) {
        Key key = generateKey(secretKey);
        return Jwts.builder()
                .claims(createClaims(tokenParam))
                .signWith(key)
                .compact();
    }

    private static Map<String, Object> createClaims(CreateTokenParam tokenParam) {
        Map<String, Object> claimMap = new ConcurrentHashMap<>();
        claimMap.put("id", tokenParam.getId());
        claimMap.put("email", tokenParam.getEmail());
        claimMap.put("name", tokenParam.getName());
        return claimMap;
    }

    private static Key generateKey(String secretKey) {
        return Keys.hmacShaKeyFor(secretKey.getBytes());
    }

}
