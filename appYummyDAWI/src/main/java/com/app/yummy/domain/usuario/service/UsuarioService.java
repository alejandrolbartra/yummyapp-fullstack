package com.app.yummy.domain.usuario.service;

import com.app.yummy.domain.usuario.model.UsuarioModel;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Map;
import java.util.Optional;

public interface UsuarioService {
    Optional<UsuarioModel> buscarUsuario(Long usuarioId);

    UsuarioModel guardar();

    public String login(String correo, String pass);
}
