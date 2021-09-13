package com.mkyong.common.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;

import maveentestA.project.RequestMapping;

@Controller
@RequestMapping("/welcome")
public class HelloController {

	

	private static final String RequestMethod = null;

	public String printWelcome(ModelMap model) {

		model.addAttribute("message", "Spring 3 MVC Hello World");
		return "hello";

	}
	
}