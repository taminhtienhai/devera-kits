package devera.kits.demo.service;

import java.time.Duration;
import java.time.Instant;

import org.springframework.stereotype.Service;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTVerificationException;

import devera.kits.demo.model.User;

@Service
public class JwtService {

    Algorithm algorithm = Algorithm.HMAC256("secret");

    public String generateToken(User user) {
        return JWT.create().withClaim("u", user.username).withExpiresAt(Instant.now().plusSeconds(5)).sign(algorithm);
    }

    public boolean verify(String token) {
        try {
            var verifier = JWT.require(algorithm)
                    .withClaimPresence("u")
                    .acceptExpiresAt(5)
                    .build();

            var decoded = verifier.verify(token);
        } catch (JWTVerificationException e) {
            return false;
        } catch (Exception e) {
            System.out.println("Something else happened");
            return false;
        };
        return true;
    }
}
