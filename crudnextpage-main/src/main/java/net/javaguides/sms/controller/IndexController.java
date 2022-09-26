package net.javaguides.sms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import net.javaguides.sms.service.LivroService;


@Controller
public class IndexController {
	private LivroService livroService;

	public IndexController(LivroService livroService) {
		super();
		this.livroService = livroService;
	}
	
	// manipulador dos livros
	@GetMapping("/index")
	public String listLivros(Model model) {
		model.addAttribute("livros", livroService.getAllLivros());
		return "index";
	}
	
		
}
