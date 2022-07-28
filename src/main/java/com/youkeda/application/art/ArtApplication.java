package com.youkeda.application.art;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@EnableMongoRepositories
@SpringBootApplication
public class ArtApplication {

	public static void main(String[] args) {
		SpringApplication.run(ArtApplication.class, args);
	}

}
