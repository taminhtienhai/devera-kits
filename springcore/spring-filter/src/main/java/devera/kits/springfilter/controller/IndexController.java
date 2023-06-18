package devera.kits.springfilter.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class IndexController {
    
    @GetMapping("/index")
    public String index() {
        return "hello";
    }

    @GetMapping("/general")
    public String general() {
        return "hello";
    }
}
