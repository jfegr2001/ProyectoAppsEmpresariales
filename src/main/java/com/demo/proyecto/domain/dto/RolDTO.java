package com.demo.proyecto.domain.dto;

public class RolDTO {

    private   String rolId;
    private  String nombre;

    public RolDTO(String rolId, String nombre) {
        this.rolId = rolId;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRolId() {
        return rolId;
    }

    public void setRolId(String rolId) {
        this.rolId = rolId;
    }
}
