package com.residencia.biblioteca.dto;

import java.util.Date;

import com.residencia.biblioteca.entities.Emprestimo;

public class EmprestimoResumidoDTO {
	private Date dataEmprestimo;
	private Date dataEntrega;
	private String nomeLivro;
	
	public EmprestimoResumidoDTO() {
		
	}
	public EmprestimoResumidoDTO(Emprestimo emprestimo) {
		 this.dataEmprestimo = emprestimo.getDataEmprestimo();
		 this.dataEntrega = emprestimo.getDataEntrega();
		 this.nomeLivro = emprestimo.getLivro().getNomeLivro();
	}
	
	public EmprestimoResumidoDTO(Date dataEmprestimo, Date dataEntrega, String nomeLivro) {
		super();
		this.dataEmprestimo = dataEmprestimo;
		this.dataEntrega = dataEntrega;
		this.nomeLivro = nomeLivro;
	}
	public Date getDataEmprestimo() {
		return dataEmprestimo;
	}
	public void setDataEmprestimo(Date dataEmprestimo) {
		this.dataEmprestimo = dataEmprestimo;
	}
	public Date getDataEntrega() {
		return dataEntrega;
	}
	public void setDataEntrega(Date dataEntrega) {
		this.dataEntrega = dataEntrega;
	}
	public String getNomeLivro() {
		return nomeLivro;
	}
	public void setNomeLivro(String nomeLivro) {
		this.nomeLivro = nomeLivro;
	}
	
	
}
