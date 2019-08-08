package br.com.fiap.javaweb.web;
import java.text.SimpleDateFormat;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ex2")
public class ex2 extends HttpServlet{

	private static final long serialVersionUID = 7218081167658021977L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		Date data = new Date();
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		
		PrintWriter out = resp.getWriter();
		
		out.println("A data atual é "+format.format(data) );
	}
	
	
	
}
