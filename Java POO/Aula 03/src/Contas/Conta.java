package Contas;

public class Conta {

	private String titular;
	private int numero;
	private int agencia;
	private double saldo; 
	private String tipo;
	
	public Conta(String titular, int numero, int agencia, double saldo, String tipo) {
		super();
		this.titular = titular;
		this.numero = numero;
		this.agencia = agencia;
		this.saldo = saldo;
		this.tipo = tipo;
	}
	

	public void sacar(double valor) 
	{
		if(this.saldo < valor) {
			System.out.println("Saldo insuficiente! ");
		}
		else {
			this.saldo -= valor;
			System.out.println("Seu novo saldo é: " + this.saldo);
		}
		
	};
	public void depositar(double valor) 
	{
		this.saldo += valor;
		System.out.println("Seu novo saldo é: "+ this.saldo);
	};
	
	public void transferir(Conta destinatario, double valor) 
	{
	; 	this.saldo -= valor; // Retira o valor da conta de origem
		destinatario.saldo += valor; //Aumenta o saldo da conta destinatario;
		System.out.println("Transferência para " + destinatario.titular + " realizada com sucesso!");
	};
	
	
	public String imprimir() 
	{
		return "Conta [titular=" + titular + ", numero=" + numero + ", agencia=" + agencia + ", saldo=" + saldo
				+ ", tipo=" + tipo + "]";
	}
	
	
	
	public double getSaldo() {
		return saldo;
	}


	@Override
	public String toString() {
		return "Conta [titular=" + titular + ", numero=" + numero + ", agencia=" + agencia + ", saldo=" + saldo
				+ ", tipo=" + tipo + "]";
	}
	
	

	
}
