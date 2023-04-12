package app;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import accounts.Conta;
import people.Cliente;
import people.Pessoa;

public class Menu {

	
	public static void login() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("-".repeat(10) + " Menu Login " + "-".repeat(10));
		
		System.out.print("Digite seu CPF: ");
		String CPF = sc.nextLine();
		
		System.out.print("Digite sua senha: ");
		int senha = sc.nextInt();
		
		/*
		 * if(Cliente.verificaLogin(CPF,senha)) {
		 * System.out.println("Acesso permitido!"); } else {
		 * System.out.println("Acesso negado."); }
		 */
		
	}
	
	public static void cadastrarCliente() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("-".repeat(10) + "Menu Cadastro de Cliente" + "-".repeat(10));
		
		System.out.print("Digite o nome: ");
		String nome = sc.nextLine();
		
		System.out.print("Digite o sobrenome: ");
		String sobrenome = sc.nextLine();
		
		System.out.print("Digite o CPF: (apenas números)");
		String CPF = sc.nextLine();
		
		System.out.print("Digite o telefone: (apenas números)");
		String telefone = sc.nextLine();
		
		System.out.print("Digite o email: ");
		String email = sc.nextLine();
		
		System.out.print("Digite uma senha: ");
		int senha = sc.nextInt();
		
		Cliente.addCliente(new Cliente(nome, sobrenome, CPF, telefone, email, senha));
		System.out.println("Cliente cadastrado com sucesso!");
	}
	
	
	public static void ContaCliente(Conta conta) {
		Scanner sc = new Scanner(System.in);
		Date data = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		int opcao;
		
		do {
			System.out.println("------- Banco G5 -------");
			System.out.println("Olá, " + conta.getTitular() + " seja bem-vindo(a)!");
			System.out.println(sdf.format(data));
			System.out.println("Seu saldo atual é: R$" + conta.getSaldo());

			System.out.println("-".repeat(41));
			System.out.println("|-> 1 - Sacar");
			System.out.println("|-> 2 - Depositar");
			System.out.println("|-> 3 - Tranferir");
			System.out.println("|-> 4 - Sair");
			System.out.println("-".repeat(41));

			System.out.print("Digite uma opção: ");
			opcao = sc.nextInt();
			
			switch (opcao) {
			case 1:
				System.out.print("Digite o valor a ser sacado: ");
				double valorSaque = sc.nextDouble();
				try {
					conta.sacar(valorSaque);
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
				break;
			case 2:
				System.out.print("Digite o valor a ser depositado: ");
				double valorDeposito = sc.nextDouble();
				try {
					conta.depositar(valorDeposito);
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
				break;
			case 3:
				System.out.println("Digite o valor a ser transferido: ");
				// double valorTransferencia = sc.nextDouble();
				// conta.transferir(conta, valorTransferencia);
				break;
			case 4:
				System.out.println("Sessão encerrada!");
				break;
			default:
				System.out.println("Opção inválida!");
				break;
			} 
			
		}while(opcao != 4);
		
	}
}
