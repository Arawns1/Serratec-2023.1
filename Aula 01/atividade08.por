/*
 * 8) Calcule a área e o preço de um terreno
	area = largura x comprimento
	preço = área x preco do metro quadrado
 */

programa
{
	
	funcao inicio()
	{
		real area, preco, comprimento, largura
		
		escreva("Digite o comprimento do terreno: ")
		leia(comprimento)
		escreva("Digite a largura do terreno: ")
		leia(largura)
		area = largura * comprimento
		escreva("Digite o valor do m²: ")
		leia(preco)
		escreva("O valor do terreno é: R$", area*preco)
		
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 411; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */