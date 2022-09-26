package net.javaguides.sms.service;

import java.util.List;

import net.javaguides.sms.entity.Livro;

public interface LivroService {
     List<Livro> getAllLivros();
	
	Livro saveLivro(Livro livro);
	
	Livro getLivroById(Long id);
	
	Livro updateLivro(Livro livro);
	
	void deleteLivroById(Long id);
}
