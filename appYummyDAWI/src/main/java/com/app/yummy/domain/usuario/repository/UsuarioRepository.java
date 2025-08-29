package com.app.yummy.domain.usuario.repository;

import com.app.yummy.domain.usuario.model.UsuarioModel;

import java.util.List;
import java.util.Optional;

public interface UsuarioRepository {
    Optional<UsuarioModel>buscaPorId(Long usuarioId);
    List<UsuarioModel>todosLosUsuarios(String nombre);
<<<<<<< HEAD

    UsuarioModel guardar(UsuarioModel model);

    Optional<UsuarioModel> buscaPorCorreo(String correo);
=======
    List<UsuarioModel>listarTodos();

    UsuarioModel guardar(UsuarioModel model);
>>>>>>> 8e45b1fbdc7973e54eb84fbe74f9d9ebf42bc777
}
