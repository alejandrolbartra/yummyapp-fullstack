package com.app.yummy.aplication.usuario.usecase;

import com.app.yummy.domain.usuario.model.UsuarioModel;
import com.app.yummy.domain.usuario.repository.UsuarioRepository;
import com.app.yummy.domain.usuario.service.UsuarioService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UsuarioServiceImpl implements UsuarioService {

    private final UsuarioRepository usuarioRepository;

    @Override
    public Optional<UsuarioModel> buscarUsuario(Long usuarioId){
        return usuarioRepository.buscaPorId(usuarioId);
    }

    @Override
    public UsuarioModel guardar() {
        UsuarioModel usuario = new UsuarioModel();
        usuario.setIdUsuario(7L);
        usuario.setNombre("Jefry");
        usuario.setApellido("Prueba");
        usuario.setCorreo("jefry@test.com");
        usuario.setRol("Cliente");
        usuario.setPass("123456");

        return usuarioRepository.guardar(usuario);

    }
    
    @Override
    public List<UsuarioModel> listarTodosLosUsuarios() {
        return usuarioRepository.listarTodos();
    }
}
