package com.residencia.biblioteca.services;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.residencia.biblioteca.dto.AlunoDTO;
import com.residencia.biblioteca.dto.AlunoResumidoDTO;
import com.residencia.biblioteca.dto.EmprestimoResumidoDTO;
import com.residencia.biblioteca.dto.LivroResumidoDTO;
import com.residencia.biblioteca.entities.Aluno;
import com.residencia.biblioteca.entities.Emprestimo;
import com.residencia.biblioteca.entities.Livro;
import com.residencia.biblioteca.repositories.AlunoRepository;

@Service
public class AlunoService {

	@Autowired
	AlunoRepository alunoRepository;
	
	@Autowired
	EmailService emailService;
	
	public List<Aluno> getAllAlunos() {
		return alunoRepository.findAll();
	}

	public Aluno getAlunoById(Integer id) {
		return alunoRepository.findById(id).orElse(null);
	}

	public AlunoResumidoDTO getAlunoEmprestimosDto(Integer id) {

		Aluno alunoResponse = alunoRepository.findById(id).orElse(null);

		if (alunoResponse == null) {
			return null;
		}

		AlunoResumidoDTO alunoResumidoDTO = new AlunoResumidoDTO();
		alunoResumidoDTO.setNome(alunoResponse.getNome());
		alunoResumidoDTO.setCPF(alunoResponse.getCPF());

		List<EmprestimoResumidoDTO> listaEmprestimoResDto = new ArrayList<>();

		for (Emprestimo emprestimo : alunoResponse.getEmprestimos()) {
			EmprestimoResumidoDTO emprestimoResDto = new EmprestimoResumidoDTO();
			emprestimoResDto.setDataEmprestimo(emprestimo.getDataEmprestimo());
			emprestimoResDto.setDataEntrega(emprestimo.getDataEntrega());

			LivroResumidoDTO livroResDto = new LivroResumidoDTO();
			if (emprestimo.getLivro() == null) {
				livroResDto.setNomeLivro(null);
			} else {
				livroResDto.setNomeLivro(emprestimo.getLivro().getNomeLivro());
			}

			emprestimoResDto.setLivroResumidoDTO(livroResDto);
			listaEmprestimoResDto.add(emprestimoResDto);
		}

		alunoResumidoDTO.setListaEmprestimoResDto(listaEmprestimoResDto);

		return alunoResumidoDTO;

	}

	public Aluno saveAluno(Aluno aluno) {
		Aluno novoAluno = alunoRepository.save(aluno);
		emailService.enviarEmail("gabrieldamico22@gmail.com",
								 "Novo Aluno cadastrado", 
								 novoAluno.toString());
		return novoAluno;
	}

	public AlunoDTO saveAlunoDto(AlunoDTO alunoDto) {
		
		ModelMapper modelMapper = new ModelMapper();
		
		Aluno aluno = modelMapper.map(alunoDto, Aluno.class);
		
		alunoRepository.save(aluno);
		
		return modelMapper.map(aluno, AlunoDTO.class);
		
		/*
		 * Aluno aluno = new Aluno(); aluno.setBairro(alunoDto.getBairro());
		 * aluno.setCidade(alunoDto.getCidade());
		 * aluno.setComplemento(alunoDto.getComplemento());
		 * aluno.setCPF(alunoDto.getCPF());
		 * aluno.setDataNascimento(alunoDto.getDataNascimento());
		 * aluno.setLogradouro(alunoDto.getLogradouro());
		 * aluno.setNome(alunoDto.getNome());
		 * aluno.setNumeroLogradouro(alunoDto.getNumeroLogradouro()); Aluno novoAluno =
		 * alunoRepository.save(aluno);
		 * 
		 * AlunoDTO novoAlunoDTO = new AlunoDTO();
		 * novoAlunoDTO.setBairro(novoAluno.getBairro());
		 * novoAlunoDTO.setCidade(novoAluno.getCidade());
		 * novoAlunoDTO.setComplemento(novoAluno.getComplemento());
		 * novoAlunoDTO.setCPF(novoAluno.getCPF());
		 * novoAlunoDTO.setDataNascimento(novoAluno.getDataNascimento());
		 * novoAlunoDTO.setLogradouro(novoAluno.getLogradouro());
		 * novoAlunoDTO.setNome(novoAluno.getNome());
		 * novoAlunoDTO.setNumeroLogradouro(novoAluno.getNumeroLogradouro());
		 * novoAlunoDTO.setNumeroMatriculaAluno(novoAluno.getNumeroMatriculaAluno());
		 * 
		 * return novoAlunoDTO;
		 */
	}

	// MEU JEITO DE SALVAR UM ALUNODTO -> ALUNO
	public Aluno saveMeuAlunoDto(AlunoResumidoDTO alunoResumidoDto) {

		Aluno aluno = new Aluno();
		aluno.setNome(alunoResumidoDto.getNome());
		aluno.setCPF(alunoResumidoDto.getCPF());

		List<Emprestimo> emprestimos = new ArrayList<>();

		for (EmprestimoResumidoDTO EmprestimoRes : alunoResumidoDto.getListaEmprestimoResDto()) {
			Emprestimo emprestimo = new Emprestimo();
			emprestimo.setDataEmprestimo(EmprestimoRes.getDataEmprestimo());
			emprestimo.setDataEntrega(EmprestimoRes.getDataEntrega());

			Livro livro = new Livro();
			livro.setNomeLivro(EmprestimoRes.getLivroResumidoDTO().getNomeLivro());
			livro.setNomeAutor(EmprestimoRes.getLivroResumidoDTO().getNomeAutor());

			emprestimo.setLivro(livro);
			emprestimos.add(emprestimo);
		}
		aluno.setEmprestimos(emprestimos);
		

		return alunoRepository.save(aluno);
	}

	// Update aluno set nome = "Alexandro" where numeromatriculaaluno = 10;
	// Preciso ter cuidado com os dados da instancia aluno quando for atualizar um
	// aluno.
	public Aluno updateAluno(Aluno aluno, Integer id) {
		return alunoRepository.save(aluno);
	}

	// Delete from aluno where numeromatriculaaluno = 10 ;
	public Boolean deleteAluno(Integer id) {
		alunoRepository.deleteById(id);
		Aluno alunoDeletado = alunoRepository.findById(id).orElse(null);
		if (alunoDeletado == null) {
			return true;
		} else {
			return false;
		}

	}

}
