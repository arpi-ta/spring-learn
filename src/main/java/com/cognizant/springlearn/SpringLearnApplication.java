package com.cognizant.springlearn;

import org.apache.catalina.core.ApplicationContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static javax.sound.midi.ShortMessage.START;

@SpringBootApplication
public class SpringLearnApplication {


	private static final Logger LOGGER =
			LoggerFactory.getLogger(SpringLearnApplication.class);

	public static void main(String[] args)  {

		SpringApplication.run(SpringLearnApplication.class, args);
		Logger lg=LoggerFactory.getLogger(SpringLearnApplication.class);
		lg.error("from main");
		displayDate();
	}

	public static void displayDate()  {
		LOGGER.info("START");
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("date-format.xml");

		SimpleDateFormat format = ctx.getBean("dateFormat", SimpleDateFormat.class);

           Date date=null;

		try {
			date=format.parse("31/12/2018");
			LOGGER.debug(date.toString());

		} catch (ParseException e) {
			e.printStackTrace();
		}
		LOGGER.info("END");
		//System.out.println(date);



	}

}
