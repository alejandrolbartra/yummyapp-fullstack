import { Component } from '@angular/core';
import {Router, RouterLink} from '@angular/router';
import { UsuarioService, Usuario } from '../core/services/usuario.service';
import { FormsModule } from '@angular/forms';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-crear',
  imports: [
    FormsModule,
    CommonModule,
    RouterLink
  ],
  standalone: true,
  templateUrl: './crear.component.html',
  styleUrl: './crear.component.scss'
})
export class CrearComponent {

  nuevoUsuario: Usuario = {
    idUsuario: 0,
    nombre: '',
    apellido: '',
    correo: '',
    rol: '',
    pass: ''
  };

  constructor(private usuarioService: UsuarioService, private router: Router) { }

  registrarUsuario(): void {
    this.usuarioService.registrarUsuario(this.nuevoUsuario).subscribe({
      next: (data) => {
        console.log('Usuario registrado con éxito', data);
        this.router.navigate(['/listado']);
      },
      error: (err) => {
        console.error('Error al registrar usuario:', err);
      }
    });
  }
}
