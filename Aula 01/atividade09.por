/*
 * Fazer um algoritmo para ler a distância percorrida em km e o total gasto de combustível, no final deverá
 * ser exibido o consumo médio do carro.
 * 
 */

programa
{
	
	funcao inicio()
	{
		real distPercorrida, combustivelGasto
		escreva("Digite a distância percorrida em km: ")
		leia(distPercorrida)
		escreva("Digite o total de combustivel gasto no trajeto (em Litros): ")
		leia(combustivelGasto)
		escreva("O gasto médio do carro é de: ", distPercorrida/combustivelGasto, " Km/L")
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 506; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */