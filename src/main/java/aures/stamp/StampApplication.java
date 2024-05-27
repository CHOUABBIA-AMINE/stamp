package aures.stamp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource(value = "classpath:application.properties")
public class StampApplication {

	public static void main(String[] args) {
		SpringApplication.run(StampApplication.class, args);
	}

}
