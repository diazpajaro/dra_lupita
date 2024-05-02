package com.dralupita.dralupita.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "patrocinador")
public class Patrocinador extends ABaseEntity{

    @Column(name = "nombre", length = 45, nullable = false)
    private String nombre;

    @Column(name = "contacto", length = 45, nullable = false)
    private String contacto;

    @Column(name = "direccion", length = 45, nullable = false)
    private String direccion;

    @Column(name = "enfoque", length = 45, nullable = false)
    private String enfoque;

    @Column(name = "nivel_patrocinio", length = 45, nullable = false)
    private String nivel_patrocinio;

    @Column(name = "historial", length = 45, nullable = false)
    private String historial;

    @Column(name = "estadisticas_uso", length = 45, nullable = false)
    private String estadisticas_uso;

    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "registro_usuario_id", nullable = false)
    private Usuario registro_usuario_id;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEnfoque() {
        return enfoque;
    }

    public void setEnfoque(String enfoque) {
        this.enfoque = enfoque;
    }

    public String getNivel_patrocinio() {
        return nivel_patrocinio;
    }

    public void setNivel_patrocinio(String nivel_patrocinio) {
        this.nivel_patrocinio = nivel_patrocinio;
    }

    public String getHistorial() {
        return historial;
    }

    public void setHistorial(String historial) {
        this.historial = historial;
    }

    public String getEstadisticas_uso() {
        return estadisticas_uso;
    }

    public void setEstadisticas_uso(String estadisticas_uso) {
        this.estadisticas_uso = estadisticas_uso;
    }

    public Usuario getRegistro_usuario_id() {
        return registro_usuario_id;
    }

    public void setRegistro_usuario_id(Usuario registro_usuario_id) {
        this.registro_usuario_id = registro_usuario_id;
    }
}
