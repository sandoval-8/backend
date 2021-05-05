package gurruwin.backend.persona.service;

import java.util.List;

import gurruwin.backend.persona.Persona;

public interface personaService {
	
	List<Persona> listar();
	
	List<Persona> listarAll();
	
	Persona listarId(int id);
	
	Persona add(Persona p);
	
	Persona edit(Persona p);
	
	Persona delete(int id);
}
