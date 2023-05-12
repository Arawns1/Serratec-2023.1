package com.residencia.biblioteca.entities;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "emprestimos")
public class Emprestimo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "codigo_emprestimo")
	private Integer codigoEmprestimo;
	
//	private Integer codigoLivro;
	
	@Column(name = "data_emprestimo")
	private Date dataEmprestimo;
	
	@Column(name = "data_entrega")
	private Date dataEntrega;
	
	@Column(name = "valor_emprestimo")
	private BigDecimal valorEmprestimo;
	
	//coluna do emprestimo references coluna do aluno
	@ManyToOne
	@JoinColumn(name = "numero_matricula_aluno",
				referencedColumnName = "numero_matricula_aluno")
	private Aluno aluno;

	
	@ManyToOne
	@JoinColumn(name = "codigo_livro",
	referencedColumnName = "codigo_livro")
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
