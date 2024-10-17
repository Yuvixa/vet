package com.veterinaria.store.service;

import java.util.List;
import java.util.Optional;
import com.veterinaria.store.entity.Mascota;

public interface MascotaService {
	
	public abstract List<Mascota> listadoMascotas();
	
	public abstract Mascota insertaActualizaMascota(Mascota mas);
	
	public abstract void eliminaMascota(int idMascota);
	
	public abstract Optional<Mascota> buscarMascota(int idMascota);

}
