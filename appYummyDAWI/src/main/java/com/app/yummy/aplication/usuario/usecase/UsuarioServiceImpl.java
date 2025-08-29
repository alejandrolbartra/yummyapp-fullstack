package com.app.yummy.aplication.usuario.usecase;

<<<<<<< HEAD
import com.app.yummy.domain.usuario.Seguridad.JwtUtil;
=======
>>>>>>> 8e45b1fbdc7973e54eb84fbe74f9d9ebf42bc777
import com.app.yummy.domain.usuario.model.UsuarioModel;
import com.app.yummy.domain.usuario.repository.UsuarioRepository;
import com.app.yummy.domain.usuario.service.UsuarioService;
import lombok.RequiredArgsConstructor;
<<<<<<< HEAD
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UsuarioServiceImpl implements UsuarioService {

    private final UsuarioRepository usuarioRepository;
    private final JwtUtil jwtUtil;
    private final PasswordEncoder passwordEncoder;

    public UsuarioServiceImpl(UsuarioRepository usuarioRepository, JwtUtil jwtUtil, PasswordEncoder passwordEncoder) {
        this.usuarioRepository = usuarioRepository;
        this.jwtUtil = jwtUtil;
        this.passwordEncoder = passwordEncoder;
    }
=======
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UsuarioServiceImpl implements UsuarioService {

    private final UsuarioRepository usuarioRepository;
>>>>>>> 8e45b1fbdc7973e54eb84fbe74f9d9ebf42bc777

    @Override
    public Optional<UsuarioModel> buscarUsuario(Long usuarioId){
        return usuarioRepository.buscaPorId(usuarioId);
    }

    @Override
    public UsuarioModel guardar() {
        UsuarioModel usuario = new UsuarioModel();
<<<<<<< HEAD
        usuario.setUsuarioid(7L);
        usuario.setNombre("Jefry Prueba");
=======
        usuario.setIdUsuario(7L);
        usuario.setNombre("Jefry");
        usuario.setApellido("Prueba");
        usuario.setCorreo("jefry@test.com");
        usuario.setRol("Cliente");
        usuario.setPass("123456");
>>>>>>> 8e45b1fbdc7973e54eb84fbe74f9d9ebf42bc777

        return usuarioRepository.guardar(usuario);

    }
<<<<<<< HEAD

    public String login(String correo, String pass) {
        UsuarioModel usuario = usuarioRepository.buscaPorCorreo(correo)
                .orElseThrow(() -> new RuntimeException("Usuario no encontrado"));
        if (!passwordEncoder.matches(pass, usuario.getPass())) {
            throw new RuntimeException("Credenciales inválidas");
        }

        return jwtUtil.generateToken(usuario.getCorreo());
    }

=======
    
    @Override
    public List<UsuarioModel> listarTodosLosUsuarios() {
        return usuarioRepository.listarTodos();
    }
>>>>>>> 8e45b1fbdc7973e54eb84fbe74f9d9ebf42bc777
}
