package net.codejava.spring;

import java.sql.DriverManager;


import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class SpringJdbcTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DriverManagerDataSource dataSource= new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/rakeshdb1");
		dataSource.setUsername("root");
		dataSource.setPassword("root");
		
		JdbcTemplate jdbcTemplate= new JdbcTemplate(dataSource);
		String sql="INSERT INTO employee (EmpID,Employname,Empagel,EmDeptl) VALUES(?,?,?,?)";
		int result=jdbcTemplate.update(sql,1,"Ram",25,"Operations");
		
		if (result>0)
		{
			System.out.println("an employee is added");
			
		}
		

	}

}
