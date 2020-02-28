package com.fiap.Ex;

import java.util.ArrayList;

public class UsuarioDAO {
	private static UsuarioList<Usuario> usuarios = new ArrayList<>();
	
	public void addUser(Usuarios user) {
		if(user != null) usuarios.add(user);
	}
	
	public ArrayList<Reserva> getAllUser() {
		return usuarios;
	}	
}
