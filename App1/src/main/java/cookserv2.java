import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class SecondServlrt2
 */
public class cookserv2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void doPost(HttpServletRequest request, HttpServletResponse response){  
	    try{  
	  
	    response.setContentType("text/html");  
	    PrintWriter out = response.getWriter();  
	      
	    Cookie ck[]=request.getCookies();  
	    out.print("Hello "+ck[0].getValue());  
	  
	    out.close();  
	  
	         }catch(Exception e){System.out.println(e);}  
	    }  
	      
	  
	}