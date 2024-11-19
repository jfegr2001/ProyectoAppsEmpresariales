package com.demo.proyecto.domain.service;

import com.demo.proyecto.domain.repository.PropietarioRepository;
import com.demo.proyecto.persistence.crud.PropietarioCrudRepository;
import com.demo.proyecto.persistence.entity.Propietario;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PropietarioService {


    private final PropietarioCrudRepository propietarioCrudRepository;

    public PropietarioService(PropietarioCrudRepository propietarioCrudRepository) {
        this.propietarioCrudRepository = propietarioCrudRepository;
    }

    public List<Propietario> getAllPropietarios() {
        return propietarioCrudRepository.findAll();
    }

    public Propietario getPropietarioById(Long id) {
        return propietarioCrudRepository.findById(id).orElse(null);
    }

    public Propietario savePropietario(Propietario propietario) {
        return propietarioCrudRepository.save(propietario);
    }

    public void deletePropietarioById(Long id) {
        propietarioCrudRepository.deleteById(id);
    }
}