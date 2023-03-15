
/*
No começo do programa todos os assentos deverão ser inicializados com
zeros(0). O zero(0) indicará que o assento não foi ocupado.

Para reservar um assento digite a linha e a coluna do assento, caso não exista
deverá ser criticado. O um(1) indicará que o assento foi ocupado. Após a digitação da linha e coluna,
listar todos os assentos para exibir que a leitura dos dados foi preenchida
corretamente.

Caso o assento já exista deverá ser criticado

O trabalho deverá ser adicionado ao repositório do GitHub.
 */
 
 programa
{
	
	funcao inicio()
	{
		inteiro assentos[11][13], assentoLinha , assentoColuna
		
		faca{
			
			listarAssentos(assentos)
			
			faca{	
				escreva("Escolha a linha : ")
				leia(assentoLinha)	
					
				escreva("Escolha a coluna : ")
				leia(assentoColuna)
				
			} enquanto(verificaAssento(assentoLinha, assentoColuna))
		
		} enquanto(assentoEscolher(assentos, assentoLinha,assentoColuna))	
	}
	
	funcao listarAssentos(inteiro assentos[][])
	{
		escreva("\n~~ Lista de Assentos ~~\n\n")

		escreva("---| ")
		para(inteiro cabecalho = 1; cabecalho <= 12; cabecalho++)
		{
			se (cabecalho <= 9)
			{
				escreva("0",cabecalho,"  " )
			}
			senao
			{
				escreva("",cabecalho,"  " )
			}
		
		}
		escreva("\n")
			para(inteiro cabecalho = 1; cabecalho <= 54; cabecalho++) 
			{
			escreva("-")
			}
		
		escreva("\n")
		
			para(inteiro linha=1; linha < 11; linha++)
			{
				se (linha < 10){escreva("0",linha, " | ")}
				senao {escreva("",linha, " | ")}
			
			
				para(inteiro coluna=1; coluna < 13; coluna++)
				{
					escreva("0",assentos[linha][coluna], "  ")
				}
				
				escreva("\n")
			}
		escreva("\n")
	}

	funcao logico verificaAssento(inteiro assentoLinha, inteiro assentoColuna)
	{
		logico linhaCorreto = falso, colunaCorreto = falso
		
		se(assentoLinha >= 1 e assentoLinha <= 11)
		{
			linhaCorreto = verdadeiro	
				
			se (assentoColuna >= 1 e assentoColuna <= 13)
			{
				colunaCorreto = verdadeiro
			}
			senao
			{
				colunaCorreto = falso
				escreva("Valor da coluna incorreto\n")
			}
			
		}
		senao
		{
			linhaCorreto = falso
			escreva("Valor da linha incorreto\n")
		}
		
		retorne(linhaCorreto == falso ou colunaCorreto == falso)
	}

	funcao logico assentoEscolher(inteiro assentos[][], inteiro assentoLinha, inteiro assentoColuna)
	{
		cadeia opcao
		
		se(assentos[assentoLinha][assentoColuna] == 0)
		{
			escreva("Assento escolhido com sucesso! ")
			assentos[assentoLinha][assentoColuna] = 1
			listarAssentos(assentos)
		}
		senao
		{
			escreva("Assento ocupado! Escolha outro")
		}
		escreva("\nDeseja voltar ao menu? (s/n): ")
		leia(opcao)

		se(opcao == "s" ou opcao == "S" ) retorne verdadeiro
		senao
		{
			escreva("Fim do programa")
			retorne falso
		} 
		

		
			
	}	
}
			


			
	

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1481; 
 * @DOBRAMENTO-CODIGO = [79];
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */