programa
{
	
	funcao inicio()
	{	
		cadeia nome
		inteiro idade
		real altura
		escreva("Digite seu nome: ")
		leia(nome)
		escreva("Digite sua idade: ")
		leia(idade)
		escreva("Digite sua altura: ")
		leia(altura)

		se(idade > 18 ou altura > 1.75){
			escreva("Você atende a todos os requisitos mínimos \n")
			escreva("Você pode competir!")
		}
		senao {
			escreva("Você não atende a um dos requisitos mínimos")
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 68; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */