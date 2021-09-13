

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;



/**
 * Servlet implementation class Myservlet3
 */
@SuppressWarnings("serial")
public class Myservlet3 extends HttpServlet {
	public void doPost(HttpServletRequest request, HttpServletResponse response)  
		    throws ServletException, IOException {  
		  
		    response.setContentType("text/html");  
		    PrintWriter out = response.getWriter();  
		          
		    String n=request.getParameter("username");  
		    out.print("Welcome "+n);  
		    String r=request.getParameter("userpass");  
		    out.print("userpass is"+r); 
		          
		    out.close();  
		    }  
		  
		}  