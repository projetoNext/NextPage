package net.javaguides.sms.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import net.javaguides.sms.entity.Livro;
import net.javaguides.sms.repository.LivroRepository;
import net.javaguides.sms.service.LivroService;

@Service
public class LivroServicelmpl implements LivroService{
	
	private LivroRepository livroRepository;
	
	public LivroServicelmpl(LivroRepository livroRepository) {
		super();
		this.livroRepository = livroRepository;
	}

	@Override
	public List<Livro> getAllLivros() {
		return livroRepository.findAll();
	}

	@Override
	public Livro saveLivro(Livro livro) {
		return livroRepository.save(livro);
	}

	@Override
	public Livro getLivroById(Long id) {
		return livroRepository.findById(id).get();
	}

	@Override
	public Livro updateLivro(Livro livro) {
		return livroRepository.save(livro);
	}

	@Override
	public void deleteLivroById(Long id) {
		livroRepository.deleteById(id);	
	}

 

	 
}
