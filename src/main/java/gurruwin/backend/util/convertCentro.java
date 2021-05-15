package gurruwin.backend.util;

import org.springframework.stereotype.Component;

import gurruwin.backend.centro.Centro;
import gurruwin.backend.centro.Dto.CentroDto;

@Component
public class convertCentro {
	
	public Centro getCentro(CentroDto centroDto) {
		Centro centro = new Centro();
		centro.setId(centro.getId());
		centro.setNombre(centroDto.getNombre());
//		centro.setPersonal(centroDto.getPersonal());
		return centro;
	}
}
