package com.demo.proyecto.controller.web;


import com.demo.proyecto.domain.service.PropietarioService;
import com.demo.proyecto.persistence.entity.Propietario;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/propietarios")
@CrossOrigin(origins = "http://localhost:4200")
public class PropietarioController {

    @Autowired
    private PropietarioService propietarioService;

    public PropietarioController(PropietarioService propietarioService) {
        this.propietarioService = propietarioService;
    }


    @Operation(
            summary = "Registrar propietario",
            description = "Registra un nuevo propietario en el sistema, verificando que el documento y el nombre de usuario no estén ya registrados."
    )
    @ApiResponses(value = {
            @ApiResponse(
                    responseCode = "201",
                    description = "Propietario registrado exitosamente",
                    content = @Content(mediaType = "application/json", schema = @Schema(implementation = Propietario.class))
            ),
            @ApiResponse(
                    responseCode = "400",
                    description = "Error en la solicitud, el documento o nombre de usuario ya existen",
                    content = @Content(mediaType = "application/json")
            )
    })
    @PostMapping("/registrar")
    public ResponseEntity<?> savePropietario(@RequestBody Propietario propietario) {
        try {
            Propietario savedPropietario = propietarioService.savePropietario(propietario);
            return ResponseEntity.status(HttpStatus.CREATED).body(savedPropietario);
        } catch (IllegalArgumentException e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
        }
    }

    @Operation(
            summary = "Buscar propietario por documento",
            description = "Busca un propietario en el sistema utilizando su documento único."
    )
    @ApiResponses(value = {
            @ApiResponse(
                    responseCode = "200",
                    description = "Propietario encontrado",
                    content = @Content(mediaType = "application/json", schema = @Schema(implementation = Propietario.class))
            ),
            @ApiResponse(
                    responseCode = "404",
                    description = "Propietario no encontrado",
                    content = @Content(mediaType = "application/json")
            )
    })
    @GetMapping("/buscar/{documento}")
    public ResponseEntity<?> getPropietarioByDocumento(@PathVariable String documento) {
        Optional<Propietario> propietario = propietarioService.getPropietarioByDocumento(documento);
        if (propietario.isPresent()) {
            return ResponseEntity.ok(propietario.get());
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Propietario no encontrado");
        }
    }

    @Operation(
            summary = "Obtener todos los propietarios",
            description = "Devuelve una lista con todos los propietarios registrados en el sistema."
    )
    @ApiResponses(value = {
            @ApiResponse(
                    responseCode = "200",
                    description = "Lista de propietarios obtenida exitosamente",
                    content = @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = Propietario.class)))
            )
    })
    @GetMapping("/buscar")
    public ResponseEntity<List<Propietario>> getAllPropietarios() {
        List<Propietario> propietarios = propietarioService.getAllPropietarios();
        return ResponseEntity.ok(propietarios);
    }

    @Operation(
            summary = "Eliminar propietario por documento",
            description = "Elimina un propietario del sistema utilizando su documento único."
    )
    @ApiResponses(value = {
            @ApiResponse(
                    responseCode = "200",
                    description = "Propietario eliminado exitosamente",
                    content = @Content(mediaType = "application/json")
            ),
            @ApiResponse(
                    responseCode = "404",
                    description = "Propietario no encontrado",
                    content = @Content(mediaType = "application/json")
            )
    })
    @DeleteMapping("/eliminar/{documento}")
    public ResponseEntity<?> deletePropietarioByDocumento(@PathVariable String documento) {
        boolean isDeleted = propietarioService.deletePropietarioByDocumento(documento);
        if (isDeleted) {
            return ResponseEntity.ok("Propietario eliminado con éxito.");
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Propietario no encontrado.");
        }
    }

    @Operation(
            summary = "Actualizar propietario",
            description = "Actualiza la información de un propietario existente utilizando su documento único."
    )
    @ApiResponses(value = {
            @ApiResponse(
                    responseCode = "200",
                    description = "Propietario actualizado exitosamente",
                    content = @Content(mediaType = "application/json", schema = @Schema(implementation = Propietario.class))
            ),
            @ApiResponse(
                    responseCode = "400",
                    description = "Error en la solicitud, el documento en la URL y el cuerpo deben coincidir",
                    content = @Content(mediaType = "application/json")
            ),
            @ApiResponse(
                    responseCode = "404",
                    description = "Propietario no encontrado",
                    content = @Content(mediaType = "application/json")
            )
    })
    @PutMapping("/actualizar/{documento}")
    public ResponseEntity<?> saveOrUpdatePropietario(@PathVariable String documento, @RequestBody Propietario propietario) {
        if (!documento.equals(propietario.getDocumento())) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("El documento en la URL y el cuerpo deben coincidir.");
        }
        try {
            Propietario propietarioGuardado = propietarioService.saveOrUpdatePropietario(propietario);
            return ResponseEntity.ok(propietarioGuardado);
        } catch (IllegalArgumentException e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
        }
    }

}
