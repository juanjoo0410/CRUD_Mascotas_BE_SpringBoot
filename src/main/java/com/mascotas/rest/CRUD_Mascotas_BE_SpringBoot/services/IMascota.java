package com.mascotas.rest.CRUD_Mascotas_BE_SpringBoot.services;

import java.util.List;

import com.mascotas.rest.CRUD_Mascotas_BE_SpringBoot.models.dtos.MascotaDto;
import com.mascotas.rest.CRUD_Mascotas_BE_SpringBoot.models.entities.Mascota;

public interface IMascota {
	
	Mascota save(Mascota mascota);
	
	Mascota findById(Integer id);
	
	void delete(Mascota mascota);
	
	Iterable<Mascota> findAll();
}
