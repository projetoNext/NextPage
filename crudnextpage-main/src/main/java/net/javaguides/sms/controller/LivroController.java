package net.javaguides.sms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import net.javaguides.sms.entity.Livro;
import net.javaguides.sms.service.LivroService;


@Controller
public class LivroController {
	private LivroService livroService;

	public LivroController(LivroService livroService) {
		super();
		this.livroService = livroService;
	}
	
	// manipulador dos livros
	@GetMapping("/livros")
	public String listLivros(Model model) {
		model.addAttribute("livros", livroService.getAllLivros());
		return "livros";
	}
	
	@GetMapping("/livros/new")
	public String createLivroForm(Model model) {
		
		// Create Livro
		Livro livro = new Livro();
		model.addAttribute("livro", livro);
		return "create_livro";
		
	}
	
	@PostMapping("/livros")
	public String saveLivro(@ModelAttribute("livro") Livro livro) {
		livroService.saveLivro(livro);
		return "redirect:/livros";
	}
	
	@GetMapping("/livros/edit/{id}")
	public String editLivroForm(@PathVariable Long id, Model model) {
		model.addAttribute("livro", livroService.getLivroById(id));
		return "edit_Livro";
	}

	@PostMapping("/livros/{id}")
	public String updateLivro(@PathVariable Long id,
			@ModelAttribute("livro") Livro livro,
			Model model) {
		
		// get livro from database by id
		Livro existingLivro = livroService.getLivroById(id);
		existingLivro.setId(id);
		existingLivro.setTitulo(livro.getTitulo());
		existingLivro.setAutor(livro.getAutor());
		existingLivro.setCategoria(livro.getCategoria());
		existingLivro.setEditora(livro.getEditora());
		existingLivro.setQtdPagina(livro.getQtdPagina());
		existingLivro.setCapa(livro.getCapa());
		existingLivro.setValor(livro.getValor());
		 
		
		// save updated student object
		livroService.updateLivro(existingLivro);
		return "redirect:/livros";		
	}
	
	// handler method to handle delete student request
	
	@GetMapping("/livros/{id}")
	public String deleteLivro(@PathVariable Long id) {
		livroService.deleteLivroById(id);
		return "redirect:/livros";
	}
	
}
