package com.example.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.demo.SpringSetterApplication;

@Configuration
public class AppConfig {

	@Bean
	public SpringSetterApplication connectionMethod() {
		SpringSetterApplication connection = new SpringSetterApplication();
		connection.setUrl("localhost");
		connection.setUsername("erdoganakdeniz");
		connection.setPassword("123456");

		return connection;
	}
}
