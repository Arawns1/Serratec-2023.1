
  package com.residencia.biblioteca.dto;

import com.residencia.biblioteca.entities.Aluno;

public class AlunoResumidoDTO { 
	  private String nome; 
	  private String CPF;
	  
	public AlunoResumidoDTO() {
	}
	  
	public AlunoResumidoDTO(String nome, String cPF) {
		super();
		this.nome = nome;
		CPF = cPF;
	}
	
	public AlunoResumidoDTO(Aluno aluno) {
		super();
		this.nome = aluno.getNome();
		CPF = aluno.getCPF();
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCPF() {
		return CPF;
	}
	public void setCPF(String cPF) {
		CPF = cPF;
	}
	  
  }
 