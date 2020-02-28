package br.com.fiap.bo;

import br.com.fiap.model.entities.Usuario;

public class UsuarioBO {
	public boolean validarNome(Usuario u) {
		if(u.nome.length() < 2) {
			return false;
		}else {
			return true;
		}
	}
}
