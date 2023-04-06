package workers;

public class Diretor extends Gerente {


	public Diretor() {
	}


	public Diretor(String nome, String CPF, double salario, int matricula, int senha ) {
		super(nome, CPF, salario, matricula, senha);
	}


	public void getTotalFuncionarios() {
		System.out.println("O número total de funcionários é: " + Funcionario.totalDeFuncionarios);
	}
	
	@Override
	public double getBonificacao() {
		return super.getBonificacao() + (this.getSalario() * 0.10);
	}


	@Override
	public String toString() {
		return "Diretor [senha=" + senha + ", nome=" + nome + ", CPF=" + CPF + ", salario=" + salario + ", matricula="
				+ matricula + "]";
	}

}
