package com.app.yummy.infrastructure.usuario.entity;

import com.app.yummy.infrastructure.shared.Auditoria;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name="usuario")
@Getter
@Setter
//@NoArgsConstructor
//@AllArgsConstructor
//@Builder
public class UsuarioEntity extends Auditoria<String> {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="id_usuario")
    private long usuarioid;

    @Column(name="nombre")
    private String nombre;

    @Column(name="descripcion")
    private String descripcion;

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
