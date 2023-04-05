package workers;

public class Diretor extends Funcionario {

	private int senha;

	public Diretor() {
	}

	public Diretor(String nome, String CPF, double salario, int matricula, int senha) {
		super(nome, CPF, salario, matricula);
		this.senha = senha;
	}

	public int getSenha() {
		return senha;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}

	public void getTotalFuncionarios() {
		System.out.println("O número total de funcionários é: " + Funcionario.totalDeFuncionarios);
	}

	@Override
	public String toString() {
		return "Diretor [senha=" + senha + ", nome=" + nome + ", CPF=" + CPF + ", salario=" + salario + ", matricula="
				+ matricula + "]";
	}

}
