package com.demo.proyecto.domain.dto;

public class PropietarioDTO {
    private String id;
    private String nombre;
    private String telefono;
    private String direccion;
    private String email;

    public PropietarioDTO(String id, String email, String telefono, String direccion, String nombre) {
        this.id = id;
        this.email = email;
        this.telefono = telefono;
        this.direccion = direccion;
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

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

