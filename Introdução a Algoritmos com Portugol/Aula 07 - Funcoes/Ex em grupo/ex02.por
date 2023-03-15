programa
{
	
	funcao inicio()
	{
		escreva("---------- SISTEMA DE GESTÃO DE VENDEDORES -----------\n------------------------------------------------------\n")
		entradaDeDados()
	}

	funcao entradaDeDados()
	{
		cadeia nome
		real salario, porcComissao
		inteiro numVendas
		
		escreva(">>>Digite seu nome: ")
		leia(nome)
		
		escreva(">>>Digite seu salário fixo: ")
		leia(salario)
		
		escreva(">>>Digite o numero de vendas no mês: ")
		leia(numVendas)
		
		escreva(">>>Digite a sua comissão (em percentual): ")
		leia(porcComissao)

		saida(nome, salario, porcComissao, numVendas)	

	}

	funcao real calculoComissao(inteiro vendas, real comissao)
	{
		retorne vendas * (comissao/100)	
	}

	funcao saida(cadeia nome, real salario, real porcComissao, inteiro numVendas)
	{	
		escreva("------- RESUMO -------\n")
		escreva("--Nome: ", nome,"\n")
		escreva("--Salario Líquido: ", salario,"\n")
		escreva("--Valor comissão: ", calculoComissao(numVendas, porcComissao),"\n")
		escreva("--Salário final (salário + comissão): ",calculoComissao(numVendas, porcComissao) + salario,"\n")
		escreva("----------------------")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 315; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */