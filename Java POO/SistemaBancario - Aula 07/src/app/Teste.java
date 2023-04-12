package app;

import java.util.HashMap;
import java.util.Map;

import accounts.Conta;
import accounts.corrente.ContaCorrente;
import accounts.poupanca.ContaPoupanca;
import people.Cliente;

public class Teste {

	public static void main(String[] args) {
		ContaCorrente c1 = new ContaCorrente();
		try {
			c1.depositar(10000);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Conta c2 = new ContaPoupanca();
		try {
			c2.depositar(3000);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Cliente cli = new Cliente("Gabriel", "Damico","12", "123321", "gabri!@gmail.com", 1234);
		Cliente cli2 = new Cliente("Gabriel", "Damico","23", "123321", "gabri!@gmail.com", 1234);
		Cliente cli3 = new Cliente("Gabriel", "Damico","341", "123321", "gabri!@gmail.com", 1234);
		Cliente cli4 = new Cliente("Gabriel", "Damico","4123", "123321", "gabri!@gmail.com", 1234);
		Cliente cli5 = new Cliente("Gabriel", "Damico","5312", "123321", "gabri!@gmail.com", 1234);
		
		
		
		// cria o mapa
		
		
		Map<String, Integer> a = new HashMap<>();
		a.put("12548358749", 1234);
		
		
		Map<String, Cliente> mapaDeContas = new HashMap<>(); //
		// adiciona duas chaves e seus respectivos valores
		mapaDeContas.put("12548358739", cli);

		//mapaDeContas.put("gerente", c2);
		String CPF = "12548358739";
		int senha = 1234;
		if(mapaDeContas.get(CPF) != null && mapaDeContas.get(CPF).getSenha() == senha) {
			System.out.println("Acesso permitido");
			System.out.println(cli);
		}
		else {
			System.out.println("Acesso negado!");
		}
		
		// qual a conta do diretor? (sem casting!)
		//ContaCorrente contaDoDiretor = mapaDeContas.get("gerente");
		//System.out.println(contaDoDiretor.getSaldo());

	}

}
