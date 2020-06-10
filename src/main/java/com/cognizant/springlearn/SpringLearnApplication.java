package com.cognizant.springlearn;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringLearnApplication {

	public static void main(String[] args) {

		SpringApplication.run(SpringLearnApplication.class, args);
		Logger lg=LoggerFactory.getLogger(SpringLearnApplication.class);
		lg.error("from main");


	}

}
