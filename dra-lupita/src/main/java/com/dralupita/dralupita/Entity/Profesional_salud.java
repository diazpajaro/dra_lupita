package com.dralupita.dralupita.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "profesional_salud")
public class Profesional_salud extends ABaseEntity {
    @Column(name = "nombre", length = 50, nullable = false)
    private String nombre;

    @Column(name = "apellido", length = 50, nullable = false)
    private String apellido;

    @Column(name = "especialidad", length = 50, nullable = false)
    private String especialidad;

    @Column(name = "numero_licencia", length = 45, nullable = false)
    private Integer numero_licencia;

    @Column(name = "correo_electronico", length = 50, nullable = false)
    private String correo_electronico;

    @Column(name = "telefono", length = 10, nullable = false)
    private String telefono;

    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "registro_usuario_id", nullable = false)
    private Usuario registro_usuario_id;

    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "eps_id", nullable = false)
    private Usuario eps_id;

    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "ips_id", nullable = false)
    private Usuario ips_id;

    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "paciente_id", nullable = false)
    private Usuario paciente_id;

    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "especialidad_id", nullable = false)
    private Usuario especialidad_id;

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

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public Integer getNumero_licencia() {
        return numero_licencia;
    }

    public void setNumero_licencia(Integer numero_licencia) {
        this.numero_licencia = numero_licencia;
    }

    public String getCorreo_electronico() {
        return correo_electronico;
    }

    public void setCorreo_electronico(String correo_electronico) {
        this.correo_electronico = correo_electronico;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
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
}
