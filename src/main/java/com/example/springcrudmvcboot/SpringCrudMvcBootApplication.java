package com.example.springcrudmvcboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
public class SpringCrudMvcBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCrudMvcBootApplication.class, args);
	}

}
