package gurruwin.backend.persona.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import gurruwin.backend.centro.Centro;
import gurruwin.backend.persona.Persona;
import gurruwin.backend.persona.service.personaService;

@CrossOrigin(origins = "http://localhost:4200") //Referenciamos nuestra URL
@RestController
@RequestMapping({"user"})
public class Controlador {
	
	@Autowired
	personaService service;
	//RETORNA TODAS LAS PERSONAS
	@GetMapping("/userAll")
	public List<Persona> listarAll(){
		return service.listarAll();
	}
	
	//RETORNA PERSONA POR CENTRO  ---------
	@GetMapping("/forCentro")
	public List<Persona> listarForCentro(@RequestBody Centro centro){
		return this.service.listarForCentro(centro);
	} 
	
	//RETORNA UNA SOLA PERSONA
	@GetMapping(path= {"/{id}"})
	public Persona listarId(@PathVariable("id") int id) {
		return service.listarForId(id);
	}
	
	//CREA NUEVA PERSONA
	@PostMapping("/new")
	public void create(@RequestBody Persona persona) {
		service.add(persona);
	}
	
	//MODIFICA UNA PERSONA
	@PutMapping(path= {"/{id}"})
	public Persona editar(@RequestBody Persona p, @PathVariable("id") int id) {
		p.setId(id);
		return service.edit(p);
	}
}
