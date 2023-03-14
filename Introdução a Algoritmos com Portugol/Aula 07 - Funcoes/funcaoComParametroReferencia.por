programa
{
	
	funcao inicio()
	{
		inteiro a = 100
		incrementa(a)
		escreva("O valor do incremento é: ", incrementa(a), "\n")
		escreva("O valor da variável a é: ", a,"\n")
		
	}
	
	funcao inteiro incrementa(inteiro &i) //se o A muda o I muda tambem é como se o &i é na verdade a variavel A.
	{
		i = i + 10 // é como se fosse: a = a + 10
		retorne i // retorne a
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 370; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */