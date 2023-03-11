/*
 * 3)Elabore um algoritmo que leia em um vetor:
 *   - um vetor com os nomes de seis times.
	- outro vetor com a pontuação dos seis times.
	Exibir ao final o nome do time campeão e o último colocado na pontuação.
 */
programa
{	
	
	cadeia nomeTimes[6], campeao, ultimo
	inteiro pontuacaoTimes[6]
	inteiro maiorPontuacao=0,menorPontuacao=999
	
	funcao inicio()
	{
		para(inteiro i=0; i < 6; i++){
			escreva("Digite o nome do time: (3 LETRAS) ")
			leia(nomeTimes[i])
			escreva("Digite a pontuação do time ", nomeTimes[i],": ")
			leia(pontuacaoTimes[i])
			
			se (pontuacaoTimes[i] > maiorPontuacao)
				{
					maiorPontuacao = pontuacaoTimes[i]
					campeao = nomeTimes[i]
				}
				
			se (pontuacaoTimes[i] < menorPontuacao)
				{
					menorPontuacao = pontuacaoTimes[i]
					ultimo = nomeTimes[i]
				}
			
		}

		limpa()
		escreva("\n")
		escreva("TIME")
		escreva("\t\t|\t\t")
		escreva("PONTUAÇÃO")
		escreva("\n")
		
		
		para(inteiro i=0; i < 6; i++){
			escreva(nomeTimes[i]," ")
			escreva("\t\t|\t\t")
			escreva(pontuacaoTimes[i]," ")
			escreva("\n")
		}
		escreva("\n")
		
	     escreva("Maior pontuação: ", maiorPontuacao, "\n")
		escreva("Menor pontuação:", menorPontuacao, "\n")
		escreva("Campeão: ", campeao, "\n")
		escreva("Ultimo: ", ultimo)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 830; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */