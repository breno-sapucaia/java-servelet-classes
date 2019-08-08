package br.com.fiap.javaweb.web;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(urlPatterns = "/app")
public class AppServelet extends HttpServlet {

	private static final long serialVersionUID = 5666497937796676150L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		String palavra = req.getParameter("palavra");
		
		PrintWriter out  = resp.getWriter();
		out.println("<html><body>");
		out.println("<h1>que merda</h1>");
		out.println("<h2>"+palavra+"</h2>");
		out.println("</body></html>");
		out.flush();
		out.close();
	}
	
}


