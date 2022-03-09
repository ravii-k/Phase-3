package com.phase3.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com")
@ComponentScan(basePackages = "com")
@EntityScan(basePackages = "com")
public class DisplayfeedbackApplication {

	public static void main(String[] args) {
		SpringApplication.run(DisplayfeedbackApplication.class, args);
	}

}
