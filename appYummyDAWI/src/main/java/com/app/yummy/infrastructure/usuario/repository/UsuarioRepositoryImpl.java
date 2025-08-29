package com.app.yummy.infrastructure.usuario.repository;

import com.app.yummy.domain.usuario.model.UsuarioModel;
import com.app.yummy.domain.usuario.repository.UsuarioRepository;
<<<<<<< HEAD
import com.app.yummy.infrastructure.usuario.entity.Usuario;
=======
import com.app.yummy.infrastructure.usuario.entity.UsuarioEntity;
>>>>>>> 8e45b1fbdc7973e54eb84fbe74f9d9ebf42bc777
import com.app.yummy.infrastructure.usuario.jpa.UsuarioRepositoryJpa;
import com.app.yummy.infrastructure.usuario.mapper.UsuarioMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
<<<<<<< HEAD
=======
@RequiredArgsConstructor
>>>>>>> 8e45b1fbdc7973e54eb84fbe74f9d9ebf42bc777
public class UsuarioRepositoryImpl implements UsuarioRepository {

    private final UsuarioRepositoryJpa usuarioRepositoryJpa;
    private final UsuarioMapper usuarioMapper;

<<<<<<< HEAD
    public UsuarioRepositoryImpl(UsuarioRepositoryJpa usuarioRepositoryJpa, UsuarioMapper usuarioMapper) {
        this.usuarioRepositoryJpa = usuarioRepositoryJpa;
        this.usuarioMapper = usuarioMapper;
    }

=======
>>>>>>> 8e45b1fbdc7973e54eb84fbe74f9d9ebf42bc777
    @Override
    public Optional<UsuarioModel> buscaPorId(Long usuarioId) {

        return usuarioRepositoryJpa.findById(usuarioId)
                .stream()
                .map(usuarioMapper::usuarioMap)
                .findFirst();
    }

    @Override
    public List<UsuarioModel> todosLosUsuarios(String nombre) {
        return List.of();
    }
<<<<<<< HEAD
=======
    
    @Override
    public List<UsuarioModel> listarTodos() {
        return usuarioRepositoryJpa.findAll()
                .stream()
                .map(usuarioMapper::usuarioMap)
                .toList();
    }
>>>>>>> 8e45b1fbdc7973e54eb84fbe74f9d9ebf42bc777

    @Override
    public UsuarioModel guardar(UsuarioModel model) {

<<<<<<< HEAD
        Usuario usuarioEntity=new Usuario();

        usuarioEntity.setUsuarioid(model.getUsuarioid());

        usuarioEntity.setNombre(model.getNombre());
        Usuario usuario = usuarioRepositoryJpa.save(usuarioEntity);
        UsuarioModel usuarioModel = new UsuarioModel();
        usuarioModel.setUsuarioid(usuario.getUsuarioid());
        usuarioModel.setNombre(usuarioEntity.getNombre());

        return usuarioModel;
    }

    @Override
    public Optional<UsuarioModel> buscaPorCorreo(String correo) {
        return usuarioRepositoryJpa.findByCorreo(correo)
                .map(usuarioMapper::usuarioMap);

    }
=======
        UsuarioEntity usuarioEntity=new UsuarioEntity();

        usuarioEntity.setIdUsuario(model.getIdUsuario());
        usuarioEntity.setNombre(model.getNombre());
        usuarioEntity.setApellido(model.getApellido());
        usuarioEntity.setCorreo(model.getCorreo());
       // usuarioEntity.setRol(model.getRol());
        usuarioEntity.setPass(model.getPass());

        UsuarioEntity usuario = usuarioRepositoryJpa.save(usuarioEntity);
        UsuarioModel usuarioModel = new UsuarioModel();
        usuarioModel.setIdUsuario(usuario.getIdUsuario());
        usuarioModel.setNombre(usuario.getNombre());
        usuarioModel.setApellido(usuario.getApellido());
        usuarioModel.setCorreo(usuario.getCorreo());
     //   usuarioModel.setRol(usuario.getRol());
        usuarioModel.setPass(usuario.getPass());

        return usuarioModel;
    }
>>>>>>> 8e45b1fbdc7973e54eb84fbe74f9d9ebf42bc777
}
