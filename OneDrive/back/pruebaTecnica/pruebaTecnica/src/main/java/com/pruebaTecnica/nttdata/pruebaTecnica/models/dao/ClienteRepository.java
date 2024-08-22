package com.pruebaTecnica.nttdata.pruebaTecnica.models.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pruebaTecnica.nttdata.pruebaTecnica.models.entity.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

	Optional<Cliente> findByTipoDocumentoAndNumeroDocumento(String tipoDocumento, String numeroDocumento);

}
