package com.portafolio.portafoliobackend.interfaz;

import java.util.List;

import com.portafolio.portafoliobackend.entity.Persona;

public interface IPersonaService {
	
	// Obtener una lista de personas
	
	public List <Persona> getPersona();
	
	// Guardar un objeto del tipo Persona
	
	public void savePersona(Persona persona);
	
	// Eliminar un objeto Persona por medio de su parámetro Id
	
	public void deletePersona(Long id);
	
	// Buscar una persona por id
	
	public Persona findPersona(Long id);

}
