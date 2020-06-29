package com.cognizant.springlearn;

import com.cognizant.springlearn.Model.Country;
import com.cognizant.springlearn.Model.CountryList;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@SpringBootApplication
public class SpringLearnApplication {
  
	public static void main(String[] args)  {

		SpringApplication.run(SpringLearnApplication.class, args);
		Logger lg=LoggerFactory.getLogger(SpringLearnApplication.class);
		lg.error("from main");

	}

}
