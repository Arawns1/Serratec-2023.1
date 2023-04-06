package accounts;

public class ContaPoupancaEspecial extends ContaPoupanca {
	private String nomeCartao;
	private int numeroCartao;
	private static int totalCartao;

	public ContaPoupancaEspecial(String titular, int agencia, double saldo, double rendimento) {
		super(titular, agencia, saldo, rendimento);
		this.nomeCartao = titular;
		this.numeroCartao = ContaPoupancaEspecial.totalCartao;
		ContaPoupancaEspecial.totalCartao++;
	}

	public String getNomeCartao() {
		return nomeCartao;
	}

	public void setNomeCartao(String nomeCartao) {
		this.nomeCartao = nomeCartao;
	}

	public int getNumeroCartao() {
		return numeroCartao;
	}

	public void setNumeroCartao(int numeroCartao) {
		this.numeroCartao = numeroCartao;
	}

	public static int getTotalCartao() {
		return totalCartao;
	}

	public static void setTotalCartao(int totalCartao) {
		ContaPoupancaEspecial.totalCartao = totalCartao;
	}

	@Override
	public String toString() {
		return "ContaPoupancaEspecial [nomeCartao=" + nomeCartao + ", numeroCartao=" + numeroCartao + ", rendimento="
				+ rendimento*100 + "%, titular=" + titular + ", numero=" + numero + ", agencia=" + agencia + ", saldo="
				+ saldo + ", tipo=" + tipo + "]";
	}

}
