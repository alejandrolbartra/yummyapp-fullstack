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
        Optional<UsuarioModel> usuario = usuarioService.buscarUsuario(1L);
        if(usuario.isPresent()){
            log.info("Usuario Nombre: {}", usuario.get().getNombre());
            log.info("Usuario Descripcion: {}", usuario.get().getDescripcion());
            log.info("Usuario Categoria: {}", usuario.get().getCategoria());
        }

        usuarioService.guardar();
    }
}
