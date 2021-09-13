


import java.io.IOException;




import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@SuppressWarnings("unused")
@WebServlet("/Controller")
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	//private static final ServletResponse Response = null;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Controller() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    @SuppressWarnings("unused")
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		try {
			Integer i1=Integer.valueOf(request.getParameter("op1"));
			Integer i2=Integer.valueOf(request.getParameter("op2"));
			request.setAttribute("n1",i1);
			request.setAttribute("n2",i2);
			
		    }
		catch(Exception e) {
			response.setContentType("text/html");
			PrintWriter out=response.getWriter();
			out.println("value should be number");
			RequestDispatcher
			rd=request.getRequestDispatcher("/Index.html");
			rd.include(request, response);
			return;
		}
		String action=request.getParameter("action");
		RequestDispatcher rd=null;
		if(action.equals("Add")) {
			rd=request.getRequestDispatcher("/Add");
		}
		else if(action.equals("Substract")) {
			rd=request.getRequestDispatcher("/Substract");
		}
		else if(action.equals("Multiply")) {
			rd=request.getRequestDispatcher("/Multiply");
		}
		else {
	
			rd=request.getRequestDispatcher("/Divide");
		}
		rd.forward(request, response);
	}
	
}	