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

import com.residencia.biblioteca.entities.Usuario;
import com.residencia.biblioteca.services.UsuarioService;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
	
	@Autowired
	UsuarioService usuarioService;
	
	@GetMapping
	public ResponseEntity<List<Usuario>> getAllUsuarios(){
		//return usuarioService.getAllUsuarios();
		return new ResponseEntity<>(usuarioService.getAllUsuarios(),HttpStatus.FOUND);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Usuario> getUsuarioById(@PathVariable Integer id){
		//return usuarioService.getUsuarioById(id);
		Usuario usuarioResponse = usuarioService.getUsuarioById(id);
		if(usuarioResponse == null) {
			return new ResponseEntity<>(usuarioResponse, HttpStatus.NOT_FOUND);
		}
		else {
			return new ResponseEntity<>(usuarioResponse,HttpStatus.FOUND);
		}
	}
	
	@PostMapping
	public ResponseEntity<Usuario> saveUsuario(@RequestBody Usuario usuario){
		return new ResponseEntity<>(usuarioService.saveUsuario(usuario),HttpStatus.CREATED);
	}
	
	@PutMapping
	//@PutMapping("/{id}")
	public ResponseEntity<Usuario> updateUsuario(@RequestBody Usuario usuario, Integer id){
		
		Usuario usuarioResponse = usuarioService.updateUsuario(usuario,id);
		if(usuarioResponse == null) {
			return new ResponseEntity<>(null, HttpStatus.NOT_MODIFIED);
		}
		else {
			return new ResponseEntity<>(usuarioResponse,HttpStatus.OK);
		}
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Boolean> deleteUsuario(@PathVariable Integer id) {
		
		Boolean response = usuarioService.deleteUsuario(id);
		
		if(response) {
			return new ResponseEntity<>(response,HttpStatus.OK);
		}
		else {
			return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
		}
	}

}
