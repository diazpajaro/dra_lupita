package com.dralupita.dralupita.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "ips")
public class Ips extends ABaseEntity{
    @Column(name = "nombre", length = 50, nullable = false)
    private String nombre;

    @Column(name = "nit", length = 45, nullable = false)
    private String nit;

    @Column(name = "tipo", length = 45, nullable = false)
    private String tipo;

    @Column(name = "direccion", length = 45, nullable = false)
    private String direccion;

    @Column(name = "telefono", length = 45, nullable = false)
    private String telefono;

    @Column(name = "correo", length = 45, nullable = false)
    private String correo;

    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "registro_usuario_id", nullable = false)
    private Usuario registro_usuario_id;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Usuario getRegistro_usuario_id() {
        return registro_usuario_id;
    }

    public void setRegistro_usuario_id(Usuario registro_usuario_id) {
        this.registro_usuario_id = registro_usuario_id;
    }
}
