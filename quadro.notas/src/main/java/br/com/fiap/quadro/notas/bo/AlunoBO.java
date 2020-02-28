package br.com.fiap.quadro.notas.bo;

public class AlunoBO {
	public boolean validarNota(double nota) {
		return nota >= 0 && nota <= 10;
	}
}
