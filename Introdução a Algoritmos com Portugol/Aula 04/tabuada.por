programa
{
	
	funcao inicio()
	{	
		inteiro n1 
		escreva("Digite um número: ") //Atribuindo um número a variavel n1. Número que será a tabuada
		leia(n1)

		
		para(inteiro i = 1; i <= 10; i++){ //Definindo o multiplicador com a variavel i
			escreva(n1, " x ", i, " = ", n1*i, "\n") //multiplica o valor inserido pelo i interador
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 336; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */