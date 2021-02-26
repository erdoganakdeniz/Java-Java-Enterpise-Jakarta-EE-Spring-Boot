package com.example.test;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.config.AppConfig;
import com.example.demo.SpringSetterApplication;

public class TestAnnotation {
	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext=new AnnotationConfigApplicationContext(AppConfig.class);
		SpringSetterApplication connection=applicationContext.getBean(SpringSetterApplication.class);
		connection.openConnection();
		System.out.println("***********");
		connection.closeConnection();
		applicationContext.close();
		

	}
}
