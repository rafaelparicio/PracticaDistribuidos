package tablon.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomePersonalController {
	@RequestMapping("/homePersonal")
	public String homeEspecieController(Model model) {
		return "homePersonal";		
	}
}
