package gurruwin.backend.util;

import org.springframework.stereotype.Component;

import gurruwin.backend.persona.Persona;
import gurruwin.backend.persona.Dto.PersonaDto;

@Component
public class convertPersona {
	
	public PersonaDto getPersonaDto(Persona persona) {
		PersonaDto personaDto = new PersonaDto();
		personaDto.setId(persona.getId());
		personaDto.setName(persona.getName());
		personaDto.setApellidos(persona.getApellidos());
	//	personaDto.setCentro(persona.getCentro());
		return personaDto;
	}
}
