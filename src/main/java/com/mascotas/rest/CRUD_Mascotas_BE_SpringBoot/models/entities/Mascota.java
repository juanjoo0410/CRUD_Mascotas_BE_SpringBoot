package com.mascotas.rest.CRUD_Mascotas_BE_SpringBoot.models.entities;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "mascotas")
public class Mascota implements Serializable {
	@Id
	@Column(name = "idMascota")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idMascota;
	@Column(name = "nombre")
	private String nombre;
	@Column(name = "raza")
	private String raza;
	@Column(name = "sexo")
	private String sexo;

}
