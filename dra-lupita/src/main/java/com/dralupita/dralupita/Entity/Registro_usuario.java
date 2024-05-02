package com.dralupita.dralupita.Entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "registro_usuario")
public class Registro_usuario extends ABaseEntity{
    @Column(name = "fecha_hora_registro", length = 6, nullable = false)
    private Date fecha_hora_registro;

    @Column(name = "descripcion_registro", length = 45, nullable = false)
    private String descripcion_registro;

    @Column(name = "resultado", length = 12, nullable = false)
    private String resultado;

    @Column(name = "ip_origen", length = 45, nullable = false)
    private String ip_origen;

    @Column(name = "dispositivo", length = 45, nullable = false)
    private String dispositivo;

    @Column(name = "ubicacion_geografica", length = 45, nullable = false)
    private String ubicacion_geografica;

    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "usuario_id", nullable = false)
    private Usuario usuario_id;

    public Date getFecha_hora_registro() {
        return fecha_hora_registro;
    }

    public void setFecha_hora_registro(Date fecha_hora_registro) {
        this.fecha_hora_registro = fecha_hora_registro;
    }

    public String getDescripcion_registro() {
        return descripcion_registro;
    }

    public void setDescripcion_registro(String descripcion_registro) {
        this.descripcion_registro = descripcion_registro;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    public String getIp_origen() {
        return ip_origen;
    }

    public void setIp_origen(String ip_origen) {
        this.ip_origen = ip_origen;
    }

    public String getDispositivo() {
        return dispositivo;
    }

    public void setDispositivo(String dispositivo) {
        this.dispositivo = dispositivo;
    }

    public String getUbicacion_geografica() {
        return ubicacion_geografica;
    }

    public void setUbicacion_geografica(String ubicacion_geografica) {
        this.ubicacion_geografica = ubicacion_geografica;
    }

    public Usuario getUsuario_id() {
        return usuario_id;
    }

    public void setUsuario_id(Usuario usuario_id) {
        this.usuario_id = usuario_id;
    }
}
