package com.app.yummy.infrastructure.usuario.mapper;

import com.app.yummy.domain.usuario.model.UsuarioModel;
import com.app.yummy.infrastructure.usuario.entity.UsuarioEntity;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-08-29T18:24:48-0300",
    comments = "version: 1.6.3, compiler: javac, environment: Java 22.0.1 (Oracle Corporation)"
)
@Component
public class UsuarioMapperImpl implements UsuarioMapper {

    @Override
    public UsuarioModel usuarioMap(UsuarioEntity entity) {
        if ( entity == null ) {
            return null;
        }

        UsuarioModel usuarioModel = new UsuarioModel();

        usuarioModel.setRol( entity.getRol() );
        usuarioModel.setIdUsuario( entity.getIdUsuario() );
        usuarioModel.setNombre( entity.getNombre() );
        usuarioModel.setApellido( entity.getApellido() );
        usuarioModel.setCorreo( entity.getCorreo() );
        usuarioModel.setPass( entity.getPass() );

        return usuarioModel;
    }
}
