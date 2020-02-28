package com.fiap.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fiap.bo.UsuarioBO;
import com.fiap.dao.UsuarioDAO;
import com.fiap.entities.Usuario.Usuario;

@WebServlet(urlPatterns = "/cadastrar")
public class UsuarioServlet extends HttpServlet {

	private static final long serialVersionUID = 8014294252910423090L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String nome = req.getParameter("nome");
		String login = req.getParameter("login");
		String senha = req.getParameter("senha");
		String csenha = req.getParameter("csenha");
		Usuario usuario = new Usuario(nome,login,senha); 
		PrintWriter out = resp.getWriter();
		resp.setContentType("text/html");
		out.println("<html><body>");
		if(UsuarioBO.validarNome(usuario) && UsuarioBO.validarLogin(usuario) && UsuarioBO.validarSenha(usuario)) {
			new UsuarioDAO().adicionar(usuario);
			out.println("<h1>Usuario cadastrado com sucesso");
		}else {
			out.println("<h1>Deu ruim, tente novamente</h1><p>o nome login e senha tem que conter mais que 2 caracteres seu bosta</p>");
		}
		out.println("<a href=\"http://localhost/notas\"> voltar </a>");
		
	}
}
