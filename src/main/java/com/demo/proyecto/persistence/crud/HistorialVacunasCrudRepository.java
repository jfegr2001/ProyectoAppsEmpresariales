package com.demo.proyecto.persistence.crud;

import com.demo.proyecto.persistence.entity.HistorialVacunas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HistorialVacunasCrudRepository extends JpaRepository<HistorialVacunas, Long> {

}
