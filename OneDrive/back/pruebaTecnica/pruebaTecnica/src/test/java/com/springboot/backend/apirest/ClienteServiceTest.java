package com.springboot.backend.apirest;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import java.util.Optional;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import com.pruebaTecnica.nttdata.pruebaTecnica.models.dao.ClienteRepository;
import com.pruebaTecnica.nttdata.pruebaTecnica.models.entity.Cliente;
import com.pruebaTecnica.nttdata.pruebaTecnica.models.service.ClienteService;

public class ClienteServiceTest {
	@Test
    void testObtenerCliente() {
        ClienteRepository clienteRepository = Mockito.mock(ClienteRepository.class);
        ClienteService clienteService = new ClienteService();
        clienteService.clienteRepository = clienteRepository;

        Cliente mockCliente = new Cliente();
        mockCliente.setNumeroDocumento("23445322");

        when(clienteRepository.findByTipoDocumentoAndNumeroDocumento("C", "23445322"))
                .thenReturn(Optional.of(mockCliente));

        Optional<Cliente> cliente = clienteService.obtenerCliente("C", "23445322");

        assertTrue(cliente.isPresent());
        assertEquals("23445322", cliente.get().getNumeroDocumento());
    }
}
