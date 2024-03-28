package com.mascotas.rest.CRUD_Mascotas_BE_SpringBoot.models.dtos;

import java.io.Serializable;

import jakarta.persistence.Column;

public class MascotaDto implements Serializable {
	private String nombre;
	private String raza;
	private String sexo;

	public MascotaDto() {
		super();
	}

	public MascotaDto(String nombre, String raza, String sexo) {
		super();
		this.nombre = nombre;
		this.raza = raza;
		this.sexo = sexo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

}
