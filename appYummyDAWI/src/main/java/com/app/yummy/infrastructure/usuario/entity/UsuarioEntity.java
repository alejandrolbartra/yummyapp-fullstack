package com.app.yummy.infrastructure.usuario.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name="usuario")
@Getter
@Setter
//@NoArgsConstructor
//@AllArgsConstructor
//@Builder
public class UsuarioEntity {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="id_usuario")
    private long idUsuario;

    @Column(name="nombre")
    private String nombre;
    
    @Column(name="apellido")
    private String apellido;
    
    @Column(name="correo")
    private String correo;
    
    @Column(name="rol")
    private String rol;
    
    @Column(name="pass")
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
}
