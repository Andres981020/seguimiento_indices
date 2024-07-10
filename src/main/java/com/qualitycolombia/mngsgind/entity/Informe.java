package com.qualitycolombia.mngsgind.entity;

import com.fasterxml.jackson.databind.JsonNode;

public class Informe {

	private String titulo;
	private JsonNode detalleInf;

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public JsonNode getDetalleInf() {
		return detalleInf;
	}

	public void setDetalleInf(JsonNode detalleInf) {
		this.detalleInf = detalleInf;
	}
}
