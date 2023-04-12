package people;

import java.util.ArrayList;

import accounts.Conta;

public abstract class Pessoa {
	protected String nome;
	protected String sobrenome;
	protected String CPF;
	protected String telefone;
	protected String email;
	protected int senha;
	
	public static ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();

	public Pessoa(String nome, String sobrenome, String cPF, String telefone, String email, int senha) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.CPF = cPF;
		this.telefone = telefone;
		this.email = email;
		this.senha = senha;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String cPF) {
		CPF = cPF;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getSenha() {
		return senha;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}

	public static void mostrarPessoas() {
		for (Pessoa pessoa : pessoas) {
			System.out.println(pessoa);
		}
	}
	
	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", sobrenome=" + sobrenome + ", CPF=" + CPF + ", telefone=" + telefone
				+ ", email=" + email + ", senha=" + senha + "]";
	}

}
