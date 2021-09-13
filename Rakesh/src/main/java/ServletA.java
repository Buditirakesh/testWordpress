//
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@SuppressWarnings("serial")
@WebServlet("/ServletA")
public class ServletA extends HttpServlet {
	
		private static final long serialVersionUID = 1L;
		public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

			    System.out.println("Host = " + request.getServerName());
			    System.out.println("Port = " + request.getServerPort());
			    System.out.println("Client Browser=" +request.getHeader("user-agent"));
			    System.out.println("Client IP address=" +request.getRemoteAddr());
			    System.out.println("Client Port No=" +request.getRemotePort());
			    System.out.println("Local Port NO=" +request.getLocalPort());
			    		
			}
	}