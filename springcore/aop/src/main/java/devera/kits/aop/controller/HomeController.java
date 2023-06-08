package devera.kits.aop.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    
    @GetMapping("/")
    public String index() throws InterruptedException {
        Thread.sleep(1_000);
        return "hello world 123";
    }
}
