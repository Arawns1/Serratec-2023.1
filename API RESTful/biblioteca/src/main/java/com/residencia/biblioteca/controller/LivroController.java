package com.residencia.biblioteca.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.residencia.biblioteca.entities.Livro;
import com.residencia.biblioteca.services.LivroService;

@RestController
@RequestMapping("/livros")
public class LivroController {
	
	@Autowired
	LivroService livroService;
	
	@GetMapping
	public ResponseEntity<List<Livro>> getAllLivros(){
		//return alunoService.getAllAlunos();
		return new ResponseEntity<>(livroService.getAllLivros(),HttpStatus.FOUND);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Livro> getLivroById(@PathVariable Integer id){
		//return alunoService.getAlunoById(id);
		Livro livroResponse = livroService.getLivroById(id);
		if(livroResponse == null) {
			return new ResponseEntity<>(livroResponse, HttpStatus.NOT_FOUND);
		}
		else {
			return new ResponseEntity<>(livroResponse,HttpStatus.FOUND);
		}
	}
	
	@PostMapping
	public ResponseEntity<Livro> saveLivro(@RequestBody Livro livro){
		return new ResponseEntity<>(livroService.saveLivro(livro),HttpStatus.CREATED);
	}
	
	@PutMapping
	//@PutMapping("/{id}")
	public ResponseEntity<Livro> updateLivro(@RequestBody Livro livro, Integer id){
		
		Livro livroResponse = livroService.updateLivro(livro,id);
		if(livroResponse == null) {
			return new ResponseEntity<>(null, HttpStatus.NOT_MODIFIED);
		}
		else {
			return new ResponseEntity<>(livroResponse,HttpStatus.OK);
		}
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Boolean> deleteLivro(@PathVariable Integer id) {
		
		Boolean response = livroService.deleteLivro(id);
		
		if(response) {
			return new ResponseEntity<>(response,HttpStatus.OK);
		}
		else {
			return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
		}
	}

}
