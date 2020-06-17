package com.soap.test.jozi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication(scanBasePackages= {"com.soap.test.jozi"})
@EnableJpaRepositories(basePackages={"com.soap.test.jozi"})
@EntityScan("com.soap.test.jozi*")
public class JoziApplication {

	public static void main(String[] args) {
		SpringApplication.run(JoziApplication.class, args);
	}

}
