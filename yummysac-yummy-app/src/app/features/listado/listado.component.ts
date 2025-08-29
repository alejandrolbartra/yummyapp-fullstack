import { Component } from '@angular/core';
import {RouterLink} from '@angular/router';


@Component({
  selector: 'app-listado',
  imports: [
    RouterLink
  ],
  standalone: true,
  templateUrl: './listado.component.html',
  styleUrls: ['./listado.component.scss']
})
export class ListadoComponent {
  usuarios = [
    { nombre: 'Ana Gómez', email: 'ana@example.com', rol: 'Admin' },
    { nombre: 'Luis Pérez', email: 'luis@example.com', rol: 'Usuario' },
    { nombre: 'María López', email: 'maria@example.com', rol: 'Editor' },
  ];
}
