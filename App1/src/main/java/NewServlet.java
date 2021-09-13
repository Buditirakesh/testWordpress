

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class NewServlet
 */
@SuppressWarnings("serial")
@WebServlet("/NewServlet")
public class NewServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 response.setContentType("text/html");
	        PrintWriter out = response.getWriter();
	        String name = request.getParameter("fullname");
	        String Addr = request.getParameter("address");
	        String age = request.getParameter("age");
	        String Qual = request.getParameter("qual");
	        String Persent = request.getParameter("percent");
	        String Year = request.getParameter("yop");
	        if (name.isEmpty() || Addr.isEmpty() || age.isEmpty() || Qual.isEmpty() || Persent.isEmpty() || Year.isEmpty()) {
	           RequestDispatcher rd = request.getRequestDispatcher("error.jsp");
	            out.println("<font color=red>Please fill all the fields</font>");
	            rd.include(request, response);
	        } else {
	            RequestDispatcher rd = request.getRequestDispatcher("member.jsp");
	            rd.forward(request, response);
	        }
	    }


	}