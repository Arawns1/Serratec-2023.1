package accounts;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ContaPoupanca extends Conta {

	protected double rendimento;

	public ContaPoupanca() {
	}

	public ContaPoupanca(String titular, int agencia, double saldo, double rendimento) {
		super(titular, agencia, saldo);
		this.tipo = "Poupança";
		this.rendimento = rendimento / 100;
	}

	public void renderSaldo() {
		this.saldo = this.saldo * (1.0 + rendimento);
	}

	public double getRendimento() {
		return rendimento;
	}

	public void setRendimento(double rendimento) {
		this.rendimento = rendimento;
	}

	@Override
	public String toString() {
		return "ContaPoupanca [rendimento=" + rendimento*100 + "% , titular=" + titular + ", tipo=" + tipo + ", numero="
				+ numero + ", agencia=" + agencia + ", saldo=" + saldo + "]";
	}

	@Override
	public void imprimeExtrato() {
		System.out.println("### Extrato da Conta Poupança ###");
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date date = new Date();
		System.out.println("Titular " + this.getTitular());
		System.out.println("Data: " + sdf.format(date));
	}



}
