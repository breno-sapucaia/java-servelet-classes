package com.fiap.bo;

import com.fiap.entities.Usuario.Usuario;

public class UsuarioBO {
	public static boolean validarNome(Usuario u) {
		if(u.getNome().length() < 2) {
			return false;
		}else {
			return true;
		}
	}
	public static boolean validarLogin(Usuario u) {
		if(u.getLogin().length() <2) {
			return false;
		}else {
			return true;
		}
	}
	public static boolean validarSenha(Usuario u) {
		if(u.getSenha().length() <2) {
			return false;
		}else {
			return true;
		}
	}
}
