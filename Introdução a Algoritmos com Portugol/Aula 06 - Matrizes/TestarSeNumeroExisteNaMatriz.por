programa 
{ 
	inteiro matriz[4][2] = {{10,20},
							{30,40},
							{50,60},
							{70,80}}
	inteiro numeroDigitado, linhaInserir, colunaInserir
	logico numeroExiste = falso, linhaCorreta = falso, colunaCorreta = falso
	funcao inicio()
	{
		faca{
		escreva("\nDigite um número para verificar: ")
		leia(numeroDigitado)
		para(inteiro linha = 0; linha < 4; linha++){
			para(inteiro coluna = 0; coluna < 2; coluna++){
				escreva(matriz[linha][coluna])
				se (coluna == 0){
					escreva("-")
				
				}
				se(matriz[linha][coluna] == numeroDigitado)
				{
					escreva("\nEncontrei! na posição: ","linha"," ", linha," ","coluna"," ",coluna," ")
					numeroExiste = verdadeiro
					linha = 4
					coluna = 2
				}senao{
					numeroExiste = falso
				}
				
			}	
      escreva("\n")
		}
		} enquanto (numeroExiste == verdadeiro)
		
		faca{
		escreva("\nDigite a linha que deseja inserir o numero: ")
		leia(linhaInserir)
		se(linhaInserir >= 0 e linhaInserir < 4){
			linhaCorreta = verdadeiro

			escreva("\nDigite a coluna que deseja inserir: ")
			leia(colunaInserir)
			
			se(colunaInserir >= 0 e colunaInserir < 2){
				colunaCorreta = verdadeiro
				matriz[linhaInserir][colunaInserir] = numeroDigitado
			}
			senao{
				colunaCorreta = falso
				escreva("Numero da coluna invalido")
			}

		}
		senao{
			linhaCorreta = falso
			escreva("Numero da linha invalido")
			
		}
		
		}enquanto((linhaCorreta == falso)ou(colunaCorreta == falso))
		
		
		para(inteiro linha=0; linha < 4; linha++){
			para(inteiro coluna=0; coluna<2;coluna++){
				escreva(matriz[linha][coluna])
				se (coluna == 0){
					escreva("-")
				
				}
			}
      escreva("\n")
		}
		}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1658; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 2067; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */