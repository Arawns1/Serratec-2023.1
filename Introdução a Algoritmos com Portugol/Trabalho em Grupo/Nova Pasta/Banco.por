/*2) Fazer um programa para um banco que deverá ter quatro usuários e senhas
cadastrados em um vetor ou matriz. Quando executar o programa deverá pedir o
nome do usuário e senha cadastrados, caso não exista deverá encerrar o
programa, caso o usuário esteja cadastrado deverá ser exibida a mensagem de
boas vindas e um menu com as seguintes opções:
1 - Depositar
2 - Sacar
3 - Saldo
4 - Sair
 */

programa
{
	inclua biblioteca Util
	inclua biblioteca Tipos
	
	cadeia matriz[4][3] = {{"caio", "11", "10"},
					   {"gabriel", "22", "0"},
					   {"maria", "33", "0"},
					   {"tamirys", "44", "0"}}
	
	funcao inicio()
	{
		login()
	}
	
	funcao login(){
		inteiro id = 0
		cadeia senha, nome
		escreva("~~ Faça seu Login ~~\n")
		escreva("Digite seu nome: ")
		leia(nome)
		escreva("Digite a senha: ")
		leia(senha)
		
		limpa()
		se(verificaLogin(nome, senha, id) == verdadeiro)
		{
			
			menu(id)
		}
		senao
		{
			escreva("Usuário inválido!\n")
			login()
		}
		
		para(inteiro i=0; i < 4; i++){
			se(nome==matriz[i][0] e senha==matriz[i][1]){
				menu(i)
			}
		}					 
	}
	funcao logico verificaLogin(cadeia nome, cadeia senha, inteiro &id)
	{
		para(inteiro i=0; i < 4; i++){
			se(nome==matriz[i][0] e senha==matriz[i][1]){
				id = i
				retorne verdadeiro
			}
		}
		retorne falso
	}

	funcao menu(inteiro id){

		para(inteiro cabecalho=0; cabecalho < 40; cabecalho++)
		{
			escreva("=")
		}
		escreva("\n   Seja bem-vindo ao G5Bank "+ matriz[id][0] + "!\n")
		para(inteiro cabecalho=0; cabecalho < 40; cabecalho++)
		{
			escreva("=")
		}
		escreva("\n")
			
		inteiro opcao
		escreva("1 - Depositar\n")
		escreva("2 - Sacar\n")
		escreva("3 - Saldo\n")
		escreva("4 - Sair\n")
		escreva("Digite a opção: ")
		leia(opcao)
		escolha(opcao){
			caso 1: depositar(id)
			pare
			caso 2: sacar(id)
			pare
			caso 3: saldo(id)
			pare
			caso 4: 
			escreva("Encerrando sessão...\n")
			Util.aguarde(1500)
			limpa()
			login()
			pare
			caso contrario: escreva("Opcao Invalida\n")
			pare
		}
	}

	funcao depositar(inteiro id){
		limpa()
		cadeia saldoAtual = matriz[id][2]
		real valor, saldoConvertido, novoSaldo
		
		escreva("Qual o valor do deposito? R$")
		leia(valor)
		saldoConvertido = Tipos.cadeia_para_real(saldoAtual)
		novoSaldo = saldoConvertido + valor
		matriz[id][2] = Tipos.real_para_cadeia(novoSaldo)
		
		escreva("Saldo atualizado: R$", novoSaldo,"\n")
		
		escreva("Retornando para o menu...\n")
		Util.aguarde(1000)
		limpa()
		menu(id)
	}

	funcao sacar(inteiro id){
		limpa()
		cadeia saldoAtual = matriz[id][2]
		real valor, saldoConvertido, novoSaldo
		
		escreva("Qual o valor para sacar? R$")
		leia(valor)
		
		saldoConvertido = Tipos.cadeia_para_real(saldoAtual)
		
		novoSaldo = saldoConvertido - valor
		
		se(novoSaldo < 0)
		{
			escreva("Saldo Insuficiente para sacar!\n")
			escreva("Retornando para o menu...\n")
			Util.aguarde(1000)
			limpa()
			menu(id)
		}
		senao
		{
			escreva("Saldo atualizado: R$ ", novoSaldo,"\n")
			matriz[id][2] = Tipos.real_para_cadeia(novoSaldo)
			escreva("Retornando para o menu...\n")
			Util.aguarde(1000)
			limpa()
			menu(id)
		}
	}

	funcao saldo(inteiro id){
			limpa()
			escreva("Seu saldo é: R$ ", matriz[id][2], "\n")
			escreva("Retornando para o menu...\n")
			Util.aguarde(1000)
			limpa()
			menu(id)
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 723; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */