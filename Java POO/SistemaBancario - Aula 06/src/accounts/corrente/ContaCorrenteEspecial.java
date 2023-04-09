package accounts.corrente;

public class ContaCorrenteEspecial extends ContaCorrente {
	private double cartaoCredito;
	private double investimento;

	public ContaCorrenteEspecial(String titular, int numero, int agencia, double saldo, String tipo, double tarifa,
			double limite, double cartaoCredito, double investimento) {
		super(titular, numero, agencia, saldo, tipo, tarifa, limite);
		this.cartaoCredito = cartaoCredito;
		this.investimento = investimento;
	}

	public ContaCorrenteEspecial() {
	}

	public double getCartaoCredito() {
		return cartaoCredito;
	}

	public void setCartaoCredito(double cartaoCredito) {
		this.cartaoCredito = cartaoCredito;
	}

	public double getInvestimento() {
		return investimento;
	}

	public void setInvestimento(double investimento) {
		this.investimento = investimento;
	}

	@Override
	public String toString() {
		return "ContaCorrenteEspecial [cartaoCredito=" + cartaoCredito + ", investimento=" + investimento + ", titular="
				+ titular + ", numero=" + numero + ", agencia=" + agencia + ", saldo=" + saldo + ", tipo=" + tipo + "]";
	}

}
