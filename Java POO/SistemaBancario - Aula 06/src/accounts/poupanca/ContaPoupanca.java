package accounts.poupanca;

import accounts.Conta;

public class ContaPoupanca extends Conta {
	private double rendimento;

	public ContaPoupanca(String titular, int numero, int agencia, double saldo, String tipo, double rendimento) {
		super(titular, numero, agencia, saldo, tipo);
		this.rendimento = rendimento;
	}

	public ContaPoupanca() {
	}

	public double getRendimento() {
		return rendimento;
	}

	public void setRendimento(double rendimento) {
		this.rendimento = rendimento;
	}

	@Override
	public String toString() {
		return "ContaPoupanca [rendimento=" + rendimento + ", titular=" + titular + ", numero=" + numero + ", agencia="
				+ agencia + ", saldo=" + saldo + ", tipo=" + tipo + "]";
	}

}
