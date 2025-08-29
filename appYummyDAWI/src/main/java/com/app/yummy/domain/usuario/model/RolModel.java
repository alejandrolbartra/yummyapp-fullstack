package com.app.yummy.domain.usuario.model;

import com.app.yummy.infrastructure.usuario.entity.Rol;
import com.app.yummy.infrastructure.usuario.entity.Usuario;
import lombok.Data;

@Data
public class RolModel {
    private Usuario usuario;
    private Rol rol;


}
