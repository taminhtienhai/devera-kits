package devera.kits.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import devera.kits.demo.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

    UserService userService;
    
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public List<?> getAllUsers() {
        return userService.getAll();
    }
}
