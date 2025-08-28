package com.app.yummy.presentation;

import com.app.yummy.domain.usuario.model.UsuarioModel;
import com.app.yummy.domain.usuario.service.UsuarioService;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import lombok.extern.slf4j.Slf4j;

import java.util.Optional;

@Slf4j
@Component
@RequiredArgsConstructor
public class init {

    private final UsuarioService usuarioService;

    @PostConstruct
    public void start(){
        try {
            log.info("Aplicación iniciada correctamente");
            
            // Intentar listar usuarios
            var usuarios = usuarioService.listarTodosLosUsuarios();
            log.info("Usuarios encontrados: {}", usuarios.size());
            
        } catch (Exception e) {
            log.error("Error al inicializar: {}", e.getMessage());
        }
    }
}
