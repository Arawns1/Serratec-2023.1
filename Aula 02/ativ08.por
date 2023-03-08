/*
 * Criar um algoritmo para ler dois números do tipo inteiro e mostrar se um é multiplo do outro em qualquer ordem de digitação.
 */
programa
{
	
	funcao inicio()
	{
		inteiro n1, n2
		escreva("Digite um valor: ")
		leia(n1)
		escreva("Digite outro valor: ")
		leia(n2)


		se(n1 % n2 == 0 ou n2 % n1 == 0)
		{
			escreva("São múltiplos")
		}
		senao{
			escreva("Não são multiplos")
			}

		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 317; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */