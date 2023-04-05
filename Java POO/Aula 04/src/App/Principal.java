package App;

import accounts.ContaCorrente;
import accounts.ContaCorrenteEspecial;
import accounts.ContaPoupanca;
import accounts.ContaPoupancaEspecial;

public class Principal {

	public static void main(String[] args) {

		System.out.println("~~~Sistema bancário~~~");
		ContaPoupanca MinhaCP = new ContaPoupanca("Gabriel", 1234, 1000, 10);
		ContaCorrente MinhaCC = new ContaCorrente("Rodolpho", 1239, 9999, 100);
		ContaPoupancaEspecial MinhaPE = new ContaPoupancaEspecial("Vitor", 1033, 900, 10);
		ContaCorrenteEspecial MinhaCE = new ContaCorrenteEspecial("Maria", 1031, 1000, 2000, 100);
		ContaCorrenteEspecial MinhaCE2 = new ContaCorrenteEspecial("Tamirys", 1032, 120, 100, 50);
		System.out.println(MinhaCP);
		System.out.println(MinhaCC);
		System.out.println(MinhaPE);
		System.out.println(MinhaCE);
		System.out.println(MinhaCE2);

	}

}
