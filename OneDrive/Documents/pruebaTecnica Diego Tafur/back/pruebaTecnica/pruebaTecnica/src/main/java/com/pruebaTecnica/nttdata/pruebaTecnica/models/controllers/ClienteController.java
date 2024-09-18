package com.pruebaTecnica.nttdata.pruebaTecnica.models.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pruebaTecnica.nttdata.pruebaTecnica.models.entity.Cliente;
import com.pruebaTecnica.nttdata.pruebaTecnica.models.service.ClienteService;

@CrossOrigin(origins= {"http://localhost:4200"})
@RestController
@RequestMapping(value="/api/clientes")
public class ClienteController {
	
    @Autowired
    private ClienteService clienteService;

    @GetMapping("/{tipoDocumento}/{numeroDocumento}")
    public ResponseEntity<?> obtenerCliente(@PathVariable String tipoDocumento, @PathVariable String numeroDocumento) {
        if (!tipoDocumento.equals("C") && !tipoDocumento.equals("P")) {
            return new ResponseEntity<>("Tipo de documento no válido", HttpStatus.BAD_REQUEST);
        }

        Optional<Cliente> cliente = clienteService.obtenerCliente(tipoDocumento, numeroDocumento);
        if (cliente.isPresent()) {
            return new ResponseEntity<>(cliente.get(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>("Cliente no encontrado", HttpStatus.NOT_FOUND);
        }
    }
}
