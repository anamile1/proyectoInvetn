package com.Invent.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

	
	@Controller
	@RequestMapping("/app")
	//Prueba
	public class IndexController {
		@GetMapping({"/home","/","/index"})
		public String index(Model model) {
				model.addAttribute("titulo", "Aprendiendo Spring ADSI");
				return "index";
			}

}
