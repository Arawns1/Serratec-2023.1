/*
 * Leia 5 pessoas, exiba a maior idade e a menor idade 
 * 
 * 
 */


programa
{
	
	funcao inicio()
	{
		inteiro idades[5], maiorIdade = 0 ,menorIdade = 999
		
		para(inteiro i = 0; i<5; i++)
		{
			escreva("Sua idade: ")
			leia(idades[i])
			se (idades[i] > maiorIdade)
			{
				maiorIdade = idades[i]
			}
			se (idades[i] < menorIdade)
			{
				menorIdade = idades[i]
			}
		}
		escreva("Maior idade:", maiorIdade,"\n")
		escreva("Menor Idade:", menorIdade)

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 427; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */