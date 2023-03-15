programa
{
	// PILHA - FIRST IM, FIRST OUT
	// FILA - FIRST IN, LAST OUT
	funcao inicio()
	{
		inteiro numero

		escreva("Numero: ")
		leia(numero)
		escreva("Resultado: " + somarNumAnteriores(numero))
		
	}


	funcao inteiro somarNumAnteriores(inteiro num)
	{
		inteiro resultado

		//Condição de parada/saida
		se (num <= 1) //ultima execução
		{
			retorne 1
		}
		senao
		{
			//recursividade
			resultado = somarNumAnteriores(num-1) + num
			retorne resultado
		}
		
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 215; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {resultado, 18, 10, 9}-{num, 16, 43, 3};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */