package people.workers;

public class Assistente extends Funcionario {

	public Assistente(String nome, String sobrenome, String cPF, String telefone, String email, int senha,
			double salario, int matricula) {
		super(nome, sobrenome, cPF, telefone, email, senha, salario, matricula);
	}

	@Override
	public double getBonificacao() {
		return super.getSalario() * 0.15 + this.getSalario() * 0.05;
	}

	@Override
	public String toString() {
		return "Assistente [salario=" + salario + ", matricula=" + matricula + ", nome=" + nome + ", sobrenome="
				+ sobrenome + ", CPF=" + CPF + ", telefone=" + telefone + ", email=" + email + "]";
	}

}
