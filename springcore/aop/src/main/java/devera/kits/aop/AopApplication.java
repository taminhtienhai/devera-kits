package devera.kits.aop;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import devera.kits.aop.beans.Game;

@EnableAspectJAutoProxy
@SpringBootApplication
public class AopApplication implements CommandLineRunner {

	public static void main(String[] args) {
		var ctx = SpringApplication.run(AopApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
	}

}
