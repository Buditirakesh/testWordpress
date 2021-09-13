package com.tutorialspoint;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp1 {
	 public static void main(String[] args) {
	      @SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("file:Beans1.xml");
	      TextEditor te = (TextEditor) context.getBean("textEditor");
	      te.spellCheck();
	   }
	}
//MainApp1.java,TextEditor.java,Beans1.xml,SpellChecker.java;