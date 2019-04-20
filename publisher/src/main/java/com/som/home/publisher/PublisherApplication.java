package com.som.home.publisher;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class PublisherApplication {

	
	public static void main(String[] args) {
		//ApplicationContext appContext = new AnnotationConfigApplicationContext(RabbitConfiguration.class);
		
		try {
			SpringApplication.run(PublisherApplication.class, args);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
