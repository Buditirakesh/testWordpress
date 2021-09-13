

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
 

/**
 * Servlet implementation class Myloginservlet2
 */
@SuppressWarnings("serial")
@WebServlet("/Myloginservlet2")
public class Mylogoutservlet extends HttpServlet {
	 protected void doPost(HttpServletRequest request, HttpServletResponse response)  
             throws ServletException, IOException {  
response.setContentType("text/html");  
PrintWriter out=response.getWriter();  


request.getRequestDispatcher("link.html").include(request, response);  

Cookie ck=new Cookie("name","");  
ck.setMaxAge(0);  
response.addCookie(ck);  

out.print("you are successfully logged out!");  
}  
}  