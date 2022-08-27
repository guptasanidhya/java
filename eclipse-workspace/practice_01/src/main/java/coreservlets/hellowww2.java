package coreservlets;
import java.io.*;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class hellowww2 and package coreservlets
 */
@WebServlet("/hellowww2")
public class hellowww2 extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String docType=
				"<!DOCTYPE HTML PUBLIC \"-W3C//DTD HTML 5.0"+
		"Transitional//EN\">\n";
		out.println(docType+"<HTML>\n"
		+"<HEAD><TITLE> HELLO WWW2</TITLE></HEAD>\n"
		+"<BODY>\n"
		+"<H1> HELLO WWW2</H1>\n"
		+"</BODY></HTML>");


	}

}
