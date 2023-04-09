package accounts.poupanca;

public class ContaPoupancaEspecial extends ContaPoupanca {
	private double cartaoDebito;

	public ContaPoupancaEspecial(String titular, int numero, int agencia, double saldo, String tipo, double rendimento,
			double cartaoDebito) {
		super(titular, numero, agencia, saldo, tipo, rendimento);
		this.cartaoDebito = cartaoDebito;
	}

	public ContaPoupancaEspecial() {
	}

	public double getCartaoDebito() {
		return cartaoDebito;
	}

	public void setCartaoDebito(double cartaoDebito) {
		this.cartaoDebito = cartaoDebito;
	}

	@Override
	public String toString() {
		return "ContaPoupancaEspecial [cartaoDebito=" + cartaoDebito + ", titular=" + titular + ", numero=" + numero
				+ ", agencia=" + agencia + ", saldo=" + saldo + ", tipo=" + tipo + "]";
	}
}
