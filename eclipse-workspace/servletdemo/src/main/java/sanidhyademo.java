

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class sanidhyademo
 */
@WebServlet("/sanidhyademo")
public class sanidhyademo extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<html><body>");
		String n = request.getParameter("name");
		String m = request.getParameter("password");
		
		System.out.println(n);
		System.out.println(m);
		out.println("the student is confirmed "+n+"\n"+"password"+"password: "+m);
		out.println("</body></html>");
	}

}
