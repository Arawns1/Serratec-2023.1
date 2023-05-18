package com.residencia.biblioteca.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.residencia.biblioteca.dto.EmprestimoResumidoDTO;
import com.residencia.biblioteca.entities.Emprestimo;
import com.residencia.biblioteca.repositories.EmprestimoRepository;

@Service
public class EmprestimoService {
	@Autowired
	EmprestimoRepository emprestimoRepository;
	
	public List<Emprestimo> getAllEmprestimos() {
		return emprestimoRepository.findAll();
	}
	
	public Emprestimo getEmprestimoById(Integer id) {
		return emprestimoRepository.findById(id).orElse(null);
	}
	
	public EmprestimoResumidoDTO getEmprestimoDtoById(Integer id) {
		
		Emprestimo emprestimoResponse = emprestimoRepository.findById(id).orElse(null);
		
		if(emprestimoResponse == null) {
			return null;
		}
		return new EmprestimoResumidoDTO(emprestimoResponse);
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
