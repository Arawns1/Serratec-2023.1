package workers;

public class Funcionario {
	protected String nome;
	protected String CPF;
	protected double salario;
	protected int matricula;
	protected static int totalDeFuncionarios;

	public Funcionario(String nome, String CPF, double salario, int matricula) {
		this.nome = nome;
		this.CPF = CPF;
		this.matricula = matricula;
		this.salario = salario;
		totalDeFuncionarios++;
	}

	public Funcionario() {
		totalDeFuncionarios++;
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

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public int getMatricula() {
		return matricula;
	}

	@Override
	public String toString() {
		return "Funcionario [name=" + nome + ", CPF=" + CPF + ", salario=" + salario + "]";
	}

}
