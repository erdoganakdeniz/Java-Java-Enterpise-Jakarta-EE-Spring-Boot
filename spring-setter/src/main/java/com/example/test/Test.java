package com.example.test;

import com.example.demo.SpringSetterApplication;

public class Test {
	public static void main(String[] args) {
		SpringSetterApplication connection=new SpringSetterApplication();
		connection.setUrl("localhost");
		connection.setUsername("erdoganakdeniz");
		connection.setPassword("123456");
		connection.openConnection();
		connection.closeConnection();
	}


}
