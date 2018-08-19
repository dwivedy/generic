package com.example.NYMostPopular;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@EnableAutoConfiguration(exclude = {ErrorMvcAutoConfiguration.class})
@ComponentScan({ "com.example.controllers" })
public class NyMostPopularApplication {

	public static void main(String[] args) {
		SpringApplication.run(NyMostPopularApplication.class, args);

	}
}
