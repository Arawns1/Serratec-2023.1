import accounts.Conta;
import accounts.ContaCorrente;
import accounts.ContaPoupanca;

public class Principal {

	public static void main(String[] args) {
		System.out.println("Sistema bancario");
		System.out.println("=".repeat(20));
		Conta conta = new ContaCorrente();
		conta.setTitular("Gabriel");
		conta.imprimeExtrato();
		System.out.println("=".repeat(20));
		
		Conta conta2 = new ContaPoupanca();
		conta2.setTitular("Gabriel2");
		conta2.imprimeExtrato();
	}
}
