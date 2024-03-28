package com.mascotas.rest.CRUD_Mascotas_BE_SpringBoot.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.mascotas.rest.CRUD_Mascotas_BE_SpringBoot.models.entities.Mascota;
import com.mascotas.rest.CRUD_Mascotas_BE_SpringBoot.services.IMascota;

@RestController
@RequestMapping("/api/v1")
@CrossOrigin(origins = "http://localhost:4200")
public class MascotaController {
	
	@Autowired
	private IMascota mascotaService;
	
	@PostMapping("/mascota")
	@ResponseStatus(HttpStatus.CREATED)
	public Mascota create(@RequestBody Mascota mascota) {
		return mascotaService.save(mascota);
	}
	
	@PutMapping("/mascota")
	@ResponseStatus(HttpStatus.CREATED)
	public Mascota update(@RequestBody Mascota mascota) {
		return mascotaService.save(mascota);
	}
	
	@DeleteMapping("/mascota/{id}")
	public ResponseEntity<?> delete(@PathVariable Integer id) {
		Map<String, Object> response = new HashMap<>();
		try {
			Mascota mascotaDel = mascotaService.findById(id);
			mascotaService.delete(mascotaDel);
			return new ResponseEntity<>(mascotaDel, HttpStatus.NO_CONTENT);
		} catch (DataAccessException e) {
			response.put("mensaje", e.getMessage());
			response.put("mascota", null);
			return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@GetMapping("/mascota/{id}")
	@ResponseStatus(HttpStatus.OK)
	public Mascota showById(@PathVariable Integer id) {
		return mascotaService.findById(id);
	}
	
	@GetMapping("/mascotas")
	@ResponseStatus(HttpStatus.OK)
	public Iterable<Mascota> show() {
		return mascotaService.findAll();
	}
}
