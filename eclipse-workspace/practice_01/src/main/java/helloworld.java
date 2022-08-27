import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class helloworld
 */
@WebServlet("/helloworld")
public class helloworld extends HttpServlet {
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws
	ServletException,IOException{
		PrintWriter out= response.getWriter();
	out.println("hello world")	;
	}
	
	}
