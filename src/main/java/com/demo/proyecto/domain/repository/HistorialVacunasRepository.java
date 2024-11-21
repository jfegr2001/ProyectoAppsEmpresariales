package com.demo.proyecto.domain.repository;
import com.demo.proyecto.persistence.entity.HistorialVacunas;

import java.util.List;

public interface HistorialVacunasRepository {

    List<HistorialVacunas> findAll();

    HistorialVacunas findById(String id);

    HistorialVacunas save(HistorialVacunas historialVacunas);

    void deleteById(String id);
}
