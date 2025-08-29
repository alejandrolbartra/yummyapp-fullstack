package com.app.yummy.domain.usuario.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import java.time.LocalDateTime;

@Entity
@Table(name = "usuario")
@Data
public class UsuarioModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_usuario")
    private long idUsuario;
    @Column(name = "Nombre")
    private String nombre;
    @Column(name = "Apellido")
    private String apellido;
    @Column(name = "Correo")
    private String correo;
    @Column(name = "Pass")
    private String pass;
    @Column(name = "estado")
    private int estado;
    @Column(name = "fecha_creacion")
    private LocalDateTime fechaCreacion;
    @Column(name = "fecha_actualizacion")
    private LocalDateTime fechaActualizacion;
    @Column(name = "usuario_creacion")
    private String usuarioCreacion;
    @Column(name = "usuario_actualizacion")
    private String usuarioActualizacion;
    @Column(name = "rol")
    private String rol;

    public String getRol() {
        return rol;
    }
    public void setRol(String rol) {
        this.rol = rol;
    }
}