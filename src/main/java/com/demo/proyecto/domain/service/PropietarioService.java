package com.demo.proyecto.domain.service;

import com.demo.proyecto.persistence.crud.PropietarioCrudRepository;
import com.demo.proyecto.persistence.entity.Propietario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.Set;

@Service
public class PropietarioService {

    @Autowired
    private  PropietarioCrudRepository propietarioCrudRepository;


    public PropietarioService(PropietarioCrudRepository propietarioCrudRepository) {
        this.propietarioCrudRepository = propietarioCrudRepository;
    }


    public Propietario savePropietario(Propietario propietario) {
        boolean existsByDocumento = propietarioCrudRepository.existsByDocumento(propietario.getDocumento());
        boolean existsByNombreUsuario = propietarioCrudRepository.existsByNombreUsuario(propietario.getNombreUsuario());

        if (existsByDocumento) {
            throw new IllegalArgumentException("El documento ya está registrado.");
        }

        if (existsByNombreUsuario) {
            throw new IllegalArgumentException("El nombre de usuario ya está registrado.");
        }

        return propietarioCrudRepository.save(propietario);
    }


    // Buscar todos los propietarios
    public List<Propietario> getAllPropietarios() {
        return propietarioCrudRepository.findAll();
    }

    public List<Propietario> findAllByDocumento(String documento) {
        return propietarioCrudRepository.findAll();
    }


    // Buscar propietario por documento
    public Optional<Propietario> getPropietarioByDocumento(String documento) {
        return propietarioCrudRepository.findByDocumento(documento);
    }


    public boolean deletePropietarioByDocumento(String documento) {
        Optional<Propietario> propietario = propietarioCrudRepository.findByDocumento(documento);
        if (propietario.isPresent()) {
            propietarioCrudRepository.delete(propietario.get());
            return true;
        }
        return false;
    }

    public Propietario saveOrUpdatePropietario(Propietario propietario) {
        Optional<Propietario> propietarioExistente = propietarioCrudRepository.findByDocumento(propietario.getDocumento());

        if (propietarioExistente.isPresent()) {
            // Si el documento ya existe, actualizamos
            Propietario propietarioToUpdate = propietarioExistente.get();

            // Actualizar solo los campos necesarios
            propietarioToUpdate.setNombre(propietario.getNombre());
            propietarioToUpdate.setTelefono(propietario.getTelefono());
            propietarioToUpdate.setNombreUsuario(propietario.getNombreUsuario());
            propietarioToUpdate.setPassword(propietario.getPassword());
            propietarioToUpdate.setDireccion(propietario.getDireccion());

            return propietarioCrudRepository.save(propietarioToUpdate);
        } else {
            // Si el documento no existe, creamos un nuevo propietario
            boolean existsByNombreUsuario = propietarioCrudRepository.existsByNombreUsuario(propietario.getNombreUsuario());

            if (existsByNombreUsuario) {
                throw new IllegalArgumentException("El nombre de usuario ya está registrado.");
            }

            return propietarioCrudRepository.save(propietario);
        }
    }





}