package tablon.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import tablon.model.Personal;
import tablon.repository.PersonalRepository;

@Controller
public class ConsultarPersonalController{

	@Autowired
	private PersonalRepository repositorioPersonal;

	@RequestMapping("/consultarPersonal")
	public String mostrarPorNombreYApellidos(@RequestParam String nombre, @RequestParam String apellidos2, Model model) {

		List<Personal> variosPersonal = repositorioPersonal.findAllByNombreAndApellidos(nombre, apellidos2);

	    model.addAttribute("personalList", variosPersonal);

		return "/consultarPersonal";
	}
	/*
	@RequestMapping("/consultarPersonal")
	public String mostrarPorApellido(@RequestParam String apellido, Model model) {

		List<Personal> variosPersonal = repositorioPersonal.findAllByApellidos(apellido);

	    model.addAttribute("personalList", variosPersonal);

		return "/consultarPersonal";
	}
	
	@RequestMapping("/consultarPersonal")
	public String mostrarPorTipo(@RequestParam String tipo, Model model) {

		List<Personal> variosPersonal = repositorioPersonal.findAllByTipo(tipo);

	    model.addAttribute("personalList", variosPersonal);

		return "/consultarPersonal";
	}*/
}
