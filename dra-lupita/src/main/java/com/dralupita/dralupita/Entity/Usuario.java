package com.dralupita.dralupita.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "usuario")
public class Usuario extends ABaseEntity{

    @Column(name = "nombre_usuario", length = 30, nullable = false)
    private String nombre_usuario;

    @Column(name = "password", length = 32, nullable = false)
    private String password;

    @Column(name = "rol", length = 30, nullable = false)
    private String rol;

    public String getNombre_usuario() {
        return nombre_usuario;
    }

    public void setNombre_usuario(String nombre_usuario) {
        this.nombre_usuario = nombre_usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }
}
