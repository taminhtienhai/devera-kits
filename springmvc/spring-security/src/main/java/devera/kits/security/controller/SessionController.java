package devera.kits.security.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpSession;

@RequestMapping("/session")
@RestController
public class SessionController {

    @GetMapping
    public Map<String, Object> session(HttpSession session) {
        var attrs = session.getAttributeNames();
        Map<String, Object> results = new HashMap<>();
        while (attrs.hasMoreElements()) {
            String attrName = attrs.nextElement();
            results.put(attrName, session.getAttribute(attrName));
        }
        return results;
    }
}
