package Exercicio;

public class BalancoPatrimonial {
		private double gastosJaneiro;
		private double gastosFevereiro;
		private double gastosMarco;
		private double gastosAbril;
		private double gastosMaio;
		private double gastosJunho;
		private double gastosJulho;
	
		public BalancoPatrimonial() {
			System.out.println("Objeto criado com sucesso!");
		}

		public BalancoPatrimonial(double Janeiro, double Fevereiro, double Marco) {
			System.out.println("Objeto criado com sucesso!");
			this.gastosJaneiro = Janeiro;
			this.gastosFevereiro = Fevereiro;
			this.gastosMarco = Marco;
		}
		
		public BalancoPatrimonial(double gastosJaneiro, double gastosFevereiro, double gastosMarco, double gastosAbril,
								  double gastosMaio, double gastosJunho, double gastosJulho)
		{
			System.out.println("Objeto criado com sucesso!");
			this.gastosJaneiro = gastosJaneiro;
			this.gastosFevereiro = gastosFevereiro;
			this.gastosMarco = gastosMarco;
			this.gastosAbril = gastosAbril;
			this.gastosMaio = gastosMaio;
			this.gastosJunho = gastosJunho;
			this.gastosJulho = gastosJulho;
		}

		
		public double somarGastos() {
			double totalPeriodo;
			totalPeriodo = this.gastosJaneiro + this.gastosFevereiro + this.gastosMarco+this.gastosAbril+this.gastosMaio+this.gastosJunho+this.gastosJulho;
			return totalPeriodo;
		}

		
}
