package com.app.yummy.domain.usuario.repository;

import com.app.yummy.domain.usuario.model.UsuarioModel;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UsuarioRepository extends JpaRepository<UsuarioModel, Long> {

}
