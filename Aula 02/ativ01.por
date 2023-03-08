programa
{
	
	funcao inicio()
	{
		inteiro idade
		caracter pcd, gest
		// declarando as variaveis
		
		escreva("Digite sua idade: ") //realizando a entrada de dados
		leia(idade) 
		
		escreva("É um deficiente físico? (s/n) : ") 
		leia(pcd)
		
		escreva("É um gestante? : ")
		leia(gest)

		se((idade>65) ou (pcd == 's') ou (gest == 's')){ //comparando as variaveis
			escreva("Você tem direito a fila preferencial")
		}
		senao{
			escreva("Você não possui direito a fila preferencial")
			}
		

		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 499; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */