package source;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan("source.entity")
@EnableJpaRepositories("source.repository")
public class MyClothesApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyClothesApplication.class, args);
	}
}
