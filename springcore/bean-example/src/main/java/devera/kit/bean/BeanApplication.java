package devera.kit.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

import devera.kit.bean.config.MySQL;
import devera.kit.bean.config.Postgres;
import devera.kit.bean.interfaces.Game;

@ComponentScan
@EnableAutoConfiguration
@Configuration
@ImportResource("classpath:beans.xml")
@PropertySources({
	@PropertySource("classpath:application.${envTarget}.properties")
})
public class BeanApplication implements CommandLineRunner {

	@Qualifier("l4d")
	@Autowired
	Game l4d;

	@Value("${env}")
	String envTarget;

	public static void main(String[] args) {
		var context = SpringApplication.run(BeanApplication.class, args);

		var mysql = context.getBean(MySQL.class);
		var postgres = context.getBean(Postgres.class);
		// var sqlServer = context.getBean(SQLServer.class);

		System.out.println(mysql.toString());
		postgres.getConnector().getConnection();
		// sqlServer.getConnector().getConnection();

		/// Multiple Beans

		var game = context.getBean("l4d", Game.class);

		// var context = new AnnotationConfigApplicationContext(BeanApplication.class);

		// var pojo = context.getBean(Pojo.class);

		// System.out.println(pojo.content);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println(l4d.name());


		System.out.println(envTarget);
	}

}
