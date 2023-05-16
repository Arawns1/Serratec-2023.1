package com.residencia.biblioteca.entities;


import java.math.BigDecimal;
import java.util.Date;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
/*
@JsonIdentityInfo(
		generator = ObjectIdGenerators.PropertyGenerator.class,
		property = "codigoEmprestimo"
		)*/
@Entity
@Table(name = "emprestimo")
public class Emprestimo{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "codigoemprestimo")
	private Integer codigoEmprestimo;
	
//	private Integer codigoLivro;
	
	@Column(name = "dataemprestimo")
	private Date dataEmprestimo;
	
	@Column(name = "dataentrega")
	private Date dataEntrega;
	
	@Column(name = "valoremprestimo")
	private BigDecimal valorEmprestimo;
	
	//@JsonBackReference
	//coluna do emprestimo references coluna do aluno
	@ManyToOne
	@JoinColumn(name = "numeromatriculaaluno",
				referencedColumnName = "numeromatriculaaluno")
	private Aluno aluno;
	
	//@JsonBackReference
	@ManyToOne
	@JoinColumn(name = "codigolivro",
	referencedColumnName = "codigolivro")
	//Um emprestimo possui vários livros.
	private Livro livro;
	
	
	public Integer getCodigoEmprestimo() {
		return codigoEmprestimo;
	}

	public void setCodigoEmprestimo(Integer codigoEmprestimo) {
		this.codigoEmprestimo = codigoEmprestimo;
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

	public BigDecimal getValorEmprestimo() {
		return valorEmprestimo;
	}

	public void setValorEmprestimo(BigDecimal valorEmprestimo) {
		this.valorEmprestimo = valorEmprestimo;
	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	public Livro getLivro() {
		return livro;
	}

	public void setLivro(Livro livro) {
		this.livro = livro;
	}

	@Override
	public int hashCode() {
		return Objects.hash(codigoEmprestimo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Emprestimo other = (Emprestimo) obj;
		return Objects.equals(codigoEmprestimo, other.codigoEmprestimo);
	}
	
	
}
