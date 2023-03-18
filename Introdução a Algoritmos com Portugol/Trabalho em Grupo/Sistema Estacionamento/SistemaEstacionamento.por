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
			para(inteiro cabecalho=0; cabecalho < 20; cabecalho++){
				escreva("=-")
			}
			escreva("\n     BEM-VINDO AO ESTACIONAMENTO G5 \n")
			para(inteiro cabecalho=0; cabecalho < 20; cabecalho++){
				escreva("-=")
			}
			escreva ("\nDigite uma das opções abaixo: \n |1 - Entrada de Veículo	\n |2 - Saída de veículo \n |3 - Listar vagas\n |4 - Sair do Programa\n")
			escreva("Digite sua opção: ")
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
				limpa()
				
			} 
			senao {
				escreva ("Vaga ocupada. Tente novamente\n")
				Util.aguarde(2000)
				limpa()
				entrada ()
			}
		}
		senao{
			escreva ("Número de vaga inválido! Digite novamente.\n")
			Util.aguarde(2000)
			limpa()
			entrada ()
		}
	}
	funcao saida () {
		limpa()
		inteiro numero
		escreva ("Digite o número da vaga: ")
		leia(numero)
		se (numero>=0 e numero <30)
		{
			
			se (vagas[numero][0] == "1")
			{
				vagas[numero][1]=""
				vagas[numero][0]="0"
				escreva ("Vaga desocupada com sucesso!\n")
				espere()
				limpa()
				
			} 
			senao 
			{
				escreva ("A Vaga número ", numero  ," já está vazia.\n")
				espere()
				menu()
				limpa()
			}
		} senao
		{
			escreva ("Número de vaga inválido! Digite novamente.\n")
			Util.aguarde(2000)
			saida ()
		}
	}
	funcao listar () {
		limpa()
		para(inteiro i=0; i < 30; i++){
			se (i%5==0){
				escreva("\n")
			}
			se (i <10){
				se (vagas[i][0] == "1")
			escreva ("Vaga 0", i, " ocupada ")
			
			se (vagas[i][0] == "0")
			escreva (" Vaga 0",i," livre  ")
			}senao{
					se (vagas[i][0] == "1")
			escreva ("Vaga ", i, " ocupada ")
			
			se (vagas[i][0] == "0")
			escreva (" Vaga ",i," livre  ")
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
 * @POSICAO-CURSOR = 1799; 
 * @DOBRAMENTO-CODIGO = [109];
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {vagas, 4, 8, 5}-{numero, 81, 10, 6};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */