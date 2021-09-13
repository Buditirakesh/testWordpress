

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class Mynewservlet
 */
@SuppressWarnings("serial")
@WebServlet("/Mynewservlet")
public class Mynewservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		//@SuppressWarnings("unused")
		PrintWriter out=response.getWriter();
		response.setContentType("text/plain");
		out.write("remotehost= ");
		out.write(request.getRemoteHost());
		out.write("remotehost= ");
		out.write(request.getServerName());
		out.write("Protocol= ");
		out.write(request.getProtocol());
		out.write("Port= ");
		out.write(request.getServerPort());
//		System.out.println("Host= "+request.getServerName());
//		System.out.println("Port= "+request.getServerPort());
//		System.out.println("Protocol= "+request.getProtocol());
//		System.out.println("Protocol= "+request.getRemoteHost());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	

}