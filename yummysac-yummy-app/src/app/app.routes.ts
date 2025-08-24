import { Routes } from '@angular/router';
import {ListadoComponent} from './features/listado/listado.component';
import {LoginComponent} from './features/login/login.component';
import {CrearComponent} from './features/crear/crear.component';

export const routes: Routes = [
  { path: 'login', component: LoginComponent },
  { path: 'listado', component: ListadoComponent },
  { path: 'crear', component: CrearComponent },
];
