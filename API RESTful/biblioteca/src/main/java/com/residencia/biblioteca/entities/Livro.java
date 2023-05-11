package com.residencia.biblioteca.entities;

import java.util.Date;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "livro")
public class Livro {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name = "codigo_livro")	private Integer codigoLivro;
	
	@Column(name = "nome_livro")	private String nomeLivro;
	
	@Column(name = "nome_autor")	private String nomeAutor;
	
	@Column(name = "data_lancamento")	private Date dataLancamento;
	
	@Column(name = "codigo_isbn")	private Long codigoISBN;
	
//	@Column(name = "codigo_editora")//	private Integer codigoEditora;

	public Integer getCodigoLivro() {
		return codigoLivro;
	}

	public void setCodigoLivro(Integer codigoLivro) {
		this.codigoLivro = codigoLivro;
	}

	public String getNomeLivro() {
		return nomeLivro;
	}

	public void setNomeLivro(String nomeLivro) {
		this.nomeLivro = nomeLivro;
	}

	public String getNomeAutor() {
		return nomeAutor;
	}

	public void setNomeAutor(String nomeAutor) {
		this.nomeAutor = nomeAutor;
	}

	public Date getDataLancamento() {
		return dataLancamento;
	}

	public void setDataLancamento(Date dataLancamento) {
		this.dataLancamento = dataLancamento;
	}

	public Long getCodigoISBN() {
		return codigoISBN;
	}

	public void setCodigoISBN(Long codigoISBN) {
		this.codigoISBN = codigoISBN;
	}

//	public Integer getCodigoEditora() {
//		return codigoEditora;
//	}
//
//	public void setCodigoEditora(Integer codigoEditora) {
//		this.codigoEditora = codigoEditora;
//	}

	@Override
	public int hashCode() {
		return Objects.hash(codigoLivro);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Livro other = (Livro) obj;
		return Objects.equals(codigoLivro, other.codigoLivro);
	}
	
	
}
