package com.residencia.biblioteca.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.residencia.biblioteca.dto.AlunoResumidoDTO;
import com.residencia.biblioteca.entities.Aluno;
import com.residencia.biblioteca.repositories.AlunoRepository;

@Service
public class AlunoService {
	
	@Autowired
	AlunoRepository alunoRepository;
	
	public List<Aluno> getAllAlunos() {
		return alunoRepository.findAll();
	}
	
	public Aluno getAlunoById(Integer id) {
		return alunoRepository.findById(id).orElse(null);
	}
	
	public AlunoResumidoDTO getAlunoDtoById(Integer id) {
		
		Aluno alunoResponse = alunoRepository.findById(id).orElse(null);
		
		if(alunoResponse == null) {
			return null;
		}
		return new AlunoResumidoDTO(alunoResponse);
		
	}
	
	public Aluno saveAluno(Aluno aluno) {
		return alunoRepository.save(aluno);
	}
	//Update aluno set nome = "Alexandro" where numeromatriculaaluno = 10;
	//Preciso ter cuidado com os dados da instancia aluno quando for atualizar um aluno.
	public Aluno updateAluno(Aluno aluno, Integer id) {
		return alunoRepository.save(aluno);
	}
	
	//Delete from aluno where numeromatriculaaluno = 10 ;
	public Boolean deleteAluno(Integer id) {
		alunoRepository.deleteById(id);
		Aluno alunoDeletado = alunoRepository.findById(id).orElse(null);
		if(alunoDeletado == null) {
			return true;
		}
		else {
			return false;
		}
		
	}

}
