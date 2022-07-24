package com.portafolio.portafoliobackend.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Persona {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotNull
	@Size(min = 1 , max = 50 , message = "No cumple con la longitud requerida")
	private String nombre;
	
	@NotNull
	@Size(min = 1 , max = 50 , message = "No cumple con la longitud requerida")
	private String apellido;
	
	
	@Size(min = 1 , max = 50 , message = "No cumple con la longitud requerida")
	private String imagen;
	
	// Constructor


	public Persona(Long id,
			@NotNull @Size(min = 1, max = 50, message = "No cumple con la longitud requerida") String nombre,
			@NotNull @Size(min = 1, max = 50, message = "No cumple con la longitud requerida") String apellido,
			@Size(min = 1, max = 50, message = "No cumple con la longitud requerida") String imagen) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.imagen = imagen;
	}
	
	
	// Getters and Setters

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}
	
	
	
	
	
	

}
