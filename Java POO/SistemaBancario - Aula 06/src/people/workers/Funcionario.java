package people.workers;

import people.Pessoa;

public abstract class Funcionario extends Pessoa {
	
	protected double salario;
	protected int matricula;
	private static int totalDeFuncionarios;
	
	/**
	 * Cria uma nova derivação de funcionario
	 * @param nome 
	 * @param sobrenome
	 * @param CPF
	 * @param telefone
	 * @param email
	 * @param salario
	 * @param matricula
	 */
	public Funcionario(String nome, String sobrenome, String cPF, String telefone, String email, double salario,
			int matricula) {
		super(nome, sobrenome, cPF, telefone, email);
		this.salario = salario;
		this.matricula = matricula;
		totalDeFuncionarios++;
	}

	public double getBonificacao(){
		return this.salario * 0.1;
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

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	
	public String getCargo() {
		return this.getClass().getSimpleName();
	}
	
	@Override
	public String toString() {
		return "Funcionario [salario=" + salario + ", matricula=" + matricula + ", nome=" + nome + ", sobrenome="
				+ sobrenome + ", CPF=" + CPF + ", telefone=" + telefone + ", email=" + email + "]";
	}

}
