package devera.kit.bean.config;

import org.springframework.stereotype.Component;

@Component
public class Postgres {

    Connector connector;

    public Postgres(Connector connector) {
        this.connector = connector;
    }

    public Connector getConnector() {
        return connector;
    }

    public void setConnector(Connector connector) {
        this.connector = connector;
    }

    
    
}
