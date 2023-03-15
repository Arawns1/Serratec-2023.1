programa
{
	
	funcao inicio()
	{
		inteiro a, vet[10] = {100,90, 30, 60, 80, 15, 27, 80, 90, 34}
		trocaValor(vet, 0)
		imprimir(vet)
	}

	funcao trocaValor(inteiro v[], inteiro i)
	{
		v[i] = 5000
	}
	
	funcao imprimir(inteiro v[])
	{
		para(inteiro i=0; i < 10; i++){
			escreva (v[i],"\n")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 238; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */