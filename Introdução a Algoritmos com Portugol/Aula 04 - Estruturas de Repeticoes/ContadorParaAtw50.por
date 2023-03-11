


programa
{
	inclua biblioteca Util --> u
	inclua biblioteca Teclado --> t
	
	
	funcao inicio()
	{
		para(inteiro i=0; i < 100; i++){
			escreva(i, "\n")
			u.aguarde(1000)
			se((t.tecla_pressionada(t.TECLA_SETA_DIREITA) == verdadeiro)){
				pare
		}
			
		}
	}

	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 253; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */