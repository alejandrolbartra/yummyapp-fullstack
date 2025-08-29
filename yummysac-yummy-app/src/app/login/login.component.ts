import { Component } from '@angular/core';
import {Router, RouterModule} from '@angular/router';
//import {AuthService} from '../../auth/auth.service';
import {FormsModule} from '@angular/forms';
import {CommonModule} from '@angular/common';
import {HttpClient} from '@angular/common/http';

@Component({
  selector: 'app-login.component',
  imports: [RouterModule, FormsModule,CommonModule],
  standalone: true,
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.scss']
})
export class LoginComponent {
  username = '';
  password = '';
  errorMessage = '';

  /*constructor(private authService: AuthService, private router: Router) {}

  login() {
    this.authService.login({ username: this.username, password: this.password }).subscribe({
      next: (res) => {
        localStorage.setItem('token', res.token);
        this.router.navigate(['/dashboard']);
      },
      error: () => {
        this.errorMessage = 'Credenciales inválidas';
      }
    });
  }*/

  constructor(private http: HttpClient, private router: Router) {}

  onLogin(): void {
    this.http.post<{ token: string }>('http://localhost:8080/api/login', {
      correo: this.username,
      pass: this.password
    }).subscribe({
      next: (res) => {
        localStorage.setItem('jwt', res.token); // Guarda el token
        console.log('Token recibido:', res.token);
        this.router.navigate(['/listado']); // Redirige al dashboard
      },
      error: (err) => {
        console.error('Error de login:', err);
        // Aquí podrías mostrar un mensaje de error en la interfaz
      }
    });
  }

}

