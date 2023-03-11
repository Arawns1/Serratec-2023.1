programa
{
	inclua biblioteca Tipos
	cadeia  texto
	
	funcao inicio(){
	
		escreva("Digite um valor: ")
		leia(texto)
		verificaDigitacao(texto)
		
	}

	funcao verificaDigitacao(cadeia TextoDigitado)
	{
		
	inteiro valorConvertidoParaInteiro
	logico eInteiro
	
	eInteiro = Tipos.cadeia_e_inteiro(TextoDigitado, 10)

			se(eInteiro)
			{
				valorConvertidoParaInteiro = Tipos.cadeia_para_inteiro(TextoDigitado,10)
				verificaIntervalo(valorConvertidoParaInteiro)			
			}
			senao 
			{
				escreva("Digite um valor valido")
			}
	}

	funcao logico verificaIntervalo(inteiro valor)
	{
		se(valor >= 1 e valor<= 20)
		{
			retorne verdadeiro
		}
		senao
		{
			retorne falso
		}
	}

}


	
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 154; 
 * @DOBRAMENTO-CODIGO = [32];
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */