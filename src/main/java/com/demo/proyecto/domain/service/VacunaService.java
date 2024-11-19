package com.demo.proyecto.domain.service;

import com.demo.proyecto.domain.repository.VacunaRepository;
import com.demo.proyecto.persistence.crud.VacunaCrudRepository;
import com.demo.proyecto.persistence.entity.Vacuna;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VacunaService {
    private final VacunaCrudRepository vacunaCrudRepository;

    public VacunaService(VacunaCrudRepository vacunaCrudRepository) {
        this.vacunaCrudRepository = vacunaCrudRepository;
    }

    public List<Vacuna> getAllVacunas() {
        return vacunaCrudRepository.findAll();
    }

    public Vacuna getVacunaById(Long id) {
        return vacunaCrudRepository.findById(id).orElse(null);
    }

    public Vacuna saveVacuna(Vacuna vacuna) {
        return vacunaCrudRepository.save(vacuna);
    }

    public void deleteVacunaById(Long id) {
        vacunaCrudRepository.deleteById(id);
    }
}