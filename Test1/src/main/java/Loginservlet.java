

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class Loginservlet
 */
@SuppressWarnings("serial")
public class Loginservlet extends HttpServlet {
	 //response.setContentType("text/html");  
     private static final ServletResponse response = null;

	private static final ServletRequest request = null;

	PrintWriter out=response.getWriter();  
       
     //request.getRequestDispatcher("link.html").include(request, response);  
       
     String name=request.getParameter("name");  
     String password=request.getParameter("password");  
       
     if(password.equals("admin123")){  
         out.print("You are successfully logged in!");  
         out.print("<br>Welcome, "+name);  
           
         Cookie ck=new Cookie("name",name);  
         ((HttpServletResponse) response).addCookie(ck);  
     }else{  
         out.print("sorry, username or password error!");  
         request.getRequestDispatcher("login.html").include(request, response);  
     }  
       
     out.close();  
 }  

}  