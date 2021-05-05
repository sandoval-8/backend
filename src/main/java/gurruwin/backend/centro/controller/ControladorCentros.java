package gurruwin.backend.centro.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import gurruwin.backend.centro.Centro;
import gurruwin.backend.centro.service.centroService;

@CrossOrigin(origins = "http://localhost:4200") //Referenciamos nuestra URL
@RestController
@RequestMapping({"/centros"})
public class ControladorCentros {
	
	@Autowired
	centroService service;
	
	@GetMapping
	public List<Centro> centros(){
		return this.service.getCentros();
	}
}
