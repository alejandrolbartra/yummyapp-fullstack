package com.app.yummy.infrastructure.usuario.mapper;

import com.app.yummy.domain.usuario.model.UsuarioModel;
<<<<<<< HEAD
import com.app.yummy.infrastructure.usuario.entity.Usuario;
import org.mapstruct.InheritInverseConfiguration;
=======
import com.app.yummy.infrastructure.usuario.entity.UsuarioEntity;
>>>>>>> 8e45b1fbdc7973e54eb84fbe74f9d9ebf42bc777
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface UsuarioMapper {

<<<<<<< HEAD
    /*@Mapping(target = "usuarioid", source = "usuarioid")
    @Mapping(target = "nombre", source = "nombre")
    @Mapping(target = "correo", source = "correo")
    @Mapping(target = "pass", source = "pass")
    UsuarioModel usuarioMap(Usuario entity);

    @InheritInverseConfiguration
    Usuario usuarioEntity(UsuarioModel model);*/

    UsuarioModel usuarioMap(Usuario entity);

    Usuario usuarioEntity(UsuarioModel model);
=======
    UsuarioModel usuarioMap(UsuarioEntity entity);
>>>>>>> 8e45b1fbdc7973e54eb84fbe74f9d9ebf42bc777

}
