package com.example.curpgenerator.models;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public class CurpRequest {

	public CurpRequest() {

	}

	public CurpRequest( String primerApellido,  String segundoApellido,  String nombre,
						 String fechaNacimiento,  String sexo,  String estadoNacimiento) {
		this.primerApellido = primerApellido;
		this.segundoApellido = segundoApellido;
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
		this.sexo = sexo;
		this.estadoNacimiento = estadoNacimiento;
	}
	
	@NotNull(message = "El primer apellido no puede ser nullo")
	@NotBlank(message = "El primer apellido no puede estar vacio")
	private String primerApellido;
	
	@NotBlank
	private String segundoApellido;

	@NotNull(message = "El nombre no puede ser nullo")
	@NotBlank(message = "El nombre no puede estar vacio")
	private String nombre;
	
	@NotNull(message = "La fecha de nacimiento no puede ser nulla")
	@NotBlank(message = "La fecha de nacimiento no puede estar vacia")
	@Pattern(regexp = "^(0[1-9]|[12][0-9]|3[01])-(0[1-9]|1[0-2])-(\\d{4})$", message = "La fecha de nacimiento debe estar en formato dd-MM-yyyy")
	private String fechaNacimiento;

	@NotNull(message = "El sexo no puede ser nullo")
	@NotBlank(message = "El sexo no puede estar vacio")
	@Pattern(regexp = "^[HM]$", message = "Debe ser 'H' o 'M'")
	private String sexo;

	@NotNull(message = "El estado de nacimiento no puede ser nullo")
	@NotBlank(message = "El estado de nacimiento no puede estar vacio")
	private String estadoNacimiento;
	
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

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getEstadoNacimiento() {
		return estadoNacimiento;
	}

	public void setEstadoNacimiento(String estadoNacimiento) {
		this.estadoNacimiento = estadoNacimiento;
	}

}
