package accounts;

public class Conta {

	protected String titular;
	protected int numero;
	protected int agencia;
	protected double saldo; 
	protected String tipo;
	protected static int totalDeContas;
	
	public Conta()
	{
		
	};
	
	public Conta(String titular, int agencia, double saldo, String tipo) {
		super();
		this.titular = titular;
		this.numero = totalDeContas;
		this.agencia = agencia;
		this.saldo = saldo;
		this.tipo = tipo;
		Conta.totalDeContas++;
	}
	
	public Conta(String titular, int agencia, double saldo) {
		super();
		this.titular = titular;
		this.numero = totalDeContas;
		this.agencia = agencia;
		this.saldo = saldo;
		Conta.totalDeContas++;
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
		
	public static int getTotalDeContas() {
		return totalDeContas;
	}

	public static void setTotalDeContas(int totalDeContas) {
		Conta.totalDeContas = totalDeContas;
	}

	public double getSaldo() {
		return saldo;
	}
	
	

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

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	@Override
	public String toString() {
		return "Conta [titular=" + titular + ", numero=" + numero + ", agencia=" + agencia + ", saldo=" + saldo
				+ ", tipo=" + tipo + "]";
	}
	
	

	
}
