package com.residencia.biblioteca.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.residencia.biblioteca.entities.Aluno;
import com.residencia.biblioteca.services.AlunoService;

@RestController
@RequestMapping("/alunos")
public class AlunoController {
	
	@Autowired
	AlunoService alunoService;
	
	@GetMapping
	public ResponseEntity<List<Aluno>> getAllAlunos(){
		//return alunoService.getAllAlunos();
		return new ResponseEntity<>(alunoService.getAllAlunos(),HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Aluno> getAlunoById(@PathVariable Integer id){
		//return alunoService.getAlunoById(id);
		Aluno alunoResponse = alunoService.getAlunoById(id);
		if(alunoResponse == null) {
			return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
		}
		else {
			return new ResponseEntity<>(alunoResponse,HttpStatus.OK);
		}
	}
	
	@PostMapping
	public ResponseEntity<Aluno> saveAluno(Aluno aluno){
		
		Aluno alunoResponse = alunoService.saveAluno(aluno);
		if(alunoResponse == null) {
			return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
		}
		else {
			return new ResponseEntity<>(alunoResponse,HttpStatus.OK);
		}
	}
	
	@PutMapping
	//@PutMapping("/{id}")
	public ResponseEntity<Aluno> updateAluno(Aluno aluno, Integer id){
		
		Aluno alunoResponse = alunoService.updateAluno(aluno,id);
		if(alunoResponse == null) {
			return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
		}
		else {
			return new ResponseEntity<>(alunoResponse,HttpStatus.OK);
		}
	}
	
	//@DeleteMapping("/{id}")
	public ResponseEntity<Boolean> deleteAluno(Integer id) {
		
		Boolean alunoResponse = alunoService.deleteAluno(id);
		
		if(alunoResponse == false) {
			return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
		}
		else {
			return new ResponseEntity<>(alunoResponse,HttpStatus.OK);
		}
	}

}
