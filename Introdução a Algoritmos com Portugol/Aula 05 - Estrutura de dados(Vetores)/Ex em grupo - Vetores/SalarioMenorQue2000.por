/*
 * 1)  Escreva um algoritmo que leia uma lista de salários de cinco funcionários em um vetor. 
 * Após, o algoritmo deverá aplicar um aumento de 10% somente sobre salários abaixo de R$ 2000,00.  
 * Mostrar na tela a lista dos salários.
 */



programa
{
	inclua biblioteca Matematica --> mat
	
	
	funcao inicio()
	{
		real salarios[5]
		para(inteiro i = 0; i < 5; i++)
		{
			escreva("Digite o valor do ", (i+1),"º salário: ")
			leia(salarios[i])
			se(salarios[i] < 2000)
			{
				salarios[i] *= 1.1
			}
		}
		escreva("Salários: \n")
		para(inteiro i=0; i < 5; i++){
			escreva(mat.arredondar(salarios[i], 2),"\n")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 300; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */