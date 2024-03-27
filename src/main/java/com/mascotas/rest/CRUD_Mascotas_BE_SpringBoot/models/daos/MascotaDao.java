package com.mascotas.rest.CRUD_Mascotas_BE_SpringBoot.models.daos;

import org.springframework.data.repository.CrudRepository;

import com.mascotas.rest.CRUD_Mascotas_BE_SpringBoot.models.entities.Mascota;

public interface MascotaDao extends CrudRepository<Mascota, Integer> {

}
