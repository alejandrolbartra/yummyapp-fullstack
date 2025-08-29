package com.app.yummy.infrastructure.usuario.jpa;

<<<<<<< HEAD
import com.app.yummy.infrastructure.usuario.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.swing.text.html.Option;
import java.util.Optional;


public interface UsuarioRepositoryJpa extends JpaRepository<Usuario, Long> {

    public Optional<Usuario> findByCorreo(String correo);
=======
import com.app.yummy.infrastructure.usuario.entity.UsuarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepositoryJpa extends JpaRepository<UsuarioEntity, Long> {
>>>>>>> 8e45b1fbdc7973e54eb84fbe74f9d9ebf42bc777
}
