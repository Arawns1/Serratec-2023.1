package ex01;

public class BalancoTrimestral {

	public static void main(String[] args) {
		int gastosJaneiro = 15000;
		int gastosFevereiro =23000;
		int gastosMarco = 17000;
		
		int gastosTrimestre = gastosJaneiro+gastosFevereiro+gastosMarco;
		
		System.out.println("O total de gastos do primeiro trimestre foi de: R$" + gastosTrimestre);
	}

}