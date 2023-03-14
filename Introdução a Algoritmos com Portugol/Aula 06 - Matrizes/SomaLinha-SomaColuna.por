programa
{
	
	funcao inicio()
	{
		inteiro soma = 0, somaLinha= 0, somaColuna=0
		inteiro matriz[3][2]
		para(inteiro l=0; l < 3; l++){
			para(inteiro c=0; c < 2; c++){
			escreva("Digite um número:", " ")
			leia (matriz[l][c])

		}
			
		}
		para(inteiro l=0; l < 3; l++){
			para(inteiro c=0; c < 2; c++){
			somaLinha += matriz[l][c]
		}
		escreva("\nTotal da linha",+l+ ": ", somaLinha)
		somaLinha = 0
		}
		para(inteiro c=0; c < 2; c++){
			somaColuna = 0
			
			para(inteiro l=0; l < 3; l++){
			somaColuna += matriz[l][c]
			}
			escreva("\nTotal da coluna",+c+ ": ", somaColuna)			
		}
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 506; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {matriz, 7, 10, 6};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1013; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */