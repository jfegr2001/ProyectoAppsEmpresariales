package com.demo.proyecto.domain.dto;

public class MascotaDTO {
    private long id;
    private String nombre;
    private String tipoMascota;
    private long idPropietario;   // ID del propietario


    public MascotaDTO(long id, String nombre, String tipoMascota, long idPropietario) {
        this.id = id;
        this.nombre = nombre;
        this.tipoMascota = tipoMascota;
        this.idPropietario = idPropietario;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoMascota() {
        return tipoMascota;
    }

    public void setTipoMascota(String tipoMascota) {
        this.tipoMascota = tipoMascota;
    }

    public long getIdPropietario() {
        return idPropietario;
    }

    public void setIdPropietario(long idPropietario) {
        this.idPropietario = idPropietario;
    }
}
