

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@SuppressWarnings("unused")
@WebServlet("/Substract")
public class Substract extends HttpServlet {
	private static final long serialVersionUID = 1L;
	//private static final ServletResponse response = null;
 
    @SuppressWarnings({ })
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		int op1=((Integer)request.getAttribute("n1")).intValue();
		int op2=((Integer)request.getAttribute("n2")).intValue();
		int result=op1-op2;
		Integer n=Integer.valueOf(result);
		request.setAttribute("result",n);
		RequestDispatcher rd=request.getRequestDispatcher("/Response");
		rd.forward(request, response);
		
		
		
	}
	}