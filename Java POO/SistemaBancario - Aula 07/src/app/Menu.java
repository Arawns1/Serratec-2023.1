package app;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import accounts.Conta;

public class Menu {

	public static void Inicial(Conta conta) {
		Scanner sc = new Scanner(System.in);

		Date data = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

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
		int opcao = sc.nextInt();

		switch (opcao) {
		case 1:
			System.out.print("Digite o valor a ser sacado: ");
			double valorSaque = sc.nextDouble();
			try {
				conta.sacar(valorSaque);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			Inicial(conta);
			break;
		case 2:
			System.out.print("Digite o valor a ser depositado: ");
			double valorDeposito = sc.nextDouble();
			try {
				conta.depositar(valorDeposito);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			Inicial(conta);
			break;
		case 3:
			System.out.println("Digite o valor a ser transferido: ");
			// double valorTransferencia = sc.nextDouble();
			// conta.transferir(conta, valorTransferencia);
			break;
		case 4:
			break;
		default:
			System.out.println("Opção inválida!");
			Inicial(conta);
			break;
		}

	}
}
