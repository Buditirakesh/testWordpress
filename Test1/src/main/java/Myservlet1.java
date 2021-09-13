

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Myservlet1
 */
@SuppressWarnings("serial")
@WebServlet("/Myservlet1")
public class Myservlet1 extends HttpServlet {
	public void doPost(HttpServletRequest request, HttpServletResponse response){  
	    try{  
	  
	    response.setContentType("text/html");  
	    PrintWriter out = response.getWriter();  
	          
	    String n=request.getParameter("userName");  
	    out.print("Welcome "+n);  
	  
	    Cookie ck=new Cookie("uname",n);//creating cookie object  
	    response.addCookie(ck);//adding cookie in the response  
	  
	    //creating submit button  
	    out.print("<form action='Myservlet2'>");  
	    out.print("<input type='submit' value='go'>");  
	    out.print("</form>");  
	          
	    out.close();  
	  
	        }catch(Exception e){System.out.println(e);}  
	  }  
	}