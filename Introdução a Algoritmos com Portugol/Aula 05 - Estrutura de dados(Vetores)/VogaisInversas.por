
//Faça um algoritmo que leia as cinco vogais e exiba na tela na ordem inversa.
programa
{
	
	funcao inicio()
	{
		caracter vogais[5]

		para(inteiro i=0; i < 5; i++){
			escreva("Digite uma vogal: ")
			leia(vogais[i])
		}

		para(inteiro i=4; i >= 0; i--){
			escreva(vogais[i])
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 285; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */