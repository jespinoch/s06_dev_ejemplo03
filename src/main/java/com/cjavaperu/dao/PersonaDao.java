package com.cjavaperu.dao;

import java.util.List;

import com.cjavaperu.bean.Persona;

public interface PersonaDao {
	
	int insertar(Persona persona);
	int actualizar(Persona persona);
	void eliminar(Integer id) throws Exception ;
	Persona obtener(Integer id);
	List<Persona> Buscar(String sql);

}
