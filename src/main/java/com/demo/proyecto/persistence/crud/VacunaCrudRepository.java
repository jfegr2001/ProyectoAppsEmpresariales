package com.demo.proyecto.persistence.crud;

import com.demo.proyecto.persistence.entity.Vacuna;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface VacunaCrudRepository extends JpaRepository<Vacuna, Long> {

    Optional<Vacuna> findByNombre(String nombre);
    boolean existsByNombre(String nombre);

}