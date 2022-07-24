package com.portafolio.portafoliobackend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.portafolio.portafoliobackend.entity.Persona;
import com.portafolio.portafoliobackend.interfaz.IPersonaService;

@RestController
public class PersonaController {
	
	@Autowired IPersonaService ipersonaService;
	
	
	@GetMapping("/personas/traer")
	public List <Persona> getPersonas(){
		
		return ipersonaService.getPersona();
	}
	
	@PostMapping("/personas/crear")
	public String createPersona(@RequestBody Persona persona) {
		
		ipersonaService.savePersona(persona);
		
		return "La persona ha sido creada con éxito";	
		
	}
	
	@DeleteMapping("/personas/borrar/{id}")
	public String deletePersona(@PathVariable Long id) {
		
		ipersonaService.deletePersona(id);
		
		return "La persona ha sido borrada con éxito";
	}
	
	@PutMapping("/personas/editar/{id}")
	public Persona editPersona(@PathVariable Long id,
								@RequestParam("nombre") String nuevoNombre,
								@RequestParam("apellido") String nuevoApellido,
								@RequestParam("imagen") String nuevaImagen) {
		
		
		Persona persona = ipersonaService.findPersona(id);
		
		persona.setNombre(nuevoNombre);
		persona.setApellido(nuevoApellido);
		persona.setImagen(nuevaImagen);
		
		ipersonaService.savePersona(persona);
		
		return persona;
		
		
	}

}
