import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { NuevoComponenteComponent } from "./nuevo-componente/nuevo-componente.component";

@Component({
  selector: 'app-root',
  standalone: true,
  templateUrl: './app.component.html',
  styleUrl: './app.component.css',
  imports: [NuevoComponenteComponent]
})
export class AppComponent {
  title = 'Hola pendejos desde Angular!';
}
