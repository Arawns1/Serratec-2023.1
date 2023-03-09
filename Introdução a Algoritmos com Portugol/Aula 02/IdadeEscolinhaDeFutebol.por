programa
{
	
	funcao inicio()
	{
		cadeia nome, categoria
		inteiro idade
		
		escreva("Digite seu nome: ")
		leia(nome)
		escreva("Digite sua idade: ")
		leia(idade)

		se(idade >= 10 e idade <= 17)
		{
			categoria = "Base"
		}
		senao se(idade >= 18 e idade <= 40)
		{
			categoria = "Profissional"
			
		}
		senao se(idade > 40)
		{
			categoria = "Master"
			
		}
		senao
		{
			categoria = "Escolinha"
			
		}

		escreva("Nome: ", nome, "\n")
		escreva("Idade: ", idade, "\n")
		escreva("Categoria: ", categoria)

		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 276; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */