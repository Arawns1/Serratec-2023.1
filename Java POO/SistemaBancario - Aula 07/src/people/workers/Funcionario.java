package people.workers;

import java.util.ArrayList;

import people.Pessoa;

public abstract class Funcionario extends Pessoa {

	protected double salario;
	protected int matricula;
	protected static int totalDeFuncionarios;

	public static ArrayList<Funcionario> listaFuncionarios = new ArrayList<Funcionario>();

	/**
	 * Cria uma nova derivação de funcionario
	 * 
	 * @param nome
	 * @param sobrenome
	 * @param CPF
	 * @param telefone
	 * @param email
	 * @param salario
	 * @param matricula
	 */

	public double getBonificacao() {
		return this.salario * 0.1;
	}

	public Funcionario(String nome, String sobrenome, String cPF, String telefone, String email, int senha,
			double salario, int matricula) {
		super(nome, sobrenome, cPF, telefone, email, senha);
		this.salario = salario;
		this.matricula = matricula;
		totalDeFuncionarios++;
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

	public static void addFuncionario(Funcionario func) {
		listaFuncionarios.add(func);
	}

	public static void mostrarFuncionarios() {
		for (Funcionario funcionario : listaFuncionarios) {
			System.out.println(funcionario);
		}
	}

	@Override
	public String toString() {
		return "Funcionario [salario=" + salario + ", matricula=" + matricula + ", nome=" + nome + ", sobrenome="
				+ sobrenome + ", CPF=" + CPF + ", telefone=" + telefone + ", email=" + email + ", senha=" + senha + "]";
	}

}
