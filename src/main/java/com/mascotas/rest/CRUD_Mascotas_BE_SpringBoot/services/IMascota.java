package com.mascotas.rest.CRUD_Mascotas_BE_SpringBoot.services;

import java.util.List;

import com.mascotas.rest.CRUD_Mascotas_BE_SpringBoot.models.entities.Mascota;

public interface IMascota {
	
	Mascota save(Mascota mascota);
	
	Mascota findById(Integer idMascota);
	
	void delete(Mascota mascota);

}
