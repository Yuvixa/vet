package com.veterinaria.store.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.veterinaria.store.entity.Mascota;

public interface MascotaRepository extends JpaRepository<Mascota, Integer> {
	
	

}
