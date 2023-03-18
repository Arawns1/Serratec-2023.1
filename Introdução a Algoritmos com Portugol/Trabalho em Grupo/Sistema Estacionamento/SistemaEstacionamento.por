programa
{
	inclua biblioteca Util --> u
	cadeia vagas[30][2]
	
	funcao inicio()
	{	
		para(inteiro i=0; i < 30; i++){
				vagas[i][0] ="0"
		}
		
		
		menu ()
	}
	funcao menu () {
		inteiro opcao

		faca{
		escreva ("\nDigite uma das opções abaixo: \n1 - Entrada de Veículo	\n2 - Saída de veículo \n3 - Listar vagas\n4 - Sair do Programa\n")
		leia (opcao)

		escolha (opcao)
		{
		caso 1: entrada ()
		pare
		caso 2: saida ()
		pare
		caso 3: listar ()
		pare
		caso 4: escreva ("Fim.")
		pare
		caso contrario:
		escreva ("Opção inválida.")
		}
		}enquanto (opcao != 4)
		
}
	funcao entrada () { 
		limpa()
		inteiro numero
		cadeia placa
		
		escreva ("Digite o número da vaga: ")
		leia (numero)
		se (numero>=0 e numero <30){
			
			se (vagas[numero][1] == ""){
				escreva ("Insira a placa do veículo: ")
				leia(placa)
				vagas[numero][1]=placa
				vagas[numero][0]="1"
				escreva ("Registrado com sucesso.\n")
				u.aguarde(1000)
				menu ()
				
			} senao {
				escreva ("Vaga ocupada.\n")
				menu ()}
			
			
		}
		senao
		escreva ("Número de vaga inválido! Digite novamente.\n")
		Util.aguarde(2000)
		entrada ()
		
	}
	funcao saida () {
		limpa()
		inteiro numero
		escreva ("Digite o número da vaga: ")
		leia(numero)
		se (numero>=0 e numero <30){
			
			se (vagas[numero][1] == "1"){
				vagas[numero][1]=""
				vagas[numero][0]="0"
				escreva ("Saido com sucesso\n")
				
				espere()
				menu()
				limpa()
				
			} senao {
				escreva ("Vaga já saida\n")
				espere()
				limpa()
				menu()
				
				}
			
			
		}
		senao
		escreva ("Número de vaga inválido! Digite novamente.\n")
		Util.aguarde(2000)
		entrada ()
	}
	funcao listar () {
		limpa()
		para(inteiro i=0; i < 30; i++){
			se (i%5==0){
				escreva("\n")
			}
			se (i <10){
				se (vagas[i][0] == "1")
			escreva ("Vaga 0", i, " ocupada  ")
			
			se (vagas[i][0] == "0")
			escreva ("Vaga 0",i," livre  ")
			}senao{
					se (vagas[i][0] == "1")
			escreva ("Vaga ", i, " ocupada  ")
			
			se (vagas[i][0] == "0")
			escreva ("Vaga ",i," livre  ")
			}
			}
			
		
		espere()
		limpa()
	}
	funcao espere(){
        	cadeia _ 
        	escreva("\n\nPressione enter para continuar...")
       	 leia(_)
	}
	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1521; 
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
 * @POSICAO-CURSOR = 2595; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */