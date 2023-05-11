package com.residencia.biblioteca.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.residencia.biblioteca.entities.Editora;
import com.residencia.biblioteca.repositories.EditoraRepository;

@Service
public class EditoraService {
	@Autowired
	EditoraRepository editoraRepository;
	
	@Transactional(readOnly = true)
	public List<Editora> getAllEditoras() {
		return editoraRepository.findAll();
	}
	
	@Transactional(readOnly = true)
	public Editora getEditoraById(Integer id) {
		return editoraRepository.findById(id).orElse(null);
	}
	
	public Editora saveAluno(Editora editora) {
		return editoraRepository.save(editora);
	}
	
	public Editora updateAluno(Editora editora, Integer id) {
		return editoraRepository.save(editora);
	}
	
	public Boolean deleteEditora(Integer id) {
		editoraRepository.deleteById(id);
		Editora editoraDeletada = editoraRepository.findById(id).orElse(null);
		if(editoraDeletada == null) {
			return true;
		}
		else {
			return false;
		}
		
	}
	
}
