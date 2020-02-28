package br.com.fiap.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.fiap.bo.UsuarioBO;
import br.com.fiap.dao.UsuarioDAO;
import br.com.fiap.model.entities.Usuario;

@WebServlet(urlPatterns = "/user")
public class UsuarioServlet extends HttpServlet {

	private static final long serialVersionUID = 3551310872688467649L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		ArrayList<Usuario> users = new UsuarioDAO().getAll();
		String login = req.getParameter("login");

		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		out.println("<html><body>");
		out.println("<h1>Consultar dados de usuario</h1>");
		out.println("<table border='1'><tr><th>nome</th><th>login</th><th>senha</th></tr>");
		if (login != null) {
			for (Usuario user : users) {
				out.println(
						"<tr><td>" + user.nome + "</td><td>" + user.login + "</td><td>" + user.senha + "</td></tr>");
			}
		} else {
			Usuario user = new UsuarioDAO().getByLogin(login);
			if (user != null || !user.equals("")) {
				out.println(
						"<tr><td>" + user.nome + "</td><td>" + user.login + "</td><td>" + user.senha + "</td></tr>");
			} else {
				out.println("<tr><td>not found</td><td>not found</td><td>not found</td></tr>");
			}
		}
		out.println("</table>");
		out.println("<a href='http://localhost/Ex'>Voltar</a>");
		out.flush();
		out.close();

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Usuario user = new Usuario();
		user.nome = req.getParameter("nome");
		user.login = req.getParameter("login");
		user.senha = req.getParameter("senha");
		UsuarioBO bo = new UsuarioBO();

		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();

		if (bo.validarNome(user)) {
			new UsuarioDAO().addUser(user);
			out.println("<html><body><p>Cadastrado com sucesso</br><a href='http://localhost/Ex'>voltar</a></p></body></html>");
		} else {
			out.println("<html><body><p>Dados inválidos <br><a href='http://localhost/Ex'>voltar</a></p></body></html>");
		}
		out.flush();
		out.close();

	}
}
