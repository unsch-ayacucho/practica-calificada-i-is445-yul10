package pe.edu.unsch.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import pe.edu.unsch.service.CargaacademicaService;

@Controller
@RequestMapping("/views")
public class IndexController {
	
	@Autowired
	private CargaacademicaService cargaacademicaService;

	@GetMapping("/index")
	public String index(Model model) {
		
		model.addAttribute("listCargaacademica", cargaacademicaService.listCarga());
		return "views/home/index";
	}
}
