import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ListPropietariosComponent } from './list-propietarios/list-propietarios.component';

const routes: Routes = [];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
