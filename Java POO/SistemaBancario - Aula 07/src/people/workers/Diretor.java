package people.workers;

import accounts.ItotalContas;

public class Diretor extends Gerente implements ItotalContas, ITotalFuncionarios {

	public Diretor(String nome, String sobrenome, String cPF, String telefone, String email, int senha, double salario,
			int matricula) {
		super(nome, sobrenome, cPF, telefone, email, senha, salario, matricula);
	}

	@Override
	public double getBonificacao() {
		return super.getBonificacao() + (this.getSalario() * 0.10);
	}

	public int getTotalFuncionarios() {
		return numFuncionarios;
	}

	public int getTotalContas() {
		return Numcontas;
	}

	@Override
	public String toString() {
		return "Diretor [salario=" + salario + ", matricula=" + matricula + ", nome=" + nome + ", sobrenome="
				+ sobrenome + ", CPF=" + CPF + ", telefone=" + telefone + ", email=" + email + "]";
	}

}
