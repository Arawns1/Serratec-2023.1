programa
{
	
	funcao inicio()
	{
	 /*
		para(inteiro i=20; i > 0; i--){
			escreva("O valor de i é:", i,"\n")
		}*/

		decrementar(20)
	}
	funcao decrementar(inteiro i)
	{	
		se(i == 0) // Condição de parada
		{
			escreva(i)
			
		}
		senao
		{
			escreva("O valor de i é:", i, "\n")
			
			// Decremento
			decrementar(i-1)
		}	
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 294; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */