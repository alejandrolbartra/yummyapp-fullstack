import { Component, OnInit, ChangeDetectorRef } from '@angular/core';
import { RouterLink } from '@angular/router';
import { CommonModule } from '@angular/common';
import { UsuarioService, Usuario, Page } from '../core/services/usuario.service';

@Component({
  selector: 'app-listado',
  imports: [
    RouterLink,
    CommonModule
  ],
  standalone: true,
  templateUrl: './listado.component.html',
  styleUrls: ['./listado.component.scss']
})
export class ListadoComponent implements OnInit {
  usuarios: Usuario[] = [];
  loading = true;
  error: string | null = null;

  // Propiedades para la paginación
  paginaActual = 0;
  tamanoPagina = 10;
  totalPaginas = 0;
  totalElementos = 0;

  constructor(private usuarioService: UsuarioService, private cdr: ChangeDetectorRef) {}

  ngOnInit(): void {
    this.cargarUsuarios();
  }

  cargarUsuarios(): void {
    this.loading = true;
    this.error = null;

    this.usuarioService.obtenerUsuarios(this.paginaActual, this.tamanoPagina).subscribe({
      next: (data: any) => {
        this.usuarios = data.content;
        this.totalPaginas = data.totalPages;
        this.totalElementos = data.totalElements;
        this.loading = false;
        this.cdr.detectChanges();
      },
      error: (err) => {
        console.error('Error al cargar usuarios:', err);
        this.error = 'Error al cargar los usuarios. Por favor, intente nuevamente.';
        this.loading = false;
        this.cdr.detectChanges();
      }
    });
  }

  irAPagina(pagina: number): void {
    if (pagina >= 0 && pagina < this.totalPaginas) {
      this.paginaActual = pagina;
      this.cargarUsuarios();
    }
  }

  paginaSiguiente(): void {
    this.irAPagina(this.paginaActual + 1);
  }

  paginaAnterior(): void {
    this.irAPagina(this.paginaActual - 1);
  }
}
