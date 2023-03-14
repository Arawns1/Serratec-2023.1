programa
{
	inclua biblioteca Util
	inclua biblioteca Texto
	
	funcao inicio()
	{
	cadeia texto
	
		escreva(Util.sorteia(1, 10))
		
		Util.aguarde(2000)
		
		escreva("\nTexto: ")
		leia(texto)

		escreva(Texto.caixa_alta(texto))

		//Contar quantos caracteres tem o texto digitado
		escreva("\nO numero de caracteres é: ", Texto.numero_caracteres(texto))

		//crie um vetor de 10 numeros e preencha com nuemros sorteados entre 1 e 1000

		inteiro numeros[10]
		para(inteiro i=0; i < 10; i++){
			numeros[i] = Util.sorteia(1, 1000)
		}

		para(inteiro i=0; i < 10; i++){
			
			escreva(numeros[i], " ")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 439; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */