package com.veterinaria.store.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.veterinaria.store.entity.Mascota;
import com.veterinaria.store.service.MascotaService;

@RestController
@RequestMapping("/rest/mascota")
@CrossOrigin(origins = "http://localhost:4200")
public class MascotaController {
	
	@Autowired
	private MascotaService mascotaService;
	
	public ResponseEntity<List<Mascota>> listaMascotas(){
		List<Mascota> lista = mascotaService.listadoMascotas();
		return ResponseEntity.ok(lista);
	}

}
