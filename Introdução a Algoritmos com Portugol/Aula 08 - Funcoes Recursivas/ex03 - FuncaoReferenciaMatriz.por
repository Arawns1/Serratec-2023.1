programa
{
	
	funcao inicio()
	{
		cadeia carros[3][3] = {{"KIO-0998", "FUSCA", "Sim"},
						   {"JIO-1289","FOX","Sim"},
						   {"UOT-2390","HB20","Não"}}
	
		alterarDados(carros)
	}
	

	funcao alterarDados(cadeia matriz[][])
	{
		matriz[2][2] = "Sim"
		exibirCarros(matriz)
	}
	
	funcao exibirCarros(cadeia matriz[][])
	{
		para(inteiro linha=0; linha < 3; linha++){
			para(inteiro coluna=0; coluna < 3; coluna++){
				escreva(matriz[linha][coluna]," ")
			}
			escreva("\n")
		}
	}
	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 457; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */