package people.workers;

public class OperadorDeCaixa extends Funcionario {
	
	public OperadorDeCaixa(String nome, String sobrenome, String cPF, String telefone, String email, double salario,
			int matricula) {
		super(nome, sobrenome, cPF, telefone, email, salario, matricula);
	}

	@Override
	public String toString() {
		return "OperadorDeCaixa [salario=" + salario + ", matricula=" + matricula + ", nome=" + nome + ", sobrenome="
				+ sobrenome + ", CPF=" + CPF + ", telefone=" + telefone + ", email=" + email + "]";
	}

}
