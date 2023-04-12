package people.workers;

public class Gerente extends Assistente {

	public Gerente(String nome, String sobrenome, String cPF, String telefone, String email, int senha, double salario,
			int matricula) {
		super(nome, sobrenome, cPF, telefone, email, senha, salario, matricula);
	}

	/*
	 * public boolean autentica(int senha) { if(this.senha == senha) {
	 * System.out.println("Acesso permitido!"); return true; } else {
	 * System.out.println("Acesso negado!"); return false; } }
	 * 
	 * public void setSenha(int senha) { this.senha = senha; }
	 */

	@Override
	public double getBonificacao() {
		return super.getBonificacao() + (this.getSalario() * 0.15);
	}

	@Override
	public String toString() {
		return "Gerente [salario=" + salario + ", matricula=" + matricula + ", nome=" + nome + ", sobrenome="
				+ sobrenome + ", CPF=" + CPF + ", telefone=" + telefone + ", email=" + email + "]";
	}

}
