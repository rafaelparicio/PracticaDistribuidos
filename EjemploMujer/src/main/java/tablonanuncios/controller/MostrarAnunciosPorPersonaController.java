package tablonanuncios.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import tablonanuncios.model.Persona;
import tablonanuncios.repository.PersonaRepository;

@Controller
public class MostrarAnunciosPorPersonaController {

	@Autowired
	private PersonaRepository repositorioPersonas;

	@RequestMapping("/mostrarPorPersona")
	public String mostrar(@RequestParam String usuario, Model model) {

		Persona p = repositorioPersonas.findByUsuario(usuario);

    	model.addAttribute("anuncios", p.getAnuncios());

		return "mostrar";
	}
}