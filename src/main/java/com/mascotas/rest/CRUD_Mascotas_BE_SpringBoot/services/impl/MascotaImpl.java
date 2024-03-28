package com.mascotas.rest.CRUD_Mascotas_BE_SpringBoot.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mascotas.rest.CRUD_Mascotas_BE_SpringBoot.models.daos.MascotaDao;
import com.mascotas.rest.CRUD_Mascotas_BE_SpringBoot.models.dtos.MascotaDto;
import com.mascotas.rest.CRUD_Mascotas_BE_SpringBoot.models.entities.Mascota;
import com.mascotas.rest.CRUD_Mascotas_BE_SpringBoot.services.IMascota;

import jakarta.transaction.Transactional;
import lombok.Builder;

@Service
public class MascotaImpl implements IMascota {
	@Autowired
	private MascotaDao mascotaDao;

	@Transactional
	@Override
	public Mascota save(Mascota mascota) {
		return mascotaDao.save(mascota);
	}
	
	@Transactional
	@Override
	public Mascota findById(Integer id) {
		return mascotaDao.findById(id).orElse(null);
	}
	
	@Transactional
	@Override
	public void delete(Mascota mascota) {
		mascotaDao.delete(mascota);
	}
	
	@Transactional
	@Override
	public Iterable<Mascota> findAll() {
		return mascotaDao.findAll();
	}
	
}
