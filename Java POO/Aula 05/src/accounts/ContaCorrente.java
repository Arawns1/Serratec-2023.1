package accounts;

public class ContaCorrente extends Conta {

	protected double tarifa = 0.1;
	protected double limite;

	public ContaCorrente() {
	}

	public ContaCorrente(String titular, int agencia, double saldo, double limite) {
		super(titular, agencia, saldo);
		this.tipo = "Corrente";
		this.limite = limite;
	}

	public double getTarifa() {
		return tarifa;
	}

	public void setTarifa(double tarifa) {
		this.tarifa = tarifa;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	@Override // Sobrescrever
	public void sacar(double valor) {
		if (this.saldo < valor || this.limite < valor) {
			System.out.println("Saldo ou limite insuficiente! ");
		} else {
			this.saldo -= valor;
			this.saldo -= tarifa;
			System.out.println("Seu novo saldo é: " + this.saldo);
		}

	};

	@Override
	public String toString() {
		return "ContaCorrente [tarifa=" + tarifa + ", limite=" + limite + ", titular=" + titular + ", tipo=" + tipo
				+ ", numero=" + numero + ", agencia=" + agencia + ", saldo=" + saldo + "]";
	}

}
