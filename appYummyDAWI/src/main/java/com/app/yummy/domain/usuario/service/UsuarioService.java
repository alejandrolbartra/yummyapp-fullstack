package com.app.yummy.domain.usuario.service;

import com.app.yummy.domain.usuario.model.UsuarioModel;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface UsuarioService {
    Optional<UsuarioModel> buscarUsuario(Long usuarioId);

    Page<UsuarioModel> listarTodosLosUsuarios(Pageable pageable);

    UsuarioModel registrarUsuario(UsuarioModel usuario);

}
