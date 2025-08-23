package com.app.yummy.infrastructure.usuario.mapper;

import com.app.yummy.domain.usuario.model.UsuarioModel;
import com.app.yummy.infrastructure.usuario.entity.UsuarioEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface UsuarioMapper {

    @Mapping(target = "usuarioid", source = "usuarioid")
    @Mapping(target = "nombre", source = "nombre")
    @Mapping(target = "descripcion", source = "descripcion")
    //@Mapping(target = "categoria", expression = "java(mapCategoria(entity.getNombre()))")

     // roles se manejan aparte
    UsuarioModel usuarioMap(UsuarioEntity entity);

    //default String mapCategoria(String nombre){
   //     return nombre.contains("Lu")?"Admin":"Usuario";
    //}

}
