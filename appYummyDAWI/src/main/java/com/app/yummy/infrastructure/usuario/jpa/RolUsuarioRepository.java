package com.app.yummy.infrastructure.usuario.jpa;

import com.app.yummy.infrastructure.usuario.entity.RolUsuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface RolUsuarioRepository extends JpaRepository<RolUsuario, Long> {
}
