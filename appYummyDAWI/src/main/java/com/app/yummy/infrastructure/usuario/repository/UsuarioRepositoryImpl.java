package com.app.yummy.infrastructure.usuario.repository;

import com.app.yummy.domain.usuario.model.UsuarioModel;
import com.app.yummy.domain.usuario.repository.UsuarioRepository;
import com.app.yummy.infrastructure.usuario.entity.UsuarioEntity;
import com.app.yummy.infrastructure.usuario.jpa.UsuarioRepositoryJpa;
import com.app.yummy.infrastructure.usuario.mapper.UsuarioMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class UsuarioRepositoryImpl implements UsuarioRepository {

    private final UsuarioRepositoryJpa usuarioRepositoryJpa;
    private final UsuarioMapper usuarioMapper;

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

    @Override
    public UsuarioModel guardar(UsuarioModel model) {

        UsuarioEntity usuarioEntity=new UsuarioEntity();

        usuarioEntity.setUsuarioid(model.getUsuarioid());

        usuarioEntity.setNombre(model.getNombre());
        usuarioEntity.setDescripcion(model.getDescripcion());

        UsuarioEntity usuario = usuarioRepositoryJpa.save(usuarioEntity);
        UsuarioModel usuarioModel = new UsuarioModel();
        usuarioModel.setUsuarioid(usuario.getUsuarioid());
        usuarioModel.setNombre(usuarioEntity.getNombre());
        usuarioModel.setDescripcion(usuarioEntity.getDescripcion());
        usuarioModel.setCategoria("");

        return usuarioModel;
    }
}
