package com.app.yummy.domain.usuario.service;

import com.app.yummy.domain.usuario.model.UsuarioModel;
<<<<<<< HEAD
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Map;
=======

import java.util.List;
>>>>>>> 8e45b1fbdc7973e54eb84fbe74f9d9ebf42bc777
import java.util.Optional;

public interface UsuarioService {
    Optional<UsuarioModel> buscarUsuario(Long usuarioId);

    UsuarioModel guardar();
<<<<<<< HEAD

    public String login(String correo, String pass);
=======
    
    List<UsuarioModel> listarTodosLosUsuarios();

>>>>>>> 8e45b1fbdc7973e54eb84fbe74f9d9ebf42bc777
}
