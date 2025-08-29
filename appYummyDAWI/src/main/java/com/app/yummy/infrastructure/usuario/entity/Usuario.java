package com.app.yummy.infrastructure.usuario.entity;

import com.app.yummy.infrastructure.shared.Auditoria;
import jakarta.persistence.*;

import lombok.*;
//@Builder
@Entity
@Table(name="usuario")
public class Usuario extends Auditoria<String> {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="id_usuario")
    private long usuarioid;

    @Column(name="nombre")
    private String nombre;
    @Column(name = "Apellido")
    private String apellido;
    @Column(name = "Correo")
    private String correo;
    @Column(name = "Pass")
    private String pass;


    //auditoria
    //@Column(name="fecha_creacion")
    // private String fecha_creacion;
    //@Column(name="usuario_creacion")
    //private String usuario_creacion;
    //@Column(name="fecha_actualizacion")
    //private String fecha_actualizacion;
    //@Column(name="usuario_actualizacion")
    //private String usuario_actualizacion;


    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public long getUsuarioid() {
        return usuarioid;
    }

    public void setUsuarioid(long usuarioid) {
        this.usuarioid = usuarioid;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
}
