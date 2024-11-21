package com.demo.proyecto.domain.repository;

import com.demo.proyecto.persistence.entity.Vacuna;

import java.util.List;

public interface VacunaRepository {

    List<Vacuna> findAll();

    Vacuna findById(String id);

    Vacuna save(Vacuna vacuna);

    void deleteById(String id);
}
