package com.st;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class SpringBootWithMysqlApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootWithMysqlApplication.class, args);
	}

}
