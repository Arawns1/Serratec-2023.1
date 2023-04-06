package workers;

public class Assistente extends Funcionario {
	public Assistente() {
	}

	public Assistente(String nome, String CPF, double salario, int matricula) {
		super(nome, CPF, salario, matricula);
	}

	@Override
	public double getBonificacao() {
		return super.getBonificacao() + this.getSalario() * 0.05;
	}
}
