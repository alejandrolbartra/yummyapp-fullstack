import { Routes } from '@angular/router';
import {ListadoComponent} from './features/listado/listado.component';
import {LoginComponent} from './features/login/login.component';
import {CrearComponent} from './features/crear/crear.component';

import {HomeComponent} from './features/home/home.component';

export const routes: Routes = [
  { path: '', component: HomeComponent },
  { path: 'login', component: LoginComponent },
  { path: 'listado', component: ListadoComponent },
  { path: 'crear', component: CrearComponent },
];
