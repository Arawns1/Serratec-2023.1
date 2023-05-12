package com.residencia.biblioteca.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.residencia.biblioteca.entities.Aluno;
import com.residencia.biblioteca.repositories.AlunoRepository;

@Service
public class AlunoService {
	
	@Autowired
	AlunoRepository alunoRepository;
	
	@Transactional(readOnly = true)
	public List<Aluno> getAllAlunos() {
		return alunoRepository.findAll();
	}
	
	@Transactional(readOnly = true)
	public Aluno getAlunoById(Integer id) {
		return alunoRepository.findById(id).orElse(null);
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
