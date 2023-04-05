package workers;

public class Gerente extends Funcionario {

	private int senha;
	private int numeroDeFuncionarios;
	
	public Gerente(String nome, String CPF, double salario, int senha, int numeroDeFuncionarios) {
		super(nome, CPF, salario);
		this.senha = senha;
		this.numeroDeFuncionarios = numeroDeFuncionarios;
	}

	public boolean autentica(int senha) 
	{
		if(this.senha == senha)
		{
			System.out.println("Acesso Permitido!");
			return true;
		}
		else
		{
			System.out.println("Acesso negado!");
			return false;
		}
	}

	@Override
	public String toString() {
		return "Gerente [senha=" + senha + ", numeroDeFuncionarios=" + numeroDeFuncionarios + ", nome=" + nome
				+ ", CPF=" + CPF + ", salario=" + salario + "]";
	}

		
}
