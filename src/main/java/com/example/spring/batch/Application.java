package com.example.spring.batch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;

@SpringBootApplication
@EnableBatchProcessing
@ComponentScan("com.example.spring.batch.config")
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
