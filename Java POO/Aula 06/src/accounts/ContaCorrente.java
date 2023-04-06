package accounts;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ContaCorrente extends Conta  {

	protected double tarifa = 0.1;
	protected double limite;

	public ContaCorrente() {
	}

	public ContaCorrente(String titular, int agencia, double saldo, double tarifa, double limite) {
		super(titular, agencia, saldo);
		this.tarifa = tarifa;
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

	@Override
	public String toString() {
		return "ContaCorrente [tarifa=" + tarifa + ", limite=" + limite + ", titular=" + titular + "]";
	}

	@Override
	public void imprimeExtrato() {
		System.out.println("### Extrato da Conta Corrente ###");
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date date = new Date();
		System.out.println("Titular " + this.getTitular());
		System.out.println("Data: " + sdf.format(date));
	}

}
