package getandsetattributes;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet("/Applicant")
public class Applicant extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());


String email= getServletConfig().getInitParameter("Email"); 
String website= getServletContext().getInitParameter("Website-name"); 
PrintWriter out = response.getWriter(); 
out.println("<center><h1>" + website+ "</h1></center><br><p>Contact us:"+email);} }