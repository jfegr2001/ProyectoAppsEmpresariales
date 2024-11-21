package com.demo.proyecto.persistence.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "vacunas")
public class Vacuna {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String dosis;
    private String descripcion;

    @OneToMany(mappedBy = "vacuna", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<HistorialVacunas> historialVacunas;


    public Vacuna() {
    }

    // Getters y Setters


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDosis() {
        return dosis;
    }

    public void setDosis(String dosis) {
        this.dosis = dosis;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public List<HistorialVacunas> getHistorialVacunas() {
        return historialVacunas;
    }

    public void setHistorialVacunas(List<HistorialVacunas> historialVacunas) {
        this.historialVacunas = historialVacunas;
    }
}
