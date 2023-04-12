package accounts;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import people.Cliente;

public abstract class Conta implements IConta {
	protected String titular;
	protected int numero;
	protected int agencia;
	protected double saldo;
	protected String tipo;
	protected static int totalDeContas;
	
	
	

	public Conta(String titular, int numero, int agencia, double saldo, String tipo) {
		this.titular = titular;
		this.numero = numero;
		this.agencia = agencia;
		this.saldo = saldo;
		this.tipo = tipo;
		totalDeContas++;
	}

	public Conta() {
		totalDeContas++;
	}

	@Override // Sobrescrever
	public void depositar(double valor) throws Exception {

		if (valor < 0) {
			throw new Exception("Erro de deposito: Valor negativo"); //
		} else {
			this.saldo += valor;
			System.out.println("Depósito realizado com sucesso!");
		}
	}

	@Override
	public void sacar(double valor) throws Exception {

		verificaSaldo(valor);

		this.saldo -= valor;
		System.out.println("Saque realizado com sucesso!");

	}

	private void verificaSaldo(double valor) throws Exception {
		if (this.saldo <= valor) {
			throw new Exception("Erro: Valor maior que o saldo da conta");
		}
	}

	@Override
	public void transferir(Conta destino, double valor) throws Exception {
		verificaSaldo(valor);
		this.saldo -= valor;
		destino.saldo += valor;
		System.out.println("Transferência realizada com sucesso!");
	}

	public void imprimeExtrato() {
		System.out.println("### Extrato da Conta ###");
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/aaaa HH:mm:ss");
		Date date = new Date();
		System.out.println("Saldo: " + this.getSaldo());
		System.out.println("Data: " + sdf.format(date));
	}
	

	// Getters and Setters
	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public double getSaldo() {
		return saldo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Conta [titular=" + titular + ", numero=" + numero + ", agencia=" + agencia + ", saldo=" + saldo
				+ ", tipo=" + tipo + "]";
	}
}
