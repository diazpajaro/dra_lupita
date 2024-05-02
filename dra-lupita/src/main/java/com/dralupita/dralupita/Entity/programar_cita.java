package com.dralupita.dralupita.Entity;


import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table (name = "programar_cita")
public class programar_cita extends ABaseEntity{

    @Column(name = "fecha_hora", length = 6, nullable = false)
    private Date fecha_hora;

    @Column(name = "estado_cita", length = 50, nullable = false)
    private String estado_cita;

    @Column(name = "comentarios", length = 50, nullable = false)
    private String comentarios;

    @Column(name = "ubicacion", length = 12, nullable = false)
    private String ubicacion;

    @Column(name = "recordatorio", length = 30, nullable = false)
    private String recordatorio;

    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "paciente_id", nullable = false)
    private Usuario paciente_id;

    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "especialidad_id", nullable = false)
    private Usuario especialidad_id;

    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "usuario_id", nullable = false)
    private Usuario usuario_id;

    public Date getFecha_hora() {
        return fecha_hora;
    }

    public void setFecha_hora(Date fecha_hora) {
        this.fecha_hora = fecha_hora;
    }

    public String getEstado_cita() {
        return estado_cita;
    }

    public void setEstado_cita(String estado_cita) {
        this.estado_cita = estado_cita;
    }

    public String getComentarios() {
        return comentarios;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getRecordatorio() {
        return recordatorio;
    }

    public void setRecordatorio(String recordatorio) {
        this.recordatorio = recordatorio;
    }

    public Usuario getPaciente_id() {
        return paciente_id;
    }

    public void setPaciente_id(Usuario paciente_id) {
        this.paciente_id = paciente_id;
    }

    public Usuario getEspecialidad_id() {
        return especialidad_id;
    }

    public void setEspecialidad_id(Usuario especialidad_id) {
        this.especialidad_id = especialidad_id;
    }

    public Usuario getUsuario_id() {
        return usuario_id;
    }

    public void setUsuario_id(Usuario usuario_id) {
        this.usuario_id = usuario_id;
    }
}
