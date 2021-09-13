package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class Hellocontroller {
	@GetMapping("/hello")
	public String sayhello()
	{
		return "welcome to spring boot get method";
		
	}
	@PostMapping("/hello")
	public String sayhellopost()
	{
		return "welcome to spring boot app post method ";
		
	}
	

}
