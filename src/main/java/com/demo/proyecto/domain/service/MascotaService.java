package com.demo.proyecto.domain.service;

import com.demo.proyecto.domain.repository.MascotaRepository;
import com.demo.proyecto.persistence.crud.MascotaCrudRepository;
import com.demo.proyecto.persistence.entity.Mascota;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MascotaService {
    private final MascotaCrudRepository mascotaCrudRepository;

    public MascotaService(MascotaCrudRepository mascotaCrudRepository) {
        this.mascotaCrudRepository = mascotaCrudRepository;
    }

    public List<Mascota> getAllMascotas() {
        return mascotaCrudRepository.findAll();
    }

    public Mascota getMascotaById(String id) {
        return mascotaCrudRepository.findById(id).orElse(null);
    }

    public Mascota saveMascota(Mascota mascota) {
        return mascotaCrudRepository.save(mascota);
    }

    public void deleteMascotaById(String id) {
        mascotaCrudRepository.deleteById(id);
    }
}