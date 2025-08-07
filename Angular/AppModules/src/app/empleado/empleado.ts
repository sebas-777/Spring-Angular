import { Component } from '@angular/core';

@Component({
  selector: 'app-empleado',
  standalone: false,
  templateUrl: './empleado.html',
  styleUrl: './empleado.css'
})
export class Empleado { 

  nombre = 'Isabella';
  apellidos = 'Castro';
  private edad = 12;
  colegio =' Inmaculada';
  empresa = '';

  getedad(){
    return this.edad;
  }

  Enviar(value: string){
    this.empresa = value;
  }

  constructor() { }

}
