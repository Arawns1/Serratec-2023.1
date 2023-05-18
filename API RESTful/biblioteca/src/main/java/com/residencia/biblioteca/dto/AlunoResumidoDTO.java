
package com.residencia.biblioteca.dto;

import java.util.List;

public class AlunoResumidoDTO { 
	  private String nome; 
	  private String CPF;
	  private List<EmprestimoResumidoDTO> listaEmprestimoResDto;
	  
	public AlunoResumidoDTO() {
	}
	  
	public AlunoResumidoDTO(String nome, String cPF) {
		super();
		this.nome = nome;
		CPF = cPF;
	}
	
	public AlunoResumidoDTO(String nome, String cPF, List<EmprestimoResumidoDTO> listaEmprestimoResDto) {
		super();
		this.nome = nome;
		CPF = cPF;
		this.listaEmprestimoResDto = listaEmprestimoResDto;
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

	public List<EmprestimoResumidoDTO> getListaEmprestimoResDto() {
		return listaEmprestimoResDto;
	}

	public void setListaEmprestimoResDto(List<EmprestimoResumidoDTO> listaEmprestimoResDto) {
		this.listaEmprestimoResDto = listaEmprestimoResDto;
	}
	 
  }
 