package com.demo.proyecto.persistence.crud;

import com.demo.proyecto.persistence.entity.Propietario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PropietarioCrudRepository extends JpaRepository<Propietario, Long> {

    boolean existsByDocumento(String documento);
    boolean existsByNombreUsuario(String nombreUsuario);
    Optional<Propietario> findByDocumento(String documento);
    List<Propietario> findAllByDocumento(String documento);

}

