package com.cjavaperu.bean;

public class Persona {

	private Integer id;
	private String nombres;
	private String apellidos;
	private Integer edad;
	
	public Persona() {
	}

	public Persona(Integer id, String nombres, String apellidos, Integer edad) {
		super();
		this.id = id;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.edad = edad;
	}

	public Persona(String nombres, String apellidos, Integer edad) {
		super();
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Persona [id=" + id + ", nombres=" + nombres + ", apellidos="
				+ apellidos + ", edad=" + edad + "]";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

}
