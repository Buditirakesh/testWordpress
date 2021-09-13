package com.mkyong.common.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value="/")
public class HelloworldController {
	@RequestMapping(method=RequestMethod.GET)
	public ModelAndView welcome()
	{
		return new ModelAndView("welcomepage","welcomeMessage", "welcome to spring mvc world");
	}

}
