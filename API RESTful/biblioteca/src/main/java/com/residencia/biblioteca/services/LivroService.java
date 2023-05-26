package com.residencia.biblioteca.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.residencia.biblioteca.entities.Livro;
import com.residencia.biblioteca.exception.NoSuchElementException;
import com.residencia.biblioteca.repositories.LivroRepository;

@Service
public class LivroService {
	@Autowired
	LivroRepository livroRepository;
	
	public List<Livro> getAllLivros() {
		return livroRepository.findAll();
	}
	
	public Livro getLivroById(Integer id) {
		return livroRepository.findById(id)
				.orElseThrow(() -> new NoSuchElementException("Livro", id));
	}
	
	public Livro saveLivro(Livro livro) {
		return livroRepository.save(livro);
	}
	
	public Livro updateLivro(Livro livro, Integer id) {
		return livroRepository.save(livro);
	}
	
	public Boolean deleteLivro(Integer id) {
		livroRepository.deleteById(id);
		Livro livroDeletado = livroRepository.findById(id).orElse(null);
		if(livroDeletado == null) {
			return true;
		}
		else {
			return false;
		}
		
	}
}
