

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
        //String First_name = request.getParameter("First_name");
       // String name = request.getParameter("name");
        String User_name= request.getParameter("User_name");
        String Password = request.getParameter(" Password");
        String Address = request.getParameter("Address");
        String Contact_No = request.getParameter("Contact_No");
        if ( User_name.isEmpty() ||  Password.isEmpty() || Address.isEmpty() || Contact_No.isEmpty()) {
            RequestDispatcher rd = request.getRequestDispatcher("B.html");
            out.println("<font color=red>Please fill all the fields</font>");
            rd.include(request, response);
        } else {
            RequestDispatcher rd = request.getRequestDispatcher("second.html");
            rd.forward(request, response);
		}
	}

	}

