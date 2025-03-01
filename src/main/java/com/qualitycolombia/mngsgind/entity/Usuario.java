package com.qualitycolombia.mngsgind.entity;

import java.time.LocalDateTime;

public class Usuario {

	private String usuario;
	private String password;
	private String nit;
	private String perfil;
	private LocalDateTime fechaSincronizacion;
	
	public Usuario() {
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getNit() {
		return nit;
	}

	public void setNit(String nit) {
		this.nit = nit;
	}

	public String getPerfil() {
		return perfil;
	}

	public void setPerfil(String perfil) {
		this.perfil = perfil;
	}

	public LocalDateTime getFechaSincronizacion() {
		return fechaSincronizacion;
	}

	public void setFechaSincronizacion(LocalDateTime fechaSincronizacion) {
		this.fechaSincronizacion = fechaSincronizacion;
	}
}
