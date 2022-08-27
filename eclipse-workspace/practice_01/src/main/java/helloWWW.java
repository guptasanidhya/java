
import java.io.*;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class helloWWW
 */
@WebServlet("/helloWWW")
public class helloWWW extends HttpServlet {


	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String docType=
				"<!DOCTYPE HTML PUBLIC \"-W3C//DTD HTML 5.0"+
		"Transitional//EN\">\n";
		out.println(docType+"<HTML>\n"
		+"<HEAD><TITLE> HELLO WWW</TITLE></HEAD>\n"
		+"<BODY>\n"
		+"<H1> HELLO WWW</H1>\n"
		+"</BODY></HTML>");
			}

}
