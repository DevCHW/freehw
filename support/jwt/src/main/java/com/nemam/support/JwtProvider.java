package com.nemam.support;

import io.jsonwebtoken.*;
import io.jsonwebtoken.security.Keys;

import java.security.Key;

public class JwtProvider {

    private Key key;

    public JwtProvider(String secret) {
        this.key = Keys.hmacShaKeyFor(secret.getBytes());
    }

    public String createToken(Long userId, String name) {
        JwtBuilder builder = Jwts.builder().claim("userId", userId).claim("name", name);
        return builder.signWith(key, SignatureAlgorithm.HS256).compact();
    }

    public Claims getClaims(String token) {
        Claims claims = null;

        try {
            claims = Jwts.parser().setSigningKey(key).parseClaimsJws(token).getBody();
        }
        catch (ExpiredJwtException extoken) {
            // 만료된 토큰 예외라서 null로 리턴했음
        }
        return claims;
    }

}
