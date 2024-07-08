package com.pruebaSofka.co;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories(basePackages = "com.pruebaSofka.co.dao")
public class PruebaSofkaApplication {

	public static void main(String[] args) {
		SpringApplication.run(PruebaSofkaApplication.class, args);
	}

}
