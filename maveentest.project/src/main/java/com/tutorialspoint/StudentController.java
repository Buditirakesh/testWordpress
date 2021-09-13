package com.tutorialspoint;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import maveentestA.project.RequestMapping;
@SuppressWarnings("unused")
@Controller

public class StudentController {
	   @RequestMapping("/StudentController")  
	    //read the provided form data  
	    public String display(@RequestParam("name") String name,@RequestParam("pass") String pass,Model m)  
	    {  
	        if(pass.equals("admin"))  
	        {  
	            String msg="Hello "+ name;  
	            //add a message to the model  
	            m.addAttribute("message", msg);  
	            return "viewpage.jsp";  
	        }  
	        else  
	        {  
	            String msg="Sorry "+ name+". You entered an incorrect password";  
	            m.addAttribute("message", msg);  
	            return "errorpage.jsp";  
	        }     
	    }  
	}  