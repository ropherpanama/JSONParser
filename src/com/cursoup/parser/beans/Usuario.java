package com.cursoup.parser.beans;

public class Usuario {
	private String nombre;
	private String apellido;
	private String email;
	private String nickname;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	
	@Override
	public String toString() {
		return "Nombre: " + this.getNombre() + "\nNickname: " + this.getNickname() + "\ne-mail: " + this.getEmail();
	}
}
