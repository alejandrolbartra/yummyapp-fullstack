package com.app.yummy.presentation;

import com.app.yummy.domain.usuario.model.UsuarioModel;
import com.app.yummy.domain.usuario.service.UsuarioService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;

import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/usuarios")
@RequiredArgsConstructor
@CrossOrigin(origins = "*")
public class UsuarioController {

    private final UsuarioService usuarioService;

    @GetMapping
    public ResponseEntity<Page<UsuarioModel>> listarUsuarios(Pageable pageable) {
        Page<UsuarioModel> usuarios = usuarioService.listarTodosLosUsuarios(pageable);
        return ResponseEntity.ok(usuarios);
    }

    @GetMapping("/{id}")
    public ResponseEntity<UsuarioModel> buscarUsuario(@PathVariable Long id) {
        return usuarioService.buscarUsuario(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
}
