package com.myretail.api.starter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@ComponentScan("com.myretail.api.exception")
@ComponentScan("com.myretail.api.controller")
@ComponentScan("com.myretail.api.service")
@ComponentScan("com.myretail.api.model")
@ComponentScan("com.myretail.api.repository")
public class MyRetailApp {

	public static void main(String[] args) {
		SpringApplication.run(MyRetailApp.class, args);
	}

	@Bean
	public RestTemplate restTemplate() {
	    return new RestTemplate();
	}
	
}
