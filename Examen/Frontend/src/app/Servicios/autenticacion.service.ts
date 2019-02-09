import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class AutenticacionService {

  constructor() { }

  roles = [

    {
      id: 2,
      nombre: 'Usuario'
    }
  ];

  esAdministrador(): boolean {
    return this.roles.some((rol) => rol.id === 1);
  }

  esUsuario(): boolean {
    return this.roles.some((rol) => rol.id === 2);
  }
}
