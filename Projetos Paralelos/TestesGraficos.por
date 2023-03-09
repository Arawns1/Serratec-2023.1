programa
{
	inclua biblioteca Graficos --> g
	inclua biblioteca Teclado --> t
	inclua biblioteca Util --> u

	
	inteiro ALTURA_JANELA = 600
	inteiro LARGURA_JANELA = 600

	

	
	funcao inicio()
	{
		
		
		montarJanela()
		enquanto(verdadeiro)
		{
			pintarTela()
			desenharPainel()	
			g.renderizar()
		}
		
	}


	funcao montarJanela(){
		g.iniciar_modo_grafico(verdadeiro)
		g.definir_dimensoes_janela(LARGURA_JANELA, ALTURA_JANELA)
		g.definir_titulo_janela("Teste")
		
	
		
		
		}
		
	funcao pintarTela(){
		g.definir_cor(g.COR_BRANCO)
		g.limpar()
		}
	funcao desenharPainel(){
		
		g.definir_cor(g.COR_PRETO)
		g.definir_tamanho_texto(20.0)

		
		
		}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 173; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */