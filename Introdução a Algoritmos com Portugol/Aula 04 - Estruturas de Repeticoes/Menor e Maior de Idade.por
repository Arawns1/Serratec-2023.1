// Leai a idade de uma determinado numero de pessoas e diga quantas são de maior e quantas são de menor

programa
{
	
	funcao inicio()
	{	
		inteiro num_pessoas, idade
		inteiro maiorIdade = 0
		inteiro menorIdade = 0
		escreva("Quantas pessoas a serem analisadas? ")
		leia(num_pessoas)

		para(inteiro i = 0; i < num_pessoas; i++) //comparar com o valor de pessoas a serem lidas 
										 // e parará quando i = numero de pessoas a serem lidas
		{
			escreva("Digite sua idade: ")
			leia(idade)	
			se(idade >= 18)
			{
				maiorIdade++	
			}
			senao
			{
				menorIdade++
			}
			
			
		}

	escreva("Há ", maiorIdade, " pessoas maiores de idade e ", menorIdade, " pessoas menores de idade")

		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 292; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */