package Aula02;

public class Main { 
//Deixando a minha mensagem
	public static void main(String[] args) {
		//operacoesSimples();
		//Prioridades(); 
		//divisoesInteiras();
		//potenciaRaiz();
		//trocadeVariaveis();
		AnosBissextos();
	}
	
	public static void operacoesSimples() {
		int a = 3;
		int b = 4;
		
		int soma;
		int sub;
		int mult;
		double div;
				
		soma = a + b; 
		sub  = a - b; 
		mult = a * b;
		div  = (double) a /(double) b; 

		System.out.println("\nA soma dos números é igual a: " + soma);		
		System.out.println("\nA subtração dos números é igual a: " + sub); 		
		System.out.println("\nA multiplicação dos números é igual a: " + mult); 	
		System.out.println("\nA divisão dos números é igual a: " + div); 
	}
	
	public static void Prioridades() {
	
		double resultado;

		resultado = 5 + 4 * 2;
			System.out.println("Operação: 5 + 4 * 2 = " + resultado); //13,0

		resultado = (5 + 4) * 2;
			System.out.println("Operação: (5 + 4) * 2 = " + resultado);
	
		resultado = 1 + 2 / 3.0 * 4;
			System.out.println("Operação: 1 + 2 / 3 * 4 = " + String.format("%.2f", resultado));  //3,6

		resultado = (1 + 2) / (3.0 * 4);
			System.out.println("Operação: (1 + 2) / (3 * 4) = " + resultado );//0,25
}

	public static void divisoesInteiras() {
	
		int metade_inteira;
		int resto;
		int valor = 10;
		
		metade_inteira = valor / 2;
		resto = valor % 3;
		
			System.out.println("A metade inteira do numero é: " + metade_inteira);
			System.out.println("O resto (mod) da divisão por 3 é: " + resto);
	}
	
	public static void potenciaRaiz() {
		int valor = 12;
		
		int total = 1;
		int expoente = 10;
		
		double raiz_quadrada;
		
		for (int i = 0; i < expoente; i++) {
			total = valor * total;   //total = 2 - 4 - 8
		}
		
		raiz_quadrada = Math.sqrt(valor);
		
		
			System.out.println("O número ao cubo é: " + total);
			System.out.println("A raiz quadrada do número é: " + raiz_quadrada);
	}

	//-----------------------------------------algoritmos e sequencias------------------------------------------------

	public static void trocadeVariaveis() {
		int a = 69;
		int b = 96;
		int aux = 666999;

		System.out.println("A = " + a + "; B = " + b);
		
		aux = a; // 69
		a = b; // 96
		b = aux; // 69
		
		System.out.println("A = " + a + "; B = " + b);
	}

	public static void Maioridade() {
		int idade = 17, faltam;
		
		faltam = 18 - idade;
		
		if(faltam > 0) {
			System.out.println("Faltam " + faltam + " para a maioridade");	
		}
		else {
			System.out.println("Você atingiu a maioridade!!!!");
		}	
	}
	

	public static void MediaAltura() {
		double alt1, alt2, alt3, media;
		
		alt1 = 1.80;
		alt2 = 1.70;
		alt3 = 1.50;
		
		media = (alt1 + alt2 + alt3) / 3;
		
		System.out.println("A media das alturas será igual à: " + String.format("%.2f", media));
	}
	
	
	public static void ProdutoTotal() {
		
		final double v1 = 1.5, 
					 v2 = 1.6, 
					 v3 = 1.7;
		
		int p1 = 10, p2 = 20, p3 = 30;
		
		double total;
		
		total = (v1*p1) + (v2*p2) + (v3*p3);
		
		System.out.println("O total será de " + total);
	}
	
	
	public static void AnosBissextos() {
		int anoAtual = 2023;
		int quantidade;
		
		quantidade = anoAtual / 4;
		
		System.out.println("Quantidade de anos bissextos: " + quantidade);
	}
}

