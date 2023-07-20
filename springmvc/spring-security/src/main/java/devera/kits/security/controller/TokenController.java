package devera.kits.security.controller;


import java.time.Instant;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.jwt.Jwt;
import org.springframework.security.oauth2.jwt.JwtClaimsSet;
import org.springframework.security.oauth2.jwt.JwtEncoder;
import org.springframework.security.oauth2.jwt.JwtEncoderParameters;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
public class TokenController {

    JwtEncoder jwtEncoder;
    
    @GetMapping("/token/{username}")
    public String token(@PathVariable String username) {
        Instant now = Instant.now();
        JwtClaimsSet claims = JwtClaimsSet.builder()
            .issuer("me")
            .issuedAt(now)
            .expiresAt(now.plusSeconds(60))
            .subject(username)
            .claim("roles", "ADMIN")
            .build();
        return this.jwtEncoder.encode(JwtEncoderParameters.from(claims)).getTokenValue();
    }

    
    void print() {
        System.out.println("Hello");
    }

    @GetMapping("/token/jwt")
    public String sessionToken(@AuthenticationPrincipal Jwt jwt) {
        return jwt.getTokenValue();
    }
}