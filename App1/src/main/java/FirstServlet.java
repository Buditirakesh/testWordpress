

import java.io.IOException;


import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;



/**
 * Servlet implementation class FirstServlet
 */
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public FirstServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		String First_name=request.getParameter("First_name");
		String Last_name=request.getParameter("First_name");
		String User_name=request.getParameter("User_name");
		String Password=request.getParameter("Password");
		String Address=request.getParameter("Address");
		String Contact_no =request.getParameter("Contact_No");
		
		if(First_name.isEmpty()||Last_name.isEmpty()||User_name.isEmpty()||Password.isEmpty()||Address.isEmpty()||Contact_no.isEmpty() )
		{
			RequestDispatcher req=request.getRequestDispatcher("A.html");
			req.include(request, response);
		}
		else {
			RequestDispatcher req=request.getRequestDispatcher("B.html");
			req.include(request, response);
		}
	}


}
