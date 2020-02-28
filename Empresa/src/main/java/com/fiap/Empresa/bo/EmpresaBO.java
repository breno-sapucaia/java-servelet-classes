package com.fiap.Empresa.bo;

public class EmpresaBO {
	public boolean validarNome(String nome) {
		if(nome.length() < 4) {
			return false;
		}else {
			return true;
		}
	}
}
