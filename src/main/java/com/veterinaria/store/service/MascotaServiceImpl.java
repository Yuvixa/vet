package com.veterinaria.store.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.veterinaria.store.entity.Mascota;
import com.veterinaria.store.repository.MascotaRepository;


@Service
public class MascotaServiceImpl implements MascotaService {
	
	@Autowired
	private MascotaRepository repository;
	
	

	@Override
	public List<Mascota> listadoMascotas() {
		
		return repository.findAll();
	}

	@Override
	public Mascota insertaActualizaMascota(Mascota mas) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void eliminaMascota(int idMascota) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Optional<Mascota> buscarMascota(int idMascota) {
		// TODO Auto-generated method stub
		return null;
	}

}
