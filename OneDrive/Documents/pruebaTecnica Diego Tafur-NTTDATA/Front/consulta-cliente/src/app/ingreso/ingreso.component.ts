import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { ClienteService } from './cliente.service';
import { ClienteDataService } from './cliente-data.service';
@Component({
  selector: 'app-ingreso',
  templateUrl: './ingreso.component.html',
  styleUrls: ['./ingreso.component.css']
})
export class IngresoComponent {
  tipoDocumento: string = '';
  numeroDocumento: string = '';

  constructor(
    private router: Router, 
    private clienteService: ClienteService,
    private clienteDataService: ClienteDataService
  ) {}

  formularioValido(): boolean {
    return this.tipoDocumento.trim().length > 0 && this.numeroDocumento.length >= 8 && this.numeroDocumento.length <= 11;
  }

  onSubmit() {
    if (this.formularioValido()) {
      this.clienteService.obtenerCliente(this.tipoDocumento, this.numeroDocumento)
        .subscribe(
          data => {
            if (data) {
              this.clienteDataService.setCliente(data); // Guardar cliente en el servicio
              this.router.navigate(['/resumen']);
            } else {
              console.error('Cliente no encontrado');
              alert('Cliente no encontrado');
            }
          },
          error => {
            console.error('Error al consultar el cliente', error);
            alert('Error al consultar el cliente');
          }
        );
    } else {
      alert('Formulario no válido');
    }
  }
}
