package App;
import accounts.Conta;
import accounts.ContaCorrente;
import accounts.ContaCorrenteEspecial;
import accounts.ContaPoupanca;
import accounts.ContaPoupancaEspecial;

public class Principal {

public static void main(String[] args) {
		
		System.out.println("~~~Sistema bancário~~~");
	/*
		Conta aluno = new Conta("Gabriel", 1, 10, 1000, "Corrente");
		Conta professor = new Conta("Marcelo", 3, 11, 1000, "Corrente");

		professor.depositar(200);
		
		// Transfere da conta Aluno para o professor o valor de 200
		aluno.transferir(professor, 200);
		
		System.out.println(professor);
		System.out.println(aluno);
		
		System.out.println("O total de contas é: " + Conta.getTotalDeContas());
		
		System.out.println("~~ Gerencia ~~ ");
		Gerente g1 = new Gerente("Gabriel","123213", 1000, 1234, 1923921);
		g1.autentica(1023);
		System.out.println(g1);*/
		
		//nome, agencia, conta, saldo, rendimento%
		ContaPoupanca MinhaCP = new ContaPoupanca("Gabriel", 1234, 1000, 10);
		ContaCorrente MinhaCC = new ContaCorrente("Rodolpho",  1239, 9999, 100);
		ContaPoupancaEspecial MinhaPE = new ContaPoupancaEspecial("Vitor",  1033, 900, 10);
		ContaCorrenteEspecial MinhaCE = new ContaCorrenteEspecial("Maria",  1031, 1000, 2000, 100);
		ContaCorrenteEspecial MinhaCE2 = new ContaCorrenteEspecial("Tamirys",  1032, 120, 100, 50);
		System.out.println(MinhaCP);
		System.out.println(MinhaCC);
		System.out.println(MinhaPE);
		System.out.println(MinhaCE);
		System.out.println(MinhaCE2);
		//cp.renderSaldo();
		//System.out.println(cp);
	}

}
