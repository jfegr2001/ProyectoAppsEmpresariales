package com.demo.proyecto.domain.dto;

public class MascotaDTO {
    private String id;
    private String nombre;
    private String tipo;
    private String fechaNacimiento; // Formato de fecha como String (ej. "yyyy-MM-dd")
    private String idPropietario;   // ID del propietario

    public MascotaDTO(String id, String nombre, String tipo, String fechaNacimiento, String idPropietario) {
        this.id = id;
        this.nombre = nombre;
        this.tipo = tipo;
        this.fechaNacimiento = fechaNacimiento;
        this.idPropietario = idPropietario;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdPropietario() {
        return idPropietario;
    }

    public void setIdPropietario(String idPropietario) {
        this.idPropietario = idPropietario;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
}
