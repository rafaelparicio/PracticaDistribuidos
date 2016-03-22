package tablonanuncios.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import tablonanuncios.model.Anuncio;
import tablonanuncios.model.Persona;
import tablonanuncios.repository.AnuncioRepository;
import tablonanuncios.repository.PersonaRepository;

@Controller
public class InsertarController {

	@Autowired
	private PersonaRepository repositorioPersonas;
	
	@Autowired
	private AnuncioRepository repositorioAnuncios;

	@RequestMapping("/insertar")
	public String insertar(@RequestParam String usuario, @RequestParam String asunto, @RequestParam String comentario,
			Model model) {

		Persona p = repositorioPersonas.findByUsuario(usuario);

		Anuncio a = new Anuncio();
		a.setAutor(p);
		a.setAsunto(asunto);
		a.setComentario(comentario);

		repositorioAnuncios.save(a);
		p.getAnuncios().add(a);
		
		repositorioPersonas.save(p);

		return "insertar";
	}

}