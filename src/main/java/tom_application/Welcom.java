package tom_application;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


public class Welcom extends HttpServlet {
	
	protected void service(HttpServletRequest req,HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter pw = resp.getWriter();
		
		String user = (String) req.getAttribute("loggeduser");
		String email = (String) req.getAttribute("loggedemail");
		
		pw.println("<h3>Login Successfully ! </h3>");
		pw.println("<p> Welcome " + user +"("+email+")</p>");
		
	}
}