package com.codacum.apiolamundo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class ApiOlaMundoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiOlaMundoApplication.class, args);
	}

}