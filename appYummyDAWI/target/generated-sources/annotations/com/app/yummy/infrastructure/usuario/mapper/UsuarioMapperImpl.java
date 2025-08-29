package com.app.yummy.infrastructure.usuario.mapper;

import com.app.yummy.domain.usuario.model.UsuarioModel;
<<<<<<< HEAD
import com.app.yummy.infrastructure.usuario.entity.Usuario;
=======
import com.app.yummy.infrastructure.usuario.entity.UsuarioEntity;
>>>>>>> 8e45b1fbdc7973e54eb84fbe74f9d9ebf42bc777
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
<<<<<<< HEAD
    date = "2025-08-28T20:56:38-0300",
    comments = "version: 1.6.3, compiler: javac, environment: Java 21.0.8 (Amazon.com Inc.)"
=======
    date = "2025-08-28T19:39:32-0300",
    comments = "version: 1.6.3, compiler: javac, environment: Java 22.0.1 (Oracle Corporation)"
>>>>>>> 8e45b1fbdc7973e54eb84fbe74f9d9ebf42bc777
)
@Component
public class UsuarioMapperImpl implements UsuarioMapper {

    @Override
<<<<<<< HEAD
    public UsuarioModel usuarioMap(Usuario entity) {
=======
    public UsuarioModel usuarioMap(UsuarioEntity entity) {
>>>>>>> 8e45b1fbdc7973e54eb84fbe74f9d9ebf42bc777
        if ( entity == null ) {
            return null;
        }

        UsuarioModel usuarioModel = new UsuarioModel();

<<<<<<< HEAD
        usuarioModel.setUsuarioid( entity.getUsuarioid() );
        usuarioModel.setNombre( entity.getNombre() );
=======
        usuarioModel.setIdUsuario( entity.getIdUsuario() );
        usuarioModel.setNombre( entity.getNombre() );
        usuarioModel.setApellido( entity.getApellido() );
>>>>>>> 8e45b1fbdc7973e54eb84fbe74f9d9ebf42bc777
        usuarioModel.setCorreo( entity.getCorreo() );
        usuarioModel.setPass( entity.getPass() );

        return usuarioModel;
    }
<<<<<<< HEAD

    @Override
    public Usuario usuarioEntity(UsuarioModel model) {
        if ( model == null ) {
            return null;
        }

        Usuario usuario = new Usuario();

        usuario.setUsuarioid( model.getUsuarioid() );
        usuario.setNombre( model.getNombre() );
        usuario.setCorreo( model.getCorreo() );
        usuario.setPass( model.getPass() );

        return usuario;
    }
=======
>>>>>>> 8e45b1fbdc7973e54eb84fbe74f9d9ebf42bc777
}
