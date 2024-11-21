    package com.demo.proyecto.persistence.entity;

    import jakarta.persistence.*;
    import java.util.Date;

    @Entity
    @Table(name = "historial_vacunas")
    public class HistorialVacunas {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @Temporal(TemporalType.DATE)
        private Date fechaAplicacion;

        private String observaciones;

        // Relación con Mascota
        @ManyToOne
        @JoinColumn(name = "id_mascota", nullable = false)
        private Mascota mascota;

        // Relación con Vacuna
        @ManyToOne
        @JoinColumn(name = "id_vacuna", nullable = false)
        private Vacuna vacuna;

        // Getters y Setters


        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public Date getFechaAplicacion() {
            return fechaAplicacion;
        }

        public void setFechaAplicacion(Date fechaAplicacion) {
            this.fechaAplicacion = fechaAplicacion;
        }

        public String getObservaciones() {
            return observaciones;
        }

        public void setObservaciones(String observaciones) {
            this.observaciones = observaciones;
        }

        public Mascota getMascota() {
            return mascota;
        }

        public void setMascota(Mascota mascota) {
            this.mascota = mascota;
        }

        public Vacuna getVacuna() {
            return vacuna;
        }

        public void setVacuna(Vacuna vacuna) {
            this.vacuna = vacuna;
        }
    }

