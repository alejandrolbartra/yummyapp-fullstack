package com.app.yummy.aplication.usuario.usecase;

import com.app.yummy.domain.usuario.model.UsuarioModel;
import com.app.yummy.domain.usuario.repository.UsuarioRepository;
import com.app.yummy.domain.usuario.seguridad.JwtUtil;
import com.app.yummy.domain.usuario.service.UsuarioService;
import com.app.yummy.infrastructure.usuario.entity.UsuarioEntity;
import com.app.yummy.infrastructure.usuario.jpa.UsuarioRepositoryJpa;
import com.app.yummy.infrastructure.usuario.mapper.UsuarioWrapper;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UsuarioServiceImpl implements UsuarioService {

    private final UsuarioRepository usuarioRepository;
    private final JwtUtil jwtUtil;
    private final PasswordEncoder passwordEncoder;

    //public UsuarioServiceImpl(UsuarioRepository usuarioRepository, JwtUtil jwtUtil, PasswordEncoder passwordEncoder) {
    //    this.usuarioRepository = usuarioRepository;
    //    this.jwtUtil = jwtUtil;
    //    this.passwordEncoder = passwordEncoder;
    //}

    @Override
    public Optional<UsuarioModel> buscarUsuario(Long usuarioId){
        return usuarioRepository.findById(usuarioId);
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

        return usuarioRepository.save(usuario);
    }

    @Autowired
    private final UsuarioRepositoryJpa usuarioRepositoryJpa;

    private final UsuarioWrapper usuarioWrapper;

    @Override
    public Page<UsuarioModel> listarTodosLosUsuarios(Pageable pageable) {
        Page<UsuarioEntity> entidades = usuarioRepositoryJpa.findAll(pageable);
        return entidades.map(usuarioWrapper::usuarioMap);
    }

    public String login(String correo, String pass) {
        UsuarioModel usuario = usuarioRepository.buscaPorCorreo(correo)
                .orElseThrow(() -> new RuntimeException("Usuario no encontrado"));
        if (!passwordEncoder.matches(pass, usuario.getPass())) {
            throw new RuntimeException("Credenciales inválidas");
        }

        return jwtUtil.generateToken(usuario.getCorreo());
    }

    /*@Override
    public UsuarioModel registrarUsuario(UsuarioModel usuario) {
        return usuarioRepository.save(usuario);

    }*/

    

    @Override
    public UsuarioModel registrarUsuario(UsuarioModel usuario) {
        UsuarioEntity entity = usuarioWrapper.usuarioModelToEntity(usuario);
        UsuarioEntity saved = usuarioRepositoryJpa.save(entity);
        return usuarioWrapper.usuarioEntityToModel(saved);
    }


}
