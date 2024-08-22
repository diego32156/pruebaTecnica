package com.pruebaTecnica.nttdata.pruebaTecnica.models.entity;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="cliente")
public class Cliente implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	private Long id;
    private String tipoDocumento;
    private String numeroDocumento;
	private String primerNombre;
    private String segundoNombre;
    private String primerApellido;
    private String segundoApellido;
    private String telefono;
    private String direccion;
    private String ciudadResidencia;

    

	public void setId(Long id) {
		this.id = id;
	}

	public Long getId() {
		return id;
	}

	public String getTipoDocumento() {
		return tipoDocumento;
	}


	public void setTipoDocumento(String tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}


	public String getNumeroDocumento() {
		return numeroDocumento;
	}


	public void setNumeroDocumento(String numeroDocumento) {
		this.numeroDocumento = numeroDocumento;
	}


	public String getPrimerNombre() {
		return primerNombre;
	}



	public void setPrimerNombre(String primerNombre) {
		this.primerNombre = primerNombre;
	}



	public String getSegundoNombre() {
		return segundoNombre;
	}



	public void setSegundoNombre(String segundoNombre) {
		this.segundoNombre = segundoNombre;
	}



	public String getPrimerApellido() {
		return primerApellido;
	}



	public void setPrimerApellido(String primerApellido) {
		this.primerApellido = primerApellido;
	}



	public String getSegundoApellido() {
		return segundoApellido;
	}



	public void setSegundoApellido(String segundoApellido) {
		this.segundoApellido = segundoApellido;
	}



	public String getTelefono() {
		return telefono;
	}



	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}



	public String getDireccion() {
		return direccion;
	}



	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}



	public String getCiudadResidencia() {
		return ciudadResidencia;
	}



	public void setCiudadResidencia(String ciudadResidencia) {
		this.ciudadResidencia = ciudadResidencia;
	}



	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}
