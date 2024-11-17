package com.demo.proyecto.domain.dto;

public class HistorialVacunasDTO {
    private String id;
    private String idMascota;         // ID de la mascota
    private String idVacuna;          // ID de la vacuna
    private String fechaAplicacion;   // Fecha de aplicación (ej. "yyyy-MM-dd")
    private String observaciones;

    public HistorialVacunasDTO(String id, String idMascota, String fechaAplicacion, String idVacuna, String observaciones) {
        this.id = id;
        this.idMascota = idMascota;
        this.fechaAplicacion = fechaAplicacion;
        this.idVacuna = idVacuna;
        this.observaciones = observaciones;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIdMascota() {
        return idMascota;
    }

    public void setIdMascota(String idMascota) {
        this.idMascota = idMascota;
    }

    public String getIdVacuna() {
        return idVacuna;
    }

    public void setIdVacuna(String idVacuna) {
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
