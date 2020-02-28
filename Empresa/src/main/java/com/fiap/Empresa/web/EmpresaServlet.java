package com.fiap.Empresa.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fiap.Empresa.bo.EmpresaBO;
import com.fiap.Empresa.dao.EmpresaDAO;
import com.fiap.Empresa.models.entities.Empresa;

@WebServlet(urlPatterns = "/empresa")
public class EmpresaServlet extends HttpServlet {

	private static final long serialVersionUID = -2962987292524114736L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		long cod = Long.parseLong(req.getParameter("cod"));
		PrintWriter out = resp.getWriter();
		Empresa emp = new EmpresaDAO().getByCod(cod);
		
		resp.setContentType("text/html");
		out.println("<html><body>");
		if(emp != null) {
			out.println("codigo:"+emp.codigo+" - nome:"+emp.nome);
		}else {
			out.println("Empresa não encontrada");
		}
		
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Empresa emp = new Empresa();
		emp.nome = req.getParameter("nome");
		EmpresaBO bo = new EmpresaBO();
		
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		out.print("<html><body>");
		if(bo.validarNome(emp.nome)) {
			new EmpresaDAO().addEmpresa(emp);
			out.print("<h1>Cadastrado com sucesso<h1>");
		}else {
			out.print("<h1>Deu ruim<h1>");
		}
		
		
	}
	
}
