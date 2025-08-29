package com.app.yummy.infrastructure.usuario.repository;

import com.app.yummy.domain.usuario.model.UsuarioModel;
import com.app.yummy.domain.usuario.repository.UsuarioRepository;
import com.app.yummy.infrastructure.usuario.entity.Usuario;
import com.app.yummy.infrastructure.usuario.jpa.RolRepository;
import com.app.yummy.infrastructure.usuario.jpa.RolUsuarioRepository;
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
    private final RolUsuarioRepository rolUsuarioRepository;
    private final RolRepository rolRepository;

//    public UsuarioRepositoryImpl(UsuarioRepositoryJpa usuarioRepositoryJpa, UsuarioMapper usuarioMapper) {
//        this.usuarioRepositoryJpa = usuarioRepositoryJpa;
//        this.usuarioMapper = usuarioMapper;
//    }


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
    public List<UsuarioModel> listarTodos() {
        return usuarioRepositoryJpa.findAll()
                .stream()
                .map(usuarioMapper::usuarioMap)
                .toList();
    }

    @Override
    public UsuarioModel guardar(UsuarioModel model) {

        Usuario usuarioEntity=new Usuario();

        usuarioEntity.setUsuarioid(model.getUsuarioid());

        usuarioEntity.setNombre(model.getNombre());
        Usuario usuario = usuarioRepositoryJpa.save(usuarioEntity);
        UsuarioModel usuarioModel = new UsuarioModel();
        //usuarioModel.setUsuarioid(usuario.getUsuarioid());
        usuarioModel.setNombre(usuarioEntity.getNombre());

        return usuarioModel;
    }

    @Override
    public Optional<UsuarioModel> buscaPorCorreo(String correo) {
        return usuarioRepositoryJpa.findByCorreo(correo)
                .map(usuarioMapper::usuarioMap);

    }

        //UsuarioEntity usuarioEntity=new UsuarioEntity();

        //usuarioEntity.setIdUsuario(model.getIdUsuario());
        //usuarioEntity.setNombre(model.getNombre());
        //usuarioEntity.setApellido(model.getApellido());
       // usuarioEntity.setCorreo(model.getCorreo());
       // usuarioEntity.setRol(model.getRol());
       // usuarioEntity.setPass(model.getPass());

        //UsuarioEntity usuario = usuarioRepositoryJpa.save(usuarioEntity);
       // UsuarioModel usuarioModel = new UsuarioModel();
        //usuarioModel.setIdUsuario(usuario.getIdUsuario());
       // usuarioModel.setNombre(usuario.getNombre());
      //  usuarioModel.setApellido(usuario.getApellido());
      //  usuarioModel.setCorreo(usuario.getCorreo());
     //   usuarioModel.setRol(usuario.getRol());
      //  usuarioModel.setPass(usuario.getPass());

       // return usuarioModel;
   // }
}
