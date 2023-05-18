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

import com.residencia.biblioteca.dto.EditoraResumidaDTO;
import com.residencia.biblioteca.entities.Editora;
import com.residencia.biblioteca.services.EditoraService;

@RestController
@RequestMapping("/editoras")
public class EditoraController {
	
	@Autowired
	EditoraService editoraService;
	
	@GetMapping
	public ResponseEntity<List<Editora>> getAllEditoras(){
		//return editoraService.getAllEditoras();
		return new ResponseEntity<>(editoraService.getAllEditoras(),HttpStatus.FOUND);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Editora> getEditoraById(@PathVariable Integer id){
		//return editoraService.getEditoraById(id);
		Editora editoraResponse = editoraService.getEditoraById(id);
		if(editoraResponse == null) {
			return new ResponseEntity<>(editoraResponse, HttpStatus.NOT_FOUND);
		}
		else {
			return new ResponseEntity<>(editoraResponse,HttpStatus.FOUND);
		}
	}
	
	@GetMapping("/dto/{id}")
	public ResponseEntity<EditoraResumidaDTO> getEditoraDtoById(@PathVariable Integer id){
		//return editoraService.getEditoraById(id);
		EditoraResumidaDTO editoraDtoResponse = editoraService.getEditoraDtoById(id);
		if(editoraDtoResponse == null) {
			return new ResponseEntity<>(editoraDtoResponse, HttpStatus.NOT_FOUND);
		}
		else {
			return new ResponseEntity<>(editoraDtoResponse,HttpStatus.FOUND);
		}
	}
	
	
	
	@PostMapping
	public ResponseEntity<Editora> saveEditora(@RequestBody Editora editora){
		return new ResponseEntity<>(editoraService.saveEditora(editora),HttpStatus.CREATED);
	}
	
	@PutMapping
	//@PutMapping("/{id}")
	public ResponseEntity<Editora> updateEditora(@RequestBody Editora editora, Integer id){
		
		Editora editoraResponse = editoraService.updateEditora(editora,id);
		if(editoraResponse == null) {
			return new ResponseEntity<>(null, HttpStatus.NOT_MODIFIED);
		}
		else {
			return new ResponseEntity<>(editoraResponse,HttpStatus.OK);
		}
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Boolean> deleteEditora(@PathVariable Integer id) {
		
		Boolean response = editoraService.deleteEditora(id);
		
		if(response) {
			return new ResponseEntity<>(response,HttpStatus.OK);
		}
		else {
			return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
		}
	}

}
