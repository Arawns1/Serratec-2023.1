package com.residencia.biblioteca.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.residencia.biblioteca.entities.Livro;
import com.residencia.biblioteca.repositories.LivroRepository;

@Service
public class LivroService {
	@Autowired
	LivroRepository livroRepository;
	
	@Transactional(readOnly = true)
	public List<Livro> getAllLivros() {
		return livroRepository.findAll();
	}
	
	@Transactional(readOnly = true)
	public Livro getLivroById(Integer id) {
		return livroRepository.findById(id).orElse(null);
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
