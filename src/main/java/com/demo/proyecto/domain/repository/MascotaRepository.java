package com.demo.proyecto.domain.repository;

import com.demo.proyecto.persistence.entity.Mascota;

import java.util.List;

public interface MascotaRepository {

    List<Mascota> findAll();

    Mascota findById(String id);

    Mascota save(Mascota mascota);

    void deleteById(String id);
}

