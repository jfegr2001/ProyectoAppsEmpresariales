package com.demo.proyecto.controller.web;


import com.demo.proyecto.domain.service.VacunaService;
import com.demo.proyecto.persistence.entity.Vacuna;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

    @RestController
    @RequestMapping("/vacunas")
    public class VacunaController {
        private final VacunaService vacunaService;

        public VacunaController(VacunaService vacunaService) {
            this.vacunaService = vacunaService;
        }

        // Crear una nueva vacuna
        @PostMapping("/guardar")
        public ResponseEntity<?> saveVacuna(@RequestBody Vacuna vacuna) {
            try {
                Vacuna savedVacuna = vacunaService.saveVacuna(vacuna);
                return ResponseEntity.status(HttpStatus.CREATED).body(savedVacuna);
            } catch (IllegalArgumentException e) {
                return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
            }
        }

    // Obtener todas las vacunas
    @GetMapping("/AllVacunas")
    public ResponseEntity<List<Vacuna>> getAllVacunas() {
        return new ResponseEntity<>(vacunaService.getAllVacunas(), HttpStatus.OK);
    }

    // Obtener una vacuna por ID
    @GetMapping("/AllVacunas/{id}")
    public ResponseEntity<Vacuna> getVacunaById(@PathVariable Long id) {
        return vacunaService.getVacunaById(id)
                .map(ResponseEntity::ok)
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    // Actualizar una vacuna
    @PutMapping("/editarVacuna/{id}")
    public ResponseEntity<Vacuna> updateVacuna(@PathVariable Long id, @RequestBody Vacuna vacuna) {
        try {
            return new ResponseEntity<>(vacunaService.updateVacuna(id, vacuna), HttpStatus.OK);
        } catch (IllegalArgumentException e) {
            return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
        }
    }

    // Eliminar una vacuna
    @DeleteMapping("/eliminarVacuna/{id}")
    public ResponseEntity<Void> deleteVacuna(@PathVariable Long id) {
        try {
            vacunaService.deleteVacuna(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (IllegalArgumentException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}