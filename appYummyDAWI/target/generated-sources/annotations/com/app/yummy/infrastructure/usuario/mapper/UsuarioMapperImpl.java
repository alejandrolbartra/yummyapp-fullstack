package com.app.yummy.infrastructure.usuario.mapper;

import com.app.yummy.domain.usuario.model.UsuarioModel;
import com.app.yummy.infrastructure.usuario.entity.Usuario;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-08-28T20:56:38-0300",
    comments = "version: 1.6.3, compiler: javac, environment: Java 21.0.8 (Amazon.com Inc.)"
)
@Component
public class UsuarioMapperImpl implements UsuarioMapper {

    @Override
    public UsuarioModel usuarioMap(Usuario entity) {
        if ( entity == null ) {
            return null;
        }

        UsuarioModel usuarioModel = new UsuarioModel();

        usuarioModel.setUsuarioid( entity.getUsuarioid() );
        usuarioModel.setNombre( entity.getNombre() );
        usuarioModel.setCorreo( entity.getCorreo() );
        usuarioModel.setPass( entity.getPass() );

        return usuarioModel;
    }

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
}
