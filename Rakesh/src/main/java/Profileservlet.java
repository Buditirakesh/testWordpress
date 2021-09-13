

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Profileservlet")
public class Profileservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	  
	@SuppressWarnings("null")
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	  response.setContentType("text/html"); 
	 
	  PrintWriter out=response.getWriter();   
        
      request.getRequestDispatcher("link.html").include(request, response);  
        
      javax.servlet.http.Cookie[] ck=request.getCookies();  
      if(ck!=null){  
       String name=ck[0].getValue();  
      if(!name.equals("")||name!=null){  
          out.print("<b>Welcome to Profile</b>");  
          out.print("<br>Welcome, "+name);  
      }  
      }else{  
          out.print("Please login first");  
          ServletRequest request1 = null;
		ServletResponse response1 = null;
		request1.getRequestDispatcher("login1.html").include(request1, response1);  
      }  
      out.close();  
  }  
}