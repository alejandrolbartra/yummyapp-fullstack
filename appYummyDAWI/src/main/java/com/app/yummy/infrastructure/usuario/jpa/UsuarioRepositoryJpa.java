package com.app.yummy.infrastructure.usuario.jpa;
import com.app.yummy.infrastructure.usuario.entity.UsuarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import com.app.yummy.infrastructure.usuario.entity.Usuario;
import org.springframework.stereotype.Repository;
import javax.swing.text.html.Option;
import java.util.Optional;

public interface UsuarioRepositoryJpa extends JpaRepository<Usuario, Long> {

    public Optional<Usuario> findByCorreo(String correo);

}
