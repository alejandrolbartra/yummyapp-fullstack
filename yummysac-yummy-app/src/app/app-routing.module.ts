import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

import { ListadoComponent } from './listado/listado.component';
import { CrearComponent } from './crear/crear.component';

const routes: Routes = [
  { path: 'listado', component: ListadoComponent },
  { path: 'crear-usuario', component: CrearComponent },
  { path: '', redirectTo: '/listado', pathMatch: 'full' }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule {}
