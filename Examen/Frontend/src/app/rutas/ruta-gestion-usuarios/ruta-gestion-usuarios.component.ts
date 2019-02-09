import { Component, OnInit } from '@angular/core';
import {Paciente} from "../../Interfaces/Paciente";
import {PacienteRestService} from "../../Servicios/REST/paciente-rest.service";
import {Usuario} from "../../Interfaces/Usuarios";
import {UsuarioRestService} from "../../Servicios/REST/usuario-rest.service";

@Component({
  selector: 'app-ruta-gestion-usuarios',
  templateUrl: './ruta-gestion-usuarios.component.html',
  styleUrls: ['./ruta-gestion-usuarios.component.css']
})


export class RutaGestionUsuariosComponent implements OnInit {

  usuarios: Usuario[];

  constructor(
    private readonly _usuarioRS: UsuarioRestService
  ) { }

  ngOnInit() {

    const objeto$ = this._usuarioRS.buscarTodo();

    objeto$
      .subscribe(
        (respuesta: Usuario[]) => {
          console.log(respuesta);
          this.usuarios = respuesta;
        }, (error) => {
          console.error('Error', error);
        }
      )


  }

}
