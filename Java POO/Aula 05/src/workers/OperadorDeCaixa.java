package workers;

public class OperadorDeCaixa extends Funcionario {
	public OperadorDeCaixa() {}
	public OperadorDeCaixa(String nome, String CPF, double salario, int matricula) {
		super(nome, CPF, salario, matricula);
	}
	@Override
	public double getBonificacao() {
		return super.getBonificacao();
	}
	
	
}
