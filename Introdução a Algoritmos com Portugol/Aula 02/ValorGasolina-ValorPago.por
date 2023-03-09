programa
{
	inclua biblioteca Matematica-->mat

	funcao inicio()
	{
		real preco_gasolina, pagamento

		escreva("Digite o valor da gasolina: ") // 1L é preco_gasolina
		leia(preco_gasolina)
		escreva("Quanto foi pago? ") // xl é pagamento
		leia(pagamento)

		escreva("Você abasteceu ", mat.arredondar((pagamento/preco_gasolina),2)," litros de gasolina")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 165; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */