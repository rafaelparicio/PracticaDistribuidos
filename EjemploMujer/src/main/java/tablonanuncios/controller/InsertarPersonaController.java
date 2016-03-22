package tablonanuncios.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import tablonanuncios.model.Anuncio;
import tablonanuncios.model.Persona;
import tablonanuncios.repository.PersonaRepository;

@Controller
public class InsertarPersonaController {

	@Autowired
	private PersonaRepository repositorioPersonas;

	@RequestMapping("/insertarPersona")
	public String insertar(@RequestParam String usuario,
						   @RequestParam String nombre,
						   @RequestParam String apellidos,
						   Model model) {

        Persona persona =new Persona();
        persona.setUsuario(usuario);
        persona.setNombre(nombre);
        persona.setApellidos(apellidos);
        persona.setAnuncios(new ArrayList<Anuncio>());
        
        
		repositorioPersonas.save(persona);

		return "insertarPersona";
	}
}