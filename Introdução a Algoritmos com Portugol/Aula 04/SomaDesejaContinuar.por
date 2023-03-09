/*
 * Fazer um algoritmo para que seja lida uma determinada quantidade de números.  
 * O usuário deverá ser perguntado se deseja continuar (S/s) caso outro caracter for 
 * digitado o programa será finalizado somando o total dos números digitados e exibindo a média.
 */


programa
{
	
	funcao inicio()
	{
		inteiro numero, soma = 0
		inteiro contador = 0
		
		caracter confirmar = 'S'
		

		faca{
			escreva("Digite um valor: ")
			leia(numero)
			soma += numero
			contador++
			
			escreva("Deseja continuar? (S/N) ")
			leia(confirmar)
			
			
			
		}enquanto(confirmar == 'S' ou confirmar == 's')

		escreva("Soma = ", soma, "\n")
		escreva("Media = ", soma/contador)
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 524; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */