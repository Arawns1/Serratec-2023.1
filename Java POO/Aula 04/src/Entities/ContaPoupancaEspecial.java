package Entities;

public class ContaPoupancaEspecial extends ContaPoupanca{
	private String nomeCartao;
	private int numeroCartao;
	private static int totalCartao;
	
	public ContaPoupancaEspecial(String titular, int numero, int agencia, double saldo, double rendimento) {
		super(titular, numero, agencia, saldo, rendimento);
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
		return "ContaPoupancaEspecial [numeroCartao=" + numeroCartao + ", nomeCartao=" + nomeCartao + ", rendimento="
				+ rendimento + "]";
	}
}
