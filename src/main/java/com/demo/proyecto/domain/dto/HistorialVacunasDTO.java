package com.demo.proyecto.domain.dto;

public class HistorialVacunasDTO {
    private long id;
    private long idMascota;         // ID de la mascota
    private long idVacuna;          // ID de la vacuna
    private String fechaAplicacion;   // Fecha de aplicación (ej. "yyyy-MM-dd")
    private String observaciones;


    public HistorialVacunasDTO(long id, long idMascota, long idVacuna, String fechaAplicacion, String observaciones) {
        this.id = id;
        this.idMascota = idMascota;
        this.idVacuna = idVacuna;
        this.fechaAplicacion = fechaAplicacion;
        this.observaciones = observaciones;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getIdMascota() {
        return idMascota;
    }

    public void setIdMascota(long idMascota) {
        this.idMascota = idMascota;
    }

    public long getIdVacuna() {
        return idVacuna;
    }

    public void setIdVacuna(long idVacuna) {
        this.idVacuna = idVacuna;
    }

    public String getFechaAplicacion() {
        return fechaAplicacion;
    }

    public void setFechaAplicacion(String fechaAplicacion) {
        this.fechaAplicacion = fechaAplicacion;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
}