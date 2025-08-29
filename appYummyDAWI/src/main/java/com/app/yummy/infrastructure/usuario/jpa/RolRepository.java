package com.app.yummy.infrastructure.usuario.jpa;

import com.app.yummy.infrastructure.usuario.entity.Rol;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface RolRepository extends JpaRepository<Rol, Long> {
}
