package tom_application;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Login extends HttpServlet {
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String user = req.getParameter("user");
		String email = req.getParameter("email");
		String password = req.getParameter("password");
		resp.setContentType("text/html");
		PrintWriter pw = resp.getWriter();
		if(user != null && !user.isEmpty() && "1234".equals(password)) {
			req.setAttribute("loggeduser",user);
			req.setAttribute("loggedemail",email);
			
			RequestDispatcher rd =req.getRequestDispatcher("/Welcom");
			rd.forward(req,resp);
		}else {
			pw.println("invalid Credentials");
			RequestDispatcher rd =req.getRequestDispatcher("/Login.html");
			rd.include(req, resp);
		}
	}

}