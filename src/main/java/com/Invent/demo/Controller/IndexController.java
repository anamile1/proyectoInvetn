 package com.Invent.demo.Controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.Invent.demo.models.Producto;
import com.Invent.demo.repository.ProductoRepository;



	
	@Controller
	@RequestMapping("/app")
	public class IndexController {
		
		private final Logger logg= LoggerFactory.getLogger(Producto.class);
		
		@Autowired
		private ProductoRepository productoRepository;
		
		@GetMapping({"/index"})
		public String index(Model model) {
			model.addAttribute("producto", productoRepository.findAll());
			return "index";
			}
	
		@PostMapping("/save")
		public String save(Producto producto) {
			logg.info("Informacion del objeto producto, {}", producto);
			productoRepository.save(producto);
			return "redirect:/app";
		}
		

}
