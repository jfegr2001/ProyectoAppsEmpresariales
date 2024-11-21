package com.demo.proyecto.persistence.crud;

import com.demo.proyecto.persistence.entity.Mascota;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MascotaCrudRepository extends JpaRepository<Mascota, Long> {
}
