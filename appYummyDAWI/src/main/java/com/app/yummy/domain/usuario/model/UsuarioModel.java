package com.app.yummy.domain.usuario.model;

import lombok.Data;

<<<<<<< HEAD
public class UsuarioModel {
    private long usuarioid;
    private String nombre;
    private String correo;
    private String pass;

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
=======
@Data
public class UsuarioModel {
    private long idUsuario;
    private String nombre;
    private String apellido;
    private String correo;
    private String rol;
    private String pass;

>>>>>>> 8e45b1fbdc7973e54eb84fbe74f9d9ebf42bc777
}
