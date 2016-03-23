package tablon.controller;


import org.hibernate.mapping.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import tablon.model.Area;
import tablon.model.Especie;
import tablon.repository.EspecieRepository;

public class ModificarEspecieControler {

	@Autowired
	private EspecieRepository repositorioEspecie;

	@RequestMapping("/modificarEspecie") //Quizas funcione mejor @RequestMapping("modificarPersonal")
	public String insertar(@RequestParam long id, @RequestParam String tipo,@RequestParam String nombreComun, @RequestParam String nombreCientifico, @RequestParam List areas) {

        Especie especie = repositorioEspecie.findById(id);
        
        especie.setNombreComun(nombreComun);
        especie.setNombreCientifico(nombreCientifico);
        especie.setTipo(tipo);
        especie.setAreas(areas);
        
		repositorioEspecie.save(especie);

		//return "insertarPersonal";
		return "modificarEspecie";
	}
}
