/*
 * 2)Criar um algoritmo que leia em um vetor o nome, a quantidade e o valor de uma lista de três produtos.  
 * Ao final deverá calcular o subtotal de cada produto e no final exibir o total geral da compra
 */
programa
{
	cadeia nomeProduto[3]
	inteiro quantidade[3]
	real precoUnitario[3]
		
	funcao inicio()
	{
		para(inteiro i=0; i < 3; i++){
			
			escreva("Digite o ", (i+1),"º produto: ")
			leia(nomeProduto[i])
			
			escreva("Digite a quantidade: ")
			leia(quantidade[i])
			
			escreva("Digite o preço unitário: ")
			leia(precoUnitario[i])
			
			limpa()
			
		}

		limpa()
		escreva("Total:")
		escreva("\n")
		para(inteiro i=0; i < 3; i++){
			
			escreva("Produto: ", nomeProduto[i], "| Quantidade: ", quantidade[i], "| SubTotal: R$", quantidade[i]*precoUnitario[i], "\n")
			
		}

		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 583; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */