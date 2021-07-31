import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/Login")
public class Login extends HttpServlet{
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException {
		String uname=(String)req.getParameter("uname");
		String password=(String)req.getParameter("password");
		//System.out.println(uname);
		if(uname.equals("siam")&&password.equals("abc")) {
			HttpSession session=req.getSession();
			session.setAttribute("username", uname);
			res.sendRedirect("welcome.jsp");
		}
		else {
			
			res.sendRedirect("login.jsp");
		}
	}
}
