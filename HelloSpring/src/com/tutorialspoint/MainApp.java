package com.tutorialspoint;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
   @SuppressWarnings("resource")
public static void main(String[] args) {
      ApplicationContext context = new ClassPathXmlApplicationContext("file:src/com/tutorialspoint/Beans.xml");
      HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
      obj.getMessage();
   }
}