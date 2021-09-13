package com.mvc.util;

import java.sql.DriverManager;

import com.sun.jdi.connect.spi.Connection;

public class DBConnection {
	 Connection con = null;
     String url = "jdbc:mysql://localhost:3306/customers"; //MySQL URL followed by the database name
     String username = "root"; //MySQL username
     String password = "12345678"; //MySQL password
System.out.println("In DBConnection.java class ");
System.out.println("hi");
try{try{Class.forName("com.mysql.jdbc.Driver"); //loading MySQL drivers. This differs for database servers } 
         catch (ClassNotFoundException e)
         {
            e.printStackTrace();
         }       
         con = (Connection) DriverManager.getConnection(url, username, password); //attempting to connect to MySQL database
         System.out.println("Printing connection object "+con);}catch(Exception e) 
     {
        e.printStackTrace();
     }   
     return con; 
 }
}