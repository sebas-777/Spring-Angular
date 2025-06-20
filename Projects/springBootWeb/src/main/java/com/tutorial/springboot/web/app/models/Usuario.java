package com.tutorial.springboot.web.app.models;

public class Usuario {

	private String nombre;
	private String apellidos;
	private String email;

	public Usuario(String nombre, String apellidos, String email) {

		this.nombre = nombre;
		this.apellidos = apellidos;
		this.email = email;
	}

	public Usuario() {

	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

}