package Aula02;

public class main {

	public static void main(String[] args) {
	/*	somaDivide();
		
		int num1 = 10;
        int num2 = 5;
        int soma = num1 + num2;
        System.out.printf("A soma de %d e %d é %d.%n", num1, num2, soma);
        */
        char A = 'A';
        char B = 'B';
        
        int soma1 = A + B;
        
        int inteiro = 65;
        char caracter = (char)inteiro;
        
        System.out.println("A soma1 é " + soma1 + " ");
        System.out.println("O valor " + inteiro +" representa o caracter: " + caracter);
        
        
	}
	
	
	public static void somaDivide()
	{
		int numero1 = 2, numero2 = 3;
		int soma = numero1 + numero2;
		double div = (double) numero1 / numero2;
		
		System.out.println("A soma é: "+ soma + " e a divisão é : " + div);
	}
}
