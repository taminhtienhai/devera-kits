package devera.kits.demo.service;

import java.time.Instant;

import org.springframework.stereotype.Service;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTVerificationException;
import com.auth0.jwt.interfaces.DecodedJWT;

import devera.kits.demo.model.User;

@Service
public class JwtService {

    Algorithm algorithm = Algorithm.HMAC256("secret");

    public String generateToken(User user) {
        return JWT.create()
            .withClaim("username", user.username)
            .withExpiresAt(Instant.now().plusSeconds(60))
            .sign(algorithm);
    }

    public DecodedJWT verify(String token) {
        DecodedJWT decoded;
        try {
            var verifier = JWT.require(algorithm).build();

            decoded = verifier.verify(token);
        } catch (JWTVerificationException e) {
            return null;
        } catch (Exception e) {
            System.out.println("Something else happened");
            return null;
        };
        return decoded;
    }
}
