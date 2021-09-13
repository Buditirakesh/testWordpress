package com.restfulboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.infotech.app.HelloWorldSpringBootApp;

@SpringBootApplication
public class App {
	public static void main(String[] args)
	{
		
		SpringApplication.run(HelloWorldSpringBootApp.class, args);
	}

}
