package com.demo.proyecto.persistence.crud;

import com.demo.proyecto.persistence.entity.Propietario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PropietarioCrudRepository extends JpaRepository<Propietario, Long> {


}

