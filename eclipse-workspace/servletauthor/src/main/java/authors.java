

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class authors
 */
@WebServlet("/auth")
public class authors extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<html><body>");
		String auth[] = request.getParameterValues("author");
		if (auth != null && !auth.equals("")) {
		  out.write("<p>You have choose author ");
		  for (int i=0;i<auth.length;++i){
		  out.println("<ul><li>");
			  out.print(auth[i]);
			  out.println("</li></ul>");
		  }
		out.println("</body></html>");
	}

}
}
