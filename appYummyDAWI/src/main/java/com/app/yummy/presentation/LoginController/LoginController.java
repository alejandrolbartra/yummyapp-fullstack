package com.app.yummy.presentation.LoginController;

import com.app.yummy.domain.usuario.model.RolModel;
import com.app.yummy.domain.usuario.service.UsuarioService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class LoginController {

    private final UsuarioService usuarioService;

    public LoginController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @PostMapping("/login")
    public Map<String, String> login(@RequestBody Map<String, String> request) {
        String correo = request.get("correo");
        String pass = request.get("pass");
        String token = usuarioService.login(correo, pass);
        return Map.of("token", token);
    }

    @GetMapping("/usuariorol")
    public ResponseEntity<List<RolModel>> listarRols()
    {
        List<RolModel> rols = usuarioService.listarRols();
        return ResponseEntity.ok(rols);
    };
}
