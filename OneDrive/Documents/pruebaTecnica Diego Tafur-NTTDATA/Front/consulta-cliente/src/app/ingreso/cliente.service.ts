import { Injectable } from '@angular/core';
import { HttpClient, HttpParams } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class ClienteService {
  private apiUrl = 'http://localhost:8090/api/clientes';  // URL de tu API backend

  constructor(private http: HttpClient) { }

  obtenerCliente(tipoDocumento: string, numeroDocumento: string): Observable<any> {
    const url = `${this.apiUrl}/${tipoDocumento}/${numeroDocumento}`;
    return this.http.get<any>(url);
  }
  
  
}
