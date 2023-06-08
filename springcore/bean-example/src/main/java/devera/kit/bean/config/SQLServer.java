package devera.kit.bean.config;

public class SQLServer {
    Connector connector;

    public SQLServer(Connector connector) {
        this.connector = connector;
    }

    public Connector getConnector() {
        return connector;
    }

    public void setConnector(Connector connector) {
        this.connector = connector;
    }

    
}
