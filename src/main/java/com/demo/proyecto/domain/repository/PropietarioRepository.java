package com.demo.proyecto.domain.repository;

import com.demo.proyecto.persistence.entity.Propietario;

import java.util.List;
public interface PropietarioRepository {

    List<Propietario> findAll();

    Propietario findById(String id);

    Propietario save(Propietario propietario);

    void deleteById(String id);
}
