package com.app.yummy.domain.usuario.repository;

import com.app.yummy.domain.usuario.model.UsuarioModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;


public interface UsuarioRepository extends JpaRepository<UsuarioModel, Long> {

    Optional<UsuarioModel> buscaPorId(Long usuarioId);

    List<UsuarioModel> todosLosUsuarios(String nombre);

    UsuarioModel guardar(UsuarioModel model);

    Optional<UsuarioModel> buscaPorCorreo(String correo);

}
