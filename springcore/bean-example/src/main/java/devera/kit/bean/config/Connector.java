package devera.kit.bean.config;

import org.springframework.stereotype.Component;

@Component
public class Connector {
    public void getConnection() {
        System.out.println("Connection establish");
    }
}
