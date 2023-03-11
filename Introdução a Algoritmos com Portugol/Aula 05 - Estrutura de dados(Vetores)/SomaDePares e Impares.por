/*
 * 
 * Faça um algoritmo com um vetor com 8 numeros inteiros.
 * Exiba a soma de todos os números e também quantidade de números pares e ímpares?
 * 
 */

programa
{
	
	funcao inicio()
	{
		inteiro nums[8]
		inteiro soma=0, pares=0, impares=0

		para(inteiro i=0; i < 8; i++){
			escreva("Digite um valor: ")
			leia(nums[i])

			soma += nums[i]

			se(nums[i]%2 == 0) pares++
			senao impares++


		}

		
		escreva("A soma é: ", soma, "\n")
		escreva("Há,", pares, " números pares\n")
		escreva("Há,", impares, " números pares")
	
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 251; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */