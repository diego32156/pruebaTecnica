import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { HttpClientModule } from '@angular/common/http';
import { FormsModule } from '@angular/forms'; 

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { IngresoComponent } from './ingreso/ingreso.component';
import { ResumenComponent } from './resumen/resumen.component';
import { ClienteService } from './ingreso/cliente.service';
import { ClienteDataService } from './ingreso/cliente-data.service';

@NgModule({
  declarations: [
    AppComponent,
    IngresoComponent,
    ResumenComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule
  ],
  providers: [ClienteService, ClienteDataService],
  bootstrap: [AppComponent]
})
export class AppModule { }
