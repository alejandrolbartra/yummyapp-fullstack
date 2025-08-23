package com.app.yummy.infrastructure.usuario.jpa;

import com.app.yummy.infrastructure.usuario.entity.UsuarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepositoryJpa extends JpaRepository<UsuarioEntity, Long> {
}
