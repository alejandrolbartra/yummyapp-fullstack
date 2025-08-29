package com.app.yummy.aplication.usuario.usecase;

import com.app.yummy.domain.usuario.Seguridad.JwtUtil;
import com.app.yummy.domain.usuario.model.RolModel;
import com.app.yummy.domain.usuario.model.UsuarioModel;
import com.app.yummy.domain.usuario.repository.UsuarioRepository;
import com.app.yummy.domain.usuario.service.UsuarioService;
import com.app.yummy.infrastructure.usuario.entity.RolUsuario;
import com.app.yummy.infrastructure.usuario.entity.Usuario;
import com.app.yummy.infrastructure.usuario.jpa.RolRepository;
import com.app.yummy.infrastructure.usuario.jpa.RolUsuarioRepository;
import com.app.yummy.infrastructure.usuario.mapper.UsuarioMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class UsuarioServiceImpl implements UsuarioService {

    private final UsuarioRepository usuarioRepository;
    private final JwtUtil jwtUtil;
    private final PasswordEncoder passwordEncoder;
    private final RolUsuarioRepository rolesUsuarioRepository;
    private final UsuarioMapper usuarioMapper;

    public UsuarioServiceImpl(UsuarioRepository usuarioRepository, JwtUtil jwtUtil, PasswordEncoder passwordEncoder, RolUsuarioRepository rolesUsuarioRepository, UsuarioMapper usuarioMapper) {
        this.usuarioRepository = usuarioRepository;
        this.jwtUtil = jwtUtil;
        this.passwordEncoder = passwordEncoder;
        this.rolesUsuarioRepository = rolesUsuarioRepository;
        this.usuarioMapper = usuarioMapper;
    }

    @Override
    public Optional<UsuarioModel> buscarUsuario(Long usuarioId){
        return usuarioRepository.buscaPorId(usuarioId);
    }

    @Override
    public List<UsuarioModel> listarUsuarios() {
        List<UsuarioModel> usuarios = usuarioRepository.listarTodos();
        return usuarios;
    }

//    @Override
//    public UsuarioModel guardar() {
//        UsuarioModel usuario = new UsuarioModel();
//        usuario.setUsuarioid(7L);
//        usuario.setNombre("Jefry Prueba");
//
//        return usuarioRepository.guardar(usuario);
//
//    }

    public String login(String correo, String pass) {
        UsuarioModel usuario = usuarioRepository.buscaPorCorreo(correo)
                .orElseThrow(() -> new RuntimeException("Usuario no encontrado"));
        if (!passwordEncoder.matches(pass, usuario.getPass())) {
            throw new RuntimeException("Credenciales inválidas");
        }

        return jwtUtil.generateToken(usuario.getCorreo());
    }

    @Override
    public List<RolModel> listarRols() {
        List<RolUsuario> roles = rolesUsuarioRepository.findAll();
        return roles.stream().map(usuarioMapper::rolModel).collect(Collectors.toList());
    }
}
