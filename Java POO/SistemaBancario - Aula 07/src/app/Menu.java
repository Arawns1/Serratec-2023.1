package app;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import accounts.Conta;
import people.Cliente;
import people.Pessoa;
import people.workers.Funcionario;
import people.workers.OperadorDeCaixa;

public class Menu {

	private static Map<String, Pessoa> loginInfo = new HashMap<>();

	public static void login() {
		Scanner sc = new Scanner(System.in);

		System.out.println("-".repeat(10) + " Menu Login " + "-".repeat(10));

		System.out.print("Digite seu CPF: ");
		String CPF = sc.nextLine();

		System.out.print("Digite sua senha: ");
		Integer senha = sc.nextInt();

		if (loginInfo.containsKey(CPF)) {

			if (senha.equals((loginInfo.get(CPF).getSenha()))) {
				System.out.println("Acesso permitido! ");
				System.out.println("Redirecionando para o menu de "
						+ loginInfo.get(CPF).getClass().getSimpleName() + " ...");

			} else {
				System.out.println("Senha incorreta");
			}
		} else {
			System.out.println("CPF incorreto!");
		}

	}

	public static void cadastrarFuncionario() {
		Scanner sc = new Scanner(System.in);

		System.out.println("-".repeat(10) + "Menu Cadastro de Funcionario" + "-".repeat(10));

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
		
		System.out.print("Digite o salario: ");
		double salario = sc.nextDouble();
		
		System.out.println("Digite a matricula: ");
		int matricula = sc.nextInt();

		Funcionario f = new OperadorDeCaixa(nome, sobrenome, CPF, telefone, email, senha, salario, matricula);

		if (loginInfo.containsKey(CPF)) {
			System.out.println("CPF já cadastrado!");
		} else {
			Funcionario.addFuncionario(f);
			loginInfo.put(CPF, f);
			System.out.println("Funcionario cadastrado com sucesso!");
		}

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

		Cliente p = new Cliente(null, null, CPF, null, null, senha);
		List<Pessoa> l2 = new ArrayList<>();
		if (loginInfo.containsKey(CPF)) {
			System.out.println("CPF já cadastrado!");
		} else {
			Cliente.addCliente(p);
			loginInfo.put(CPF, p);
			System.out.println("Cliente cadastrado com sucesso!");
		}

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

		} while (opcao != 4);

	}

	public static void mostrarMap() {
		for (String key : loginInfo.keySet()) {
			System.out.println(key + " - " + loginInfo.get(key));
		}
	}
}
