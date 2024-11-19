package com.demo.proyecto.persistence.crud;

import com.demo.proyecto.persistence.entity.Vacuna;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VacunaCrudRepository extends JpaRepository<Vacuna, Long> {
}