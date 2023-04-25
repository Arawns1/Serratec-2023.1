import accounts.Conta;
import accounts.ContaCorrente;
import accounts.ContaPoupanca;

public class Principal {
	
	
	
	
	
	
	public static void main(String[] args) {
		
		final double TAXA_SAQUE = 0.10;
		
		System.out.println(2*TAXA_SAQUE);
		
		Conta.mostrarMatriz();
		Conta.addLinha();
		Conta.addLinha();
		Conta.mostrarMatriz();
	}
}
