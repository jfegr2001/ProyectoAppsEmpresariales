package com.demo.proyecto.persistence.entity;

import jakarta.persistence.*;
@Entity
public class UsuarioRol {


    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private long  usuarioRolId;

    @ManyToOne(fetch =  FetchType.EAGER)
    private Propietario propietario;

    @ManyToOne
    private Rol rol;

    public UsuarioRol() {
    }

    public long getUsuarioRolId() {
        return usuarioRolId;
    }

    public void setUsuarioRolId(long usuarioRolId) {
        this.usuarioRolId = usuarioRolId;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }
}
