package com.dralupita.dralupita.Entity;


import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "paciente")
public class Paciente extends ABaseEntity {
    @Column(name = "nombre", length = 50, nullable = false)
    private String nombre;

    @Column(name = "apellido", length = 50, nullable = false)
    private String apellido;

    @Column(name = "fecha_nacimiento", length = 6, nullable = false)
    private Date fecha_nacimiento;

    @Column(name = "genero", length = 12, nullable = false)
    private String genero;

    @Column(name = "tipo_usuario", length = 30, nullable = false)
    private String tipo_usuario;

    @Column(name = "direccion", length = 100, nullable = false)
    private String direccion;

    @Column(name = "telefono", length = 15, nullable = false)
    private String telefono;

    @Column(name = "correo_electronico", length = 50, nullable = false)
    private String correo;

    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "registro_usuario_id", nullable = false)
    private Usuario registro_usuario_id;

    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "eps_id", nullable = false)
    private Usuario eps_id;

    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "ips_id", nullable = false)
    private Usuario ips_id;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Date getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(Date fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getTipo_usuario() {
        return tipo_usuario;
    }

    public void setTipo_usuario(String tipo_usuario) {
        this.tipo_usuario = tipo_usuario;
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

    public Usuario getEps_id() {
        return eps_id;
    }

    public void setEps_id(Usuario eps_id) {
        this.eps_id = eps_id;
    }

    public Usuario getIps_id() {
        return ips_id;
    }

    public void setIps_id(Usuario ips_id) {
        this.ips_id = ips_id;
    }
}
