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
}
