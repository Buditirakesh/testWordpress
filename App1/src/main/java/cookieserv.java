
import java.io.PrintWriter;


import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class FirstServlet1
 */
@SuppressWarnings("serial")
@WebServlet("/cookieserv")
public class cookieserv extends HttpServlet {
	 public void doPost(HttpServletRequest request, HttpServletResponse response){  
		    try{  
		  
		    response.setContentType("text/html");  
		    PrintWriter out = response.getWriter();  
		          
		    String n=request.getParameter("userName");  
		    out.print("Welcome "+n);  
		  
		    Cookie ck=new Cookie("uname",n);//creating cookie object  
		    response.addCookie(ck);//adding cookie in the response  
		  
		    //creating submit button  
		    out.print("<form action='cookserv2'>");  
		    out.print("<input type='submit' value='go'>");  
		    out.print("</form>");  
		          
		    out.close();  
		  
		        }catch(Exception e){System.out.println(e);}  
		  }  
		}