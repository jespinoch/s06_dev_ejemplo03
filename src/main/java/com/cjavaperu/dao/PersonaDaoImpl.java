package com.cjavaperu.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.cjavaperu.bean.Persona;

@Repository
public class PersonaDaoImpl implements PersonaDao {

	@Override
	public int insertar(Persona persona) {
		System.out.println("insertar() ejecutandose...");
		return 1;
	}

	@Override
	public int actualizar(Persona persona) {
		System.out.println("actualizar() ejecutandose...");
		return 1;
	}

	@Override
	public void eliminar(Integer id) throws Exception {
		System.out.println("eliminar() ejecutandose...");
		throw new Exception("Se produjo un error");
	}

	@Override
	public Persona obtener(Integer id) {
		System.out.println("obtener() ejecutandose...");
		return null;
	}

	@Override
	public List<Persona> Buscar(String sql) {
		System.out.println("Buscar() ejecutandose...");
		return null;
	}

}
