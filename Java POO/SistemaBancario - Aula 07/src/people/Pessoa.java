package people;

public abstract class Pessoa {
	protected String nome;
	protected String sobrenome;
	protected String CPF;
	protected String telefone;
	protected String email;
	
	public Pessoa(String nome, String sobrenome, String cPF, String telefone, String email) {
		super();
		this.nome = nome;
		this.sobrenome = sobrenome;
		CPF = cPF;
		this.telefone = telefone;
		this.email = email;
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
	
	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", sobrenome=" + sobrenome + ", CPF=" + CPF + ", telefone=" + telefone
				+ ", email=" + email + "]";
	}
	
}
