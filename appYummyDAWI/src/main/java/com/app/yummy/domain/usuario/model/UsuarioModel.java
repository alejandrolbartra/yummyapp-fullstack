package com.app.yummy.domain.usuario.model;

import lombok.Data;



@Data
public class UsuarioModel {
    private long usuarioid;
    private String nombre;
    private String apellido;
    private String correo;
    private String rol;
    private String pass;
}

