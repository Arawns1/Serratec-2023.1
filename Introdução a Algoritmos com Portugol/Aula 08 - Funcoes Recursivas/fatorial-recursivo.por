programa
{
	
	funcao inicio()
	{
		inteiro numero, fator, resultado = 1
		escreva("Digite um numero: ")
		leia(numero)
		
		para(fator=1; fator <= numero; fator++){
			resultado = resultado * fator
			
		}
		escreva("O fatorial de ", numero, " é: ", resultado)
		
		escreva("\nO fatorial de ",numero, " usando recursão é: ", fatorial(numero))
	}

	funcao inteiro fatorial(inteiro num)
	{
		inteiro resultado
		se (num <= 1) 
		{
			retorne 1
		}
		senao
		{
			resultado = fatorial(num-1)*num
			retorne resultado
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 269; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */