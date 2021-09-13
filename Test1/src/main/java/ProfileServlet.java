

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
 * Servlet implementation class ProfileServlet
 */
public class ProfileServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private static final HttpServletRequest request = null;

	private static final ServletResponse response = null;

	  response.setContentType("text/html");  
	  PrintWriter out=response.getWriter();   
        
      request.getRequestDispatcher("link.html").include(request, response);  
        
      Cookie ck[]=request.getCookies();  
      if(ck!=null){  
       String name=ck[0].getValue();  
      if(!name.equals("")||name!=null){  
          out.print("<b>Welcome to Profile</b>");  
          out.print("<br>Welcome, "+name);  
      }  
      }else{  
          out.print("Please login first");  
          ServletRequest request;
		ServletResponse response;
		request.getRequestDispatcher("login.html").include(request, response);  
      }  
      out.close();  
  }  
}  
