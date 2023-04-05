package accounts;

public class ContaCorrenteEspecial extends ContaCorrente{
	private int numeroCartaoCredito;
	private String nomeCartaoCredito;
	private double investimento;
	private static int totalCartaoCredito;
	
	public ContaCorrenteEspecial(String titular, int agencia, double saldo, double limite, double investimento) {
		super(titular, agencia, saldo, limite);
		this.nomeCartaoCredito = titular;
		this.numeroCartaoCredito = ContaCorrenteEspecial.totalCartaoCredito;
		ContaCorrenteEspecial.totalCartaoCredito++;
		this.nomeCartaoCredito = this.titular;
		this.investimento = investimento;
	}

	
	public int getNumeroCartaoCredito() {
		return numeroCartaoCredito;
	}


	public void setNumeroCartaoCredito(int numeroCartaoCredito) {
		this.numeroCartaoCredito = numeroCartaoCredito;
	}


	public String getNomeCartaoCredito() {
		return nomeCartaoCredito;
	}


	public void setNomeCartaoCredito(String nomeCartaoCredito) {
		this.nomeCartaoCredito = nomeCartaoCredito;
	}


	public double getInvestimento() {
		return investimento;
	}


	public void setInvestimento(double investimento) {
		this.investimento = investimento;
	}


	public static int getTotalCartaoCredito() {
		return totalCartaoCredito;
	}


	public static void setTotalCartaoCredito(int totalCartaoCredito) {
		ContaCorrenteEspecial.totalCartaoCredito = totalCartaoCredito;
	}


	@Override
	public String toString() {
		return "ContaCorrenteEspecial [numeroCartaoCredito=" + numeroCartaoCredito + ", nomeCartaoCredito="
				+ nomeCartaoCredito + ", investimento=" + investimento + ", tarifa=" + tarifa + ", limite=" + limite
				+ ", titular=" + titular + ", numero=" + numero + ", agencia=" + agencia + ", saldo=" + saldo
				+ ", tipo=" + tipo + "]";
	}

}
