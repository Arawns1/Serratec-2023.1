package App;

import relatorios.FolhaPagamento;
import workers.Assistente;
import workers.Diretor;
import workers.Funcionario;
import workers.Gerente;

public class PessoasMain {

	public static void main(String[] args) {
		Funcionario f;
		/*
		 * f = new Funcionario(); // salario * 0.1 f.setSalario(1000);
		 * System.out.println(f.getBonificacao());
		 * 
		 * f = new Assistente(); // (salario * 0.1) + salario * 0.05 f.setSalario(1000);
		 * System.out.println(f.getBonificacao());
		 * 
		 * f = new Gerente(); // (salario * 0.1 + salario * 0.05 ) + salario * 0.15
		 * f.setSalario(1000); System.out.println(f.getBonificacao());
		 */
		f = new Diretor(); // (salario * 0.1 + salario * 0.05 + salario * 0.15 ) + salario * 0.10 = 400
		f.setSalario(4000);
		System.out.println(f.getBonificacao());
		
		FolhaPagamento fp = new FolhaPagamento();
		System.out.println(fp.calculaFolhaPagamento(f));
		System.out.println(f.getClass().getSimpleName());
	}

}
