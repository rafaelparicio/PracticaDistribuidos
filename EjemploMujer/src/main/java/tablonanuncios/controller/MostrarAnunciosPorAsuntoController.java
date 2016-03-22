package tablonanuncios.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import tablonanuncios.model.Anuncio;
import tablonanuncios.repository.AnuncioRepository;

@Controller
public class MostrarAnunciosPorAsuntoController {

	@Autowired
	private AnuncioRepository repositorioAnuncios;

	@RequestMapping("/mostrarPorAsunto")
	public String mostrar(@RequestParam String asunto, Model model) {

		List<Anuncio> variosanuncios = repositorioAnuncios.findByAsunto(asunto);

	    model.addAttribute("anuncios", variosanuncios);

		return "mostrar";
	}
}