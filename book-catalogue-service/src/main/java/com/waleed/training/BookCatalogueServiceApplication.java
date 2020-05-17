package com.waleed.training;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class BookCatalogueServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookCatalogueServiceApplication.class, args);
	}

}
