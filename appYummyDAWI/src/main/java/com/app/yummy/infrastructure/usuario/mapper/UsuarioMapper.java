package com.app.yummy.infrastructure.usuario.mapper;

import com.app.yummy.domain.usuario.model.UsuarioModel;
import com.app.yummy.infrastructure.usuario.entity.Usuario;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface UsuarioMapper {

    /*@Mapping(target = "usuarioid", source = "usuarioid")
    @Mapping(target = "nombre", source = "nombre")
    @Mapping(target = "correo", source = "correo")
    @Mapping(target = "pass", source = "pass")
    UsuarioModel usuarioMap(Usuario entity);

    @InheritInverseConfiguration
    Usuario usuarioEntity(UsuarioModel model);*/

    UsuarioModel usuarioMap(Usuario entity);

    Usuario usuarioEntity(UsuarioModel model);

}
