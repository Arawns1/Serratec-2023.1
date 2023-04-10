package app;

import accounts.Conta;
import accounts.corrente.ContaCorrente;
import accounts.poupanca.ContaPoupancaEspecial;
import people.workers.Diretor;
import people.workers.Funcionario;
import people.workers.Gerente;
import reports.FolhaPagamento;

public class SistemaPrincipal {

	public static void main(String[] args) {
		// Criando contas
		
		Conta CC = new ContaCorrente("Pedro", 10, 1203, 100, "Corrente", 1.0, 300);
		Conta CP = new ContaPoupancaEspecial("Henrique", 230, 1030, 1000, "Poupança", 10, 12321312);
		CC.sacar(10);
		CC.depositar(200);
		CC.transferir(CP, 20);
		
		CP.getSaldo();
		CP.imprimeExtrato();
		System.out.println("-".repeat(40));
		System.out.println(CC);
		System.out.println(CP);
		
		//Criando Funcionários do Banco
		
		Funcionario f = new Diretor("Gabriel", "Damico", "12221212", "222222222", "gabriel@gmail.com", 1000.0, 10, 1234);
		
		
		System.out.println(); // pular linha
		System.out.println("---- Visão de QUALQUER funcionário ----");
		
		System.out.println("O cargo de " + f.getNome() + " é: " + f.getCargo());
		System.out.println("O valor da bonificação de " +  f.getNome() + " é: R$" + f.getBonificacao());
		System.out.println("O salário com bonificação de "+ f.getNome() + " é : R$" + FolhaPagamento.calculaFolhaPagamento(f));
		System.out.println("-".repeat(40));
		System.out.println(); // pular linha
		
		// f.autentica() -> não funciona pois a classe Funcionário não possui este método
		
		System.out.println("---- Visão de Gerentes e Diretores ----");
		
		//Como apenas Gerente possui o método autentica, deve-se fazer o casting
		System.out.println(((Gerente)(f)).autentica(1234));	
		
		System.out.println("-".repeat(40));
		System.out.println(); // pular linha
		
		System.out.println("------ Visão de Apenas DIRETORES -------");
		
		// Assim como APENAS Diretores podem ver o número de contas e funcionarios do banco
		System.out.println("O número de contas abertas no banco é: "+ ((Diretor)(f)).getTotalContas());
		System.out.println("O número de funcionários do banco é: " + ((Diretor)(f)).getTotalFuncionarios());
		
		System.out.println("-".repeat(40));
		
		
	}

}
