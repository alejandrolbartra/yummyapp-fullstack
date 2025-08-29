package com.app.yummy.infrastructure.usuario.mapper;

import com.app.yummy.domain.usuario.model.UsuarioModel;
import com.app.yummy.infrastructure.usuario.entity.UsuarioEntity;
import org.springframework.stereotype.Component;

@Component
public class UsuarioWrapper {
    public UsuarioModel usuarioMap(UsuarioEntity entity) {
        UsuarioModel model = new UsuarioModel();
        model.setIdUsuario(entity.getIdUsuario());
        model.setNombre(entity.getNombre());
        model.setApellido(entity.getApellido());
        model.setCorreo(entity.getCorreo());
        model.setRol(entity.getRol());
        model.setPass(entity.getPass());
        return model;
    }

    public UsuarioModel usuarioEntityToModel(UsuarioEntity entity) {
        UsuarioModel model = new UsuarioModel();
        model.setIdUsuario(entity.getIdUsuario());
        model.setNombre(entity.getNombre());
        model.setApellido(entity.getApellido());
        model.setCorreo(entity.getCorreo());
        model.setRol(entity.getRol());
        model.setPass(entity.getPass());
        // Puedes agregar lógica para auditoría si decides usar esos campos
        return model;
    }

    public UsuarioEntity usuarioModelToEntity(UsuarioModel model) {
        UsuarioEntity entity = new UsuarioEntity();
        entity.setIdUsuario(model.getIdUsuario());
        entity.setNombre(model.getNombre());
        entity.setApellido(model.getApellido());
        entity.setCorreo(model.getCorreo());
        entity.setRol(model.getRol());
        entity.setPass(model.getPass());
        // Puedes agregar lógica para auditoría si decides usar esos campos
        return entity;
    }

}
