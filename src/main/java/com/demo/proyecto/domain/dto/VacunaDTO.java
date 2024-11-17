package com.demo.proyecto.domain.dto;

public class VacunaDTO {
    private String id;
    private String nombre;
    private String dosis;
    private String descripcion;

    public VacunaDTO(String id, String descripcion, String dosis, String nombre) {
        this.id = id;
        this.descripcion = descripcion;
        this.dosis = dosis;
        this.nombre = nombre;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDosis() {
        return dosis;
    }

    public void setDosis(String dosis) {
        this.dosis = dosis;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}

