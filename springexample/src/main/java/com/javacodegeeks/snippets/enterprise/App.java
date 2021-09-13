package com.javacodegeeks.snippets.enterprise;

import org.springframework.context.ConfigurableApplicationContext;

//import org.springframework.context.ConfigurableApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;
 
//import com.javacodegeeks.snippets.enterprise.dao.EmployeeDAO;
//import com.javacodegeeks.snippets.enterprise.dao.JDBCEmployeeDAO;
public class App {
	 public static void main(String[] args) {
	     
         ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
         EmployeeDAO employeeDAO = (EmployeeDAO) context.getBean("employeeDAO");
         employee employee1 = new employee(123, "javacodegeeks", 30);
         employeeDAO.insert(employee1);
         employee employee2 = employeeDAO.findById(123);
         System.out.println(employee2);  
         context.close();
 }

}
