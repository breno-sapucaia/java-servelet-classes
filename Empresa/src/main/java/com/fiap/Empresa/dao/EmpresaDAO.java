package com.fiap.Empresa.dao;

import java.util.ArrayList;

import com.fiap.Empresa.models.entities.Empresa;

public class EmpresaDAO {
	private static ArrayList<Empresa> empresas = new ArrayList();
	private long cod = 0;
	public void addEmpresa(Empresa e) {
		e.codigo = ++cod;
		if(e != null) empresas.add(e);
	}
	public ArrayList<Empresa> getAll(){
		return empresas;
	}
	public Empresa getByCod(long cod) {
		for(Empresa emp: empresas) {
			if(emp.codigo == cod) {
				return emp;
			}
		}
		return null;
	}
}
