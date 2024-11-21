import { Component , OnInit} from '@angular/core';
import{PropietarioService} from './propietario.service';
import{Propietario} from './propietario.model';

@Component({
  selector: 'app-list-propietarios',
  templateUrl: './list-propietarios.component.html',
  styleUrls: ['./list-propietarios.component.css']
})
export class ListPropietariosComponent implements OnInit {

  propietarios: Propietario[] = [];

  constructor(private propietarioService: PropietarioService) { }

  ngOnInit(): void {
    this.LoadPropietarios();
  }

  LoadPropietarios(): void {
    this.propietarioService.getAllPropietarios().subscribe((data) => {
      this.propietarios = data;
    },
    (error) => {
      console.error('Error al obtener propietarios:', error);
    }
  );
  }

}
