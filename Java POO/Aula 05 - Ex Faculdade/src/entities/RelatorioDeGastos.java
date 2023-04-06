package entities;



public class RelatorioDeGastos{
	
	public static void calculaGastos(Empregado... empregados)
	{
		double gastosTotais = 0;
		
		System.out.println("=".repeat(40));
		System.out.println("\tRelatório de Gastos");
		System.out.println("=".repeat(40));
		
		for (Empregado emp : empregados) 
		  {
		    System.out.println("-> Gastos de "+ emp.getNome() + ": R$"+ emp.getGastos());
		    gastosTotais += emp.getGastos();
		  }
		
		System.out.println(" ++ Gastos totais: " + gastosTotais + " ++");
	}
}
