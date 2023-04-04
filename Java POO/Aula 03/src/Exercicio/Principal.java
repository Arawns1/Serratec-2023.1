package Exercicio;

public class Principal {

	public static void main(String[] args) {
		
		BalancoPatrimonial TRI = new BalancoPatrimonial(10, 10, 10);
		System.out.println("O total de gastos do primeiro trimestre foi de: R$" + TRI.somarGastos());
		
		BalancoPatrimonial SEM = new BalancoPatrimonial(10, 10, 10, 10, 10, 10, 10);
		System.out.println("O total de gastos do primeiro semestre + julho foi de R$ " + SEM.somarGastos());
		
	}

}
