package com.Invent.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

	
	@Controller
	@RequestMapping("/app")
	public class ProductoController {
		@GetMapping({"/producto"})
		public String producto() {
			return "producto";
			}

}
