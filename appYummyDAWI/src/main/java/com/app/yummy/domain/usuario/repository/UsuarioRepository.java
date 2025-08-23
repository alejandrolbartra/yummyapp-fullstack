package com.app.yummy.domain.usuario.repository;

import com.app.yummy.domain.usuario.model.UsuarioModel;

import java.util.List;
import java.util.Optional;

public interface UsuarioRepository {
    Optional<UsuarioModel>buscaPorId(Long usuarioId);
    List<UsuarioModel>todosLosUsuarios(String nombre);

    UsuarioModel guardar(UsuarioModel model);
}
