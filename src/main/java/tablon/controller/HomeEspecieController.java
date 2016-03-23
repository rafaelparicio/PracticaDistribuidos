package tablon.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeEspecieController {
	@RequestMapping("/homeEspecie")
	public String homeEspecieController(Model model) {
		return "homeEspecie";		
	}
}
