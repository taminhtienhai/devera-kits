package devera.kits.demo.config;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.boot.jdbc.init.DataSourceScriptDatabaseInitializer;
import org.springframework.boot.sql.init.DatabaseInitializationMode;
import org.springframework.boot.sql.init.DatabaseInitializationSettings;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DatabaseConfig {

    @Bean
    DataSourceScriptDatabaseInitializer initDatabase() {
        return new DataSourceScriptDatabaseInitializer(datasource(), databaseSetting());
    }

    DatabaseInitializationSettings databaseSetting() {
        var setting = new DatabaseInitializationSettings();
        setting.setSchemaLocations(
                List.of("classpath:sql/schema.sql", "classpath:sql/init-data.sql"));
        setting.setMode(DatabaseInitializationMode.ALWAYS);
        setting.setSeparator(";");
        setting.setContinueOnError(true);
        return setting;
    }

    @Bean
    DataSource datasource() {
        var builder = DataSourceBuilder.create();

        builder.driverClassName("org.h2.Driver");
        builder.url("jdbc:h2:file:./src/main/resources/h2/database;MODE=MariaDB;DATABASE_TO_LOWER=TRUE;CASE_INSENSITIVE_IDENTIFIERS=TRUE");
        builder.username("sa");
        builder.password("password");

        return builder.build();
    }
}
