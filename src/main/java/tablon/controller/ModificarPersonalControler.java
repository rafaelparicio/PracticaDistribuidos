package tablon.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import tablon.model.Personal;
import tablon.repository.PersonalRepository;

public class ModificarPersonalControler {

	@Autowired
	private PersonalRepository repositorioPersonal;

	@RequestMapping("/modificarPersonal") //Quizas funcione mejor @RequestMapping("modificarPersonal")
	public String insertar(@RequestParam long id, @RequestParam String nombre,@RequestParam String apellidos, @RequestParam String email, @RequestParam String fijo, @RequestParam String movil, Model model) {

        Personal personal = repositorioPersonal.findById(id);
        
        personal.setNombre(nombre);
        personal.setApellidos(apellidos);
        personal.setEmail(email);
        personal.setFijo(fijo);
        personal.setMovil(movil);
        
		repositorioPersonal.save(personal);

		//return "insertarPersonal";
		return "personalInsertado";
	}
}
