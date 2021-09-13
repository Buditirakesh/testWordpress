package student.controller;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import student.dao.LoginDao;
import student.model.Login;
import student.model.Student;

/**
 * Servlet implementation class LoginCtrl
 */
@WebServlet("/loginCtrl")
public class LoginCtrl extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public LoginCtrl() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// how to retrieve value
		Login login = new Login();
		login.setUserId(request.getParameter("userName"));
		login.setPassword(request.getParameter("password"));
		Student stud = new LoginDao().checkUser(login);
		RequestDispatcher rd = null;
		if(stud!=null) {
			HttpSession session = request.getSession(true);
			session.setAttribute("USER", stud);
			if(stud.getType().equalsIgnoreCase("admin")) {
				rd = request.getRequestDispatcher("admin.jsp");
			}else {
				rd = request.getRequestDispatcher("student.jsp");
			}
		}else {
			rd = request.getRequestDispatcher("index.jsp");
			request.setAttribute("ERROR", "User name or password not matches");
		}
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
