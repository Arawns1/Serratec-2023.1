programa
{
	inclua biblioteca Util
	
	funcao inicio()
	{
		//crie um vetor de 10 numeros e preencha com nuemros sorteados entre 1 e 1000
		inteiro numeros[10]
		
		sorteio(numeros)
		exibirVetor(numeros)

	}

	funcao sorteio(inteiro vetor[]){
		para(inteiro i=0; i < 10; i++){
			vetor[i] = Util.sorteia(1, 1000)
		}
	}

	funcao exibirVetor(inteiro vetor[])
	{
		para(inteiro i=0; i < 10; i++){
			
			escreva(vetor[i], " ")
		}

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 207; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */