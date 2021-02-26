package com.example.test;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.demo.*;

public class TestSpring {
	public static void main(String[] args) {
		ConfigurableApplicationContext configurableApplicationContext = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		SpringSetterApplication connection = (SpringSetterApplication) configurableApplicationContext
				.getBean("dbConnection");
		connection.openConnection();
		connection.closeConnection();
		configurableApplicationContext.close();
	}

}
