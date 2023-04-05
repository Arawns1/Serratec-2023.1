package workers;

public class Gerente extends Funcionario {
	private int senha;

	public Gerente() {
	}

	public Gerente(String nome, String CPF, double salario, int matricula, int senha) {
		super(nome, CPF, salario, matricula);
		this.senha = senha;
	}

	public boolean autentica(int senha) {
		if (this.senha == senha) {
			System.out.println("Acesso Permitido!");
			return true;
		} else {
			System.out.println("Acesso negado!");
			return false;
		}
	}

	public int getSenha() {
		return senha;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}

	@Override
	public String toString() {
		return "Gerente [senha=" + senha + ", nome=" + nome + ", CPF=" + CPF + ", salario=" + salario + ", matricula="
				+ matricula + "]";
	}

}
