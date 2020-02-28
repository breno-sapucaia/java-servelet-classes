package br.com.fiap.dao;

import java.util.ArrayList;

import br.com.fiap.model.entities.Usuario;

public class UsuarioDAO {

	private static ArrayList<Usuario> usuarios = new ArrayList<>();
	
	public void addUser(Usuario u) {
		if(u != null) usuarios.add(u);
	}
	
	public ArrayList<Usuario> getAll(){
		return usuarios;
	}
	public Usuario getByLogin(String login) {
		for(Usuario user:usuarios) {
			if(user.login.equals(login)) {
				return user;
			}
		}
		return null;
	}
}
