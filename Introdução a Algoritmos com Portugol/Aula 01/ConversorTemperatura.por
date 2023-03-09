/*6) Escreva um programa que leia a temperatura em Celsius e retorne o valor em Fahrenheit

F = C x 1,8 + 32

Para que você consiga converter de grau Celsius para Fahrenheit, basta multiplicar a temperatura em
graus Celsius por 1,8 e somar 32.

Exemplo:

37º C para Fahrenheit:

F = 37 x 1,8 + 32;

F = 98,6;

37 graus Celsius equivalem a 98,6 graus Fahrenheit.
 * 
 */

programa
{
inclua biblioteca Matematica --> mat

	funcao inicio()
	{
		real Celsius, Fahrenheit
		escreva("Digite a temperatura em Celsius: ")
		leia(Celsius)
		Fahrenheit = (Celsius * 1.8) + 32
		escreva(Celsius, " graus Celsius equivalem a ", mat.arredondar(Fahrenheit, 2), " graus Fahrenheit")
		//37.0 graus Celsius equivalem a 98.60000000000001 graus Fahrenheit
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 421; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */