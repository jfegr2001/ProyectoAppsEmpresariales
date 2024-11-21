package com.demo.proyecto.domain.service;

import com.demo.proyecto.domain.dto.HistorialVacunasDTO;
import com.demo.proyecto.domain.repository.HistorialVacunasRepository;
import com.demo.proyecto.persistence.crud.HistorialVacunasCrudRepository;
import com.demo.proyecto.persistence.entity.HistorialVacunas;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class HistorialVacunasService {

    private final HistorialVacunasCrudRepository historialVacunasCrudRepository;

    public HistorialVacunasService(HistorialVacunasCrudRepository historialVacunasCrudRepository) {
        this.historialVacunasCrudRepository = historialVacunasCrudRepository;
    }


}