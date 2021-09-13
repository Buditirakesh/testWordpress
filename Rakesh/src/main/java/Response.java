import java.io.IOException;


import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/response")
public class Response extends HttpServlet {
	private static final long serialVersionUID = 1L;
	@SuppressWarnings("unused")
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		Integer n=(Integer)request.getAttribute("n");
		RequestDispatcher rd=request.getRequestDispatcher("/Index.html");
		if(n==null) {
			rd.forward(request, response);
			return;
		}
		try {
			response.setContentType("text/html");
			
			PrintWriter out=response.getWriter();
			String op=(String)request.getAttribute("operation");
			out.println(op+"Result: <b>"+n.intValue()+"<br><br/>");
			rd.include(request, response);
			
		}
		catch(Exception e) {};
		}
}
