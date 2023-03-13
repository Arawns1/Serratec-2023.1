programa
{
	inclua biblioteca Util --> u

	inteiro opcao, numeroTotalDeConsultas = 0, numeroTotalDeInterncaoes
	real somaTotalDeConsultas = 0.0, somaTotalDeIntercoes=0.0
	logico Quartos[24] //Ao declarar, o vetor assume falso como todas as posições
	
	funcao inicio()
	{	
		faca{
			mostrarMenu()
			escreva("Digite sua opção: ")
			leia(opcao)	
	
			escolha(opcao){
				caso 1: RealizarConsulta()
				pare
				caso 2: RealizarIntercao()
				pare
				caso 3: ListarQuartos()
				pare
				caso 4: RealizarFaturamento()
				pare
				caso 5: escreva("--> Fim do Programa")
				pare
				caso contrario: 
					escreva("Opção Inválida!\n")
					escreva("Retornando ao menu...\n")
					u.aguarde(2000)
					limpa()
				pare
			}
			
		}enquanto(opcao!=5)
	}
	
	funcao mostrarMenu(){
		
		limpa()
		escreva("Seja Bem-vindo(a) ao Hosptial XPTO\n")
		
		para(inteiro i=0; i < 33; i++){
			escreva("-")
		
		}
		escreva("\n")
		escreva("| Digite uma opção:\t\t|\n")
		escreva("|\t\t\t\t|")
		escreva("\n")
		
		escreva(  "|  1 - Consulta Ambulatorial\t|\n",
				"|  2 - Internação\t\t|\n",
				"|  3 - Listar Quartos\t\t|\n",
				"|  4 - Faturamento\t\t|\n",
				"|  5 - Sair do Programa\t\t|\n")
	
			escreva("|\t\t\t\t|")
			escreva("\n")
		
		para(inteiro i=0; i < 33; i++){
			escreva("-")
		
		}
		escreva("\n")
		
		
	}
	funcao RealizarConsulta(){}
	funcao RealizarIntercao(){}
	funcao ListarQuartos(){}
	funcao RealizarFaturamento(){}
}
	
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 725; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */