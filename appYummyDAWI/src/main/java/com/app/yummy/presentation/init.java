package com.app.yummy.presentation;

import com.app.yummy.domain.usuario.service.UsuarioService;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import lombok.extern.slf4j.Slf4j;


@Slf4j
@Component
@RequiredArgsConstructor
public class init {

    private final UsuarioService usuarioService;

    @PostConstruct
    public void start(){

    }
}
