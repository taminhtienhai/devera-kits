package devera.kit.bean.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import devera.kit.bean.interfaces.Game;
import devera.kit.bean.model.games.Left4Dead;

@Configuration
public class BeanFactory {

    @Bean
    public MySQL connectDatabase() {
        return new MySQL("username", "@password");
    }

    @Bean
    public SQLServer sqlServer(Connector connector) {
        return new SQLServer(connector);
    }

    @Bean(name = "l4d")
    public Game leaf4Dead() {
        return new Left4Dead();
    }
}
