package com.bridgelabz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class SecureApp1Application {

	public static void main(String[] args) {
		SpringApplication.run(SecureApp1Application.class, args);
	}

}
