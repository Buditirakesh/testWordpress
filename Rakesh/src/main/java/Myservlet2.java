

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/Myservlet2")
public class Myservlet2 extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response){  
	    try{  
	  
	    response.setContentType("text/html");  
	    PrintWriter out = response.getWriter();  
	      
	    javax.servlet.http.Cookie[] ck=request.getCookies();  
	    out.print("Hello "+ck[0].getValue());  
	  
	    out.close();  
	  
	         }catch(Exception e){System.out.println(e);}  
	    }  
	      
	  
	}