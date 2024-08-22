import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { ClienteDataService } from '../ingreso/cliente-data.service';

@Component({
  selector: 'app-resumen',
  templateUrl: './resumen.component.html',
  styleUrls: ['./resumen.component.css']
})
export class ResumenComponent implements OnInit {
  cliente: any;

  constructor(
    private router: Router,
    private clienteDataService: ClienteDataService
  ) {}

  ngOnInit() {
    this.cliente = this.clienteDataService.getCliente();

    if (!this.cliente) {
      console.error('El objeto cliente no está definido');
      this.volver();
    } else {
      console.log('Cliente recibido:', this.cliente);
    }
  }

  volver() {
    this.router.navigate(['/ingreso']);
  }
}
