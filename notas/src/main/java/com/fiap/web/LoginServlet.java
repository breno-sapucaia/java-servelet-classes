package com.fiap.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fiap.dao.UsuarioDAO;

@WebServlet(urlPatterns="/login")
public class LoginServlet extends HttpServlet{
	/**
	 * 
	 */
	private static final long serialVersionUID = -8575463004558783597L;

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String login = req.getParameter("login");
		String senha = req.getParameter("senha");
		
		UsuarioDAO usuarios = new  UsuarioDAO();
		
	}
}
