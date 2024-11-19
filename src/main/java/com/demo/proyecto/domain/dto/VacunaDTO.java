package com.demo.proyecto.domain.dto;

public class VacunaDTO {
    private Long id;
    private String nombre;
    private String dosis;
    private String descripcion;


    public VacunaDTO(String descripcion, String dosis, Long id, String nombre) {
        this.descripcion = descripcion;
        this.dosis = dosis;
        this.id = id;
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDosis() {
        return dosis;
    }

    public void setDosis(String dosis) {
        this.dosis = dosis;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}


