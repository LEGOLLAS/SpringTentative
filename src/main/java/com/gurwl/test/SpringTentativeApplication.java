package com.gurwl.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})

@SpringBootApplication
public class SpringTentativeApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringTentativeApplication.class, args);
	}
}
