package devera.kits.database.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import jakarta.persistence.EntityManagerFactory;

@Configuration
@EnableJpaRepositories(
    basePackages = "devera.kits.database.repository"
)
@EnableTransactionManagement
public class MySQL {
    
    @Bean
    public DataSource dataSource() {
        var builder = DataSourceBuilder.create();

        // builder.driverClassName("com.mysql.cj.jdbc.Driver");
        builder.username("root");
        builder.password("12345678");
        builder.url("jdbc:mysql://127.0.0.1:4306/devera");

        return builder.build();
    }

    @Bean
    public LocalContainerEntityManagerFactoryBean entityManagerFactory() {
        var container = new LocalContainerEntityManagerFactoryBean();

        container.setDataSource(dataSource());
        container.setPackagesToScan("devera.kits.database.model");
        container.setJpaVendorAdapter(new HibernateJpaVendorAdapter());
        container.setJpaProperties(additionProperties());

        return container;
    }

    @Bean
    public JpaTransactionManager transactionManager(EntityManagerFactory factory) {
        final JpaTransactionManager transactionManager = new JpaTransactionManager();
        transactionManager.setEntityManagerFactory(factory);
        return transactionManager;
    }

    final Properties additionProperties() {
        var props = new Properties();

        props.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQLDialect");
        props.setProperty("hibernate.show_sql", "true");
        props.setProperty("hibernate.hbm2ddl.auto", "update");

        return props;
    }
}
