package accounts.corrente;

import accounts.Conta;

public class ContaCorrente extends Conta {

	private double tarifa;
	private double limiteSaque;

	public ContaCorrente(String titular, int numero, int agencia, double saldo, String tipo, double tarifa,
			double limite) {
		super(titular, numero, agencia, saldo, tipo);
		this.tarifa = tarifa;
		this.limiteSaque = limite;
	}

	public ContaCorrente() {
	}

	public double getTarifa() {
		return tarifa;
	}

	public void setTarifa(double tarifa) {
		this.tarifa = tarifa;
	}

	public double getLimite() {
		return limiteSaque;
	}

	public void setLimite(double limite) {
		this.limiteSaque = limite;
	}

	@Override
	public String toString() {
		return "ContaCorrente [tarifa=" + tarifa + ", limite=" + limiteSaque + ", titular=" + titular + ", numero=" + numero
				+ ", agencia=" + agencia + ", saldo=" + saldo + ", tipo=" + tipo + "]";
	}
}
