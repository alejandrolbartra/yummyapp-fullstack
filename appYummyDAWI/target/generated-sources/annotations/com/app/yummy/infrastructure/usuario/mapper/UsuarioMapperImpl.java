package com.app.yummy.infrastructure.usuario.mapper;

import com.app.yummy.domain.usuario.model.RolModel;
import com.app.yummy.domain.usuario.model.UsuarioModel;
import com.app.yummy.infrastructure.usuario.entity.RolUsuario;
import com.app.yummy.infrastructure.usuario.entity.Usuario;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-08-29T02:19:51-0500",
    comments = "version: 1.6.3, compiler: javac, environment: Java 21.0.5 (Oracle Corporation)"
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
        usuarioModel.setApellido( entity.getApellido() );
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

        usuario.setApellido( model.getApellido() );
        usuario.setUsuarioid( model.getUsuarioid() );
        usuario.setNombre( model.getNombre() );
        usuario.setCorreo( model.getCorreo() );
        usuario.setPass( model.getPass() );

        return usuario;
    }

    @Override
    public RolModel rolModel(RolUsuario entity) {
        if ( entity == null ) {
            return null;
        }

        RolModel rolModel = new RolModel();

        rolModel.setUsuario( entity.getUsuario() );
        rolModel.setRol( entity.getRol() );

        return rolModel;
    }
}
