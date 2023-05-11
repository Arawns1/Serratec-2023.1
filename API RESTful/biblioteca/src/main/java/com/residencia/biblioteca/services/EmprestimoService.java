package com.residencia.biblioteca.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.residencia.biblioteca.entities.Emprestimo;
import com.residencia.biblioteca.repositories.EmprestimoRepository;

@Service
public class EmprestimoService {
	@Autowired
	EmprestimoRepository emprestimoRepository;
	
	@Transactional(readOnly = true)
	public List<Emprestimo> getAllEmprestimos() {
		return emprestimoRepository.findAll();
	}
	
	@Transactional(readOnly = true)
	public Emprestimo getEmprestimoById(Integer id) {
		return emprestimoRepository.findById(id).orElse(null);
	}
	
	public Emprestimo saveEmprestimo(Emprestimo emprestimo) {
		return emprestimoRepository.save(emprestimo);
	}
	
	public Emprestimo updateEmprestimo(Emprestimo emprestimo, Integer id) {
		return emprestimoRepository.save(emprestimo);
	}
	
	public Boolean deleteEmprestimo(Integer id) {
		emprestimoRepository.deleteById(id);
		Emprestimo emprestimoDeletado = emprestimoRepository.findById(id).orElse(null);
		if(emprestimoDeletado == null) {
			return true;
		}
		else {
			return false;
		}
		
	}
}
