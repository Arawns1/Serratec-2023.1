package entities;

public class Empregado {
	
	protected String nome;
	protected double salario;

	public Empregado(String nome, double salario) {
		super();
		this.nome = nome;
		this.salario = salario;
	}

	public double getGastos() {
		return this.salario;
	};

	public String getInfo()
	{
		return "Empregado [nome=" + nome + ", salario=" + salario + "]";
	};


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
}
