package com.demo.proyecto.persistence.entity;

import jakarta.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "mascotas")
public class Mascota {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String tipo;

    @Temporal(TemporalType.DATE)
    private Date fechaNacimiento;

    @ManyToOne
    @JoinColumn(name = "id_propietario", nullable = false)
    private Propietario propietario;

    @OneToMany(mappedBy = "mascota", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<HistorialVacunas> historialVacunas;

    public Mascota() {
    }


    // Getters y Setters


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

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
    }

    public List<HistorialVacunas> getHistorialVacunas() {
        return historialVacunas;
    }

    public void setHistorialVacunas(List<HistorialVacunas> historialVacunas) {
        this.historialVacunas = historialVacunas;
    }

}
