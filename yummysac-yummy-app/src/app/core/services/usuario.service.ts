import { Injectable } from '@angular/core';
import { HttpClient, HttpParams } from '@angular/common/http';
import { Observable } from 'rxjs';

export interface Page<T> {
  content: T[];
  totalElements: number;
  totalPages: number;
  size: number;
  number: number;
}

export interface Usuario {
  idUsuario: number;
  nombre: string;
  apellido: string;
  correo: string;
  rol: string;
  pass: string;
}

@Injectable({
  providedIn: 'root'
})
export class UsuarioService {
  private apiUrl = 'http://localhost:8080/api/usuarios';

  constructor(private http: HttpClient) { }

  obtenerUsuarios(page: number, size: number): Observable<Page<Usuario>> {

    let params = new HttpParams()
      .set('page', page.toString())
      .set('size', size.toString());


    return this.http.get<Page<Usuario>>(this.apiUrl, { params: params });
  }

  obtenerUsuarioPorId(id: number): Observable<Usuario> {
    return this.http.get<Usuario>(`${this.apiUrl}/${id}`);
  }

  registrarUsuario(usuario: Usuario): Observable<Usuario> {
    return this.http.post<Usuario>(this.apiUrl, usuario);
  }

}
