package com.app.yummy.domain.usuario.service;

import com.app.yummy.domain.usuario.model.UsuarioModel;

import java.util.Optional;

public interface UsuarioService {
    Optional<UsuarioModel> buscarUsuario(Long usuarioId);

    UsuarioModel guardar();

}
