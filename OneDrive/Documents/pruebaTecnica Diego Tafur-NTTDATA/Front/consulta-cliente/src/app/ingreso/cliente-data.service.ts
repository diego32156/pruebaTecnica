import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class ClienteDataService {
  private cliente: any;

  setCliente(cliente: any) {
    this.cliente = cliente;
  }

  getCliente(): any {
    return this.cliente;
  }

  clearCliente() {
    this.cliente = null;
  }
}
