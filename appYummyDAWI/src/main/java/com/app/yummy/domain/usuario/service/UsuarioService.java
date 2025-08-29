package com.app.yummy.domain.usuario.service;

import com.app.yummy.domain.usuario.model.RolModel;
import com.app.yummy.domain.usuario.model.UsuarioModel;

import org.springframework.web.bind.annotation.RequestBody;

import java.util.Map;

import java.util.List;

import java.util.Optional;

public interface UsuarioService {
    Optional<UsuarioModel> buscarUsuario(Long usuarioId);

    //UsuarioModel guardar();

    public List<UsuarioModel> listarUsuarios();

    public String login(String correo, String pass);

    public List<RolModel> listarRols();

}
