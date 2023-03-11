//Faca um algoritmo para leitura de quator notas de um vetor, exibir media, maior nota , menor nota
programa
{
	inclua biblioteca Matematica
	
	funcao inicio()
	{
		real notas[4]
		real media=0.0, maiorNota=0,menorNota=999,somaNotas=0

		para(inteiro i=0; i < 4; i++){
			
			faca{
				escreva("Digite uma nota ",i," : ")
				leia(notas[i])
				
				se (notas[i] > maiorNota)
				{
					maiorNota = notas[i]
				}
				se (notas[i] < menorNota)
				{
					menorNota = notas[i]
				}
				somaNotas += notas[i]
				
			}enquanto(notas[i]<0 ou notas[i]>10)
		
		}
		

		media = Matematica.arredondar(somaNotas/4,2)
		
		escreva("************\n3")
		escreva("A maior nota é: ", maiorNota,"\n")
		escreva("A menor nota é: ", menorNota,"\n")
		escreva("A media das notas é: ",media,"\n")
		
		
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