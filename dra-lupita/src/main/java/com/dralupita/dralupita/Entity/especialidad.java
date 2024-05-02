package com.dralupita.dralupita.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "especialidad")
public class especialidad extends ABaseEntity{
    @Column(name = "nombre_especialidad", length = 50, nullable = false)
    private String nombre_especialidad;

    @Column(name = "descripcion", length = 50, nullable = false)
    private String descripcion;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "profesional_salud_id", nullable = false)
    private Usuario profesional_salud_id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "programar_cita_id", nullable = false)
    private Usuario programar_cita_id;

    public String getNombre_especialidad() {
        return nombre_especialidad;
    }

    public void setNombre_especialidad(String nombre_especialidad) {
        this.nombre_especialidad = nombre_especialidad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Usuario getProfesional_salud_id() {
        return profesional_salud_id;
    }

    public void setProfesional_salud_id(Usuario profesional_salud_id) {
        this.profesional_salud_id = profesional_salud_id;
    }

    public Usuario getProgramar_cita_id() {
        return programar_cita_id;
    }

    public void setProgramar_cita_id(Usuario programar_cita_id) {
        this.programar_cita_id = programar_cita_id;
    }
}
