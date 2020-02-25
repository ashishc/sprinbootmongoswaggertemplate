package com.comp.springmongoswaggerrestsample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.scheduling.annotation.EnableScheduling;

import lombok.extern.slf4j.Slf4j;


@EnableMongoRepositories(basePackages = "com.comp")
@SpringBootApplication
@ComponentScan("com.comp")
@EnableScheduling
@Slf4j
public class SpringmongoswaggerrestsampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringmongoswaggerrestsampleApplication.class, args);
	}

}
