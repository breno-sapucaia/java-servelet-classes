package com.fiap.dao;

import java.util.ArrayList;

import com.fiap.entities.Usuario.Usuario;

public class UsuarioDAO {
	private static ArrayList<Usuario> USUARIOS = new ArrayList<Usuario>() ;
	
	static {
		USUARIOS.add(new Usuario("Breno","breu","123"));
	}
	
	public void adicionar(Usuario u) {
		USUARIOS.add(u);
	}
	
	public ArrayList<Usuario> consultarTodos(){
		return USUARIOS;
	}
	public Usuario consultarPorLogin(String login) {
		for(Usuario u: USUARIOS) {
			if(u.getLogin().equals(login)) {
				if(u.getLogin().equals(login)) {
					return u;
				}
			}
		}
		return null;
	}
}
