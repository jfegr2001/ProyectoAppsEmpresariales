package com.demo.proyecto.persistence.entity;


import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table (name= "roles")
public class Rol {


    @Id
    private String rolId;
    private String nombre;


    @OneToMany(cascade =  CascadeType.ALL,fetch = FetchType.EAGER,mappedBy = "rol")
    private Set<UsuarioRol> usuarioRoles  =  new HashSet<>();

    public Rol() {
    }

    public String getRolId() {
        return rolId;
    }

    public void setRolId(String rolId) {
        this.rolId = rolId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
