programa
{
	
	funcao inicio()
	{
		inteiro ano, sem
		escreva("Digite um ano: ")
		leia(ano)
		escreva("Digite um semestre: ")
		leia(sem)
		mensagem(ano, sem)
	}
	//função com paramentro
	funcao mensagem(inteiro ano, inteiro sem)
	{
		escreva("************************\n")
		escreva("*** SERRATEC ", ano,"-", sem, " ****\n")
		escreva("************************")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 193; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */