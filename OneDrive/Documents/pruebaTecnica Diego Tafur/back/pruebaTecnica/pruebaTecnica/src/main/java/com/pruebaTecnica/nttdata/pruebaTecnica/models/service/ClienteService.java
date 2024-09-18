package com.pruebaTecnica.nttdata.pruebaTecnica.models.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;

import com.pruebaTecnica.nttdata.pruebaTecnica.models.dao.ClienteRepository;
import com.pruebaTecnica.nttdata.pruebaTecnica.models.entity.Cliente;

@Service
public class ClienteService {
	
	 @Autowired
	public ClienteRepository clienteRepository;
	 
	    public Optional<Cliente> obtenerCliente(String tipoDocumento, String numeroDocumento) {
	        // Verificamos que el tipo de documento sea válido
	        if (!tipoDocumento.equals("C") && !tipoDocumento.equals("P")) {
	            return Optional.empty(); // O lanzar una excepción personalizada si lo prefieres
	        }

	        // Realizamos la consulta en la base de datos utilizando el repositorio
	        return clienteRepository.findByTipoDocumentoAndNumeroDocumento(tipoDocumento, numeroDocumento);
	    }
}
