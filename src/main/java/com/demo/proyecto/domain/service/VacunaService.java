package com.demo.proyecto.domain.service;

import com.demo.proyecto.domain.repository.VacunaRepository;
import com.demo.proyecto.persistence.crud.VacunaCrudRepository;
import com.demo.proyecto.persistence.entity.Vacuna;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
    public class VacunaService {
        private final VacunaCrudRepository vacunaCrudRepository;

        public VacunaService(VacunaCrudRepository vacunaCrudRepository) {
            this.vacunaCrudRepository = vacunaCrudRepository;
        }

        // Guardar una vacuna
        public Vacuna saveVacuna(Vacuna vacuna) {
            // Verificar si el nombre de la vacuna ya está registrado
            boolean existsByNombre = vacunaCrudRepository.existsByNombre(vacuna.getNombre());

            // Lanzar excepciones en caso de que las validaciones fallen
            if (existsByNombre) {
                throw new IllegalArgumentException("El nombre de la vacuna ya está registrado.");
            }
            return vacunaCrudRepository.save(vacuna);
        }

        // Obtener todas las vacunas
        public List<Vacuna> getAllVacunas() {
            return vacunaCrudRepository.findAll();
        }

        // Buscar una vacuna por ID
        public Optional<Vacuna> getVacunaById(Long id) {
            return vacunaCrudRepository.findById(id);
        }

        // Actualizar una vacuna
        public Vacuna updateVacuna(Long id, Vacuna vacuna) {
            Optional<Vacuna> vacunaExistente = vacunaCrudRepository.findById(id);
            if (vacunaExistente.isEmpty()) {
                throw new IllegalArgumentException("Vacuna no encontrada.");
            }

            // Validar que el nuevo nombre no exista (excepto para la propia vacuna)
            Optional<Vacuna> vacunaConMismoNombre = vacunaCrudRepository.findByNombre(vacuna.getNombre());
            if (vacunaConMismoNombre.isPresent() && !vacunaConMismoNombre.get().getId().equals(id)) {
                throw new IllegalArgumentException("El nombre de la vacuna ya está registrado.");
            }

            Vacuna vacunaActualizada = vacunaExistente.get();
            vacunaActualizada.setNombre(vacuna.getNombre());
            vacunaActualizada.setDosis(vacuna.getDosis());
            vacunaActualizada.setDescripcion(vacuna.getDescripcion());
            return vacunaCrudRepository.save(vacunaActualizada);
        }

        // Eliminar una vacuna
        public void deleteVacuna(Long id) {
            if (!vacunaCrudRepository.existsById(id)) {
                throw new IllegalArgumentException("Vacuna no encontrada.");
            }
            vacunaCrudRepository.deleteById(id);
        }





    }