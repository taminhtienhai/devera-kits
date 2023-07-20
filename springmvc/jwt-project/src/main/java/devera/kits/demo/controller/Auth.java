package devera.kits.demo.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.auth0.jwt.interfaces.Claim;
import com.auth0.jwt.interfaces.DecodedJWT;

import devera.kits.demo.model.User;
import devera.kits.demo.service.JwtService;
import devera.kits.demo.service.UserService;

@RestController
@RequestMapping("/")
public class Auth {

    UserService userService;
    JwtService jwt;
    
    public Auth(UserService userService, JwtService jwt) {
        this.userService = userService;
        this.jwt = jwt;
    }

    @GetMapping("/login")
    public Map<?,?> login() {
        return userService.getByUserName("michele");
    }

    @PostMapping("/login")
    public String token(@RequestBody User user) {
        return jwt.generateToken(user);
    }

    @GetMapping("/verify/{token}")
    public DecodedJWT verify(@PathVariable("token") String token) {
        return jwt.verify(token);
    }
}
