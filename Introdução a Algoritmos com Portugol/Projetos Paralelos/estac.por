/*Desenvolva um algoritmo para gerenciamento de vagas de
estacionamento. O estacionamento possui trinta vagas. Deverá ser
criado um menu com as seguintes opções: ---------------------------------- 
1-Entrada de Veículo
2-Saída de Veículo
3-Listar vagas
4-Sair do programa
---------------------------------- Entrada
Deverá ser digitado o número da vaga, uma crítica deverá ser feita para
saber se o número da vaga está de 1 a 30 em caso afirmativo, verifique
se esta vaga está liberada para estacionar preenchendo a posição do
vetor. Saída
Deverá ser digitado o número da vaga, uma crítica deverá ser feita para
saber se o número da vaga está de 1 a 30 em caso afirmativo verifique
se esta vaga está ocupada para liberar a posição do vetor. Funções
Deverão ser criadas as seguintes funções:
 entrada e saída de veículos. 
 verificação do número de vaga digitado se está entre 1 e 30. 
 listagem de vagas
 caso seja necessário poderão ser criadas outras funções*/

programa
{
    inteiro vagas[31], menu=1, v
    cadeia nome
    funcao inicio()
    {
        bomDia()
        enquanto(menu!=0){
        escreva("Selecione uma opcao:\n1-Entrada de Veículo \n2-Saída de Veículo \n3-Listar vagas \n4-Sair do programa \n")
        leia(menu)
        limpa()

        se(menu==1){
            a()
            escreva("\nSelecione uma vaga: ")
            leia(v)
            se(v>30 ou v<1){
            	escreva("Vaga Invalida")
            	retorne
            }senao se(vagas[v]==1){
                escreva("Vaga Ocupada\n")
            }
            vagas[v]=1
            limpa()
            a()
            escreva("\n")

        }senao se(menu==2){
            a()
            escreva("\nSelecione uma vaga: ")
            leia(v)
            se(v>30 ou v<1){
            	escreva("Vaga Invalida")
            	retorne
            }senao se(vagas[v]==1){
                vagas[v]=0
            }senao se(vagas[v]==0){
                escreva("Vaga vazia\n")
            }
            limpa()
            a()
            escreva("\n")

        }senao se(menu==3){
            a()
            escreva("\n")

        }senao se(menu==4){
            pare
        }senao{
            escreva("Acao Invalida\n")
        }}
    }
    funcao a(){
    	escreva("Numero de Vagas: ")
		para(inteiro l=0; l < 30; l++){
			se(l<9){
				escreva("0",l+1,"  ")
				}
			senao{
				escreva(l+1,"  ")
			}
          }
          
        escreva("\n\t  Vagas: ")
        para(v=1; v < 31; v++){
        		se(vagas[v] != 0)
        		{
        			 escreva("xx  ")
        		}
        		senao
        		{
        			 escreva("--  ")
        			}
               
            }
    }
    funcao bomDia(){
            escreva("Diga seu nome: ")
            leia(nome)
        escreva("Sou Louro Jose, seu flanelinha virtual, bom dia,",nome,"!\n")
    }
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1976; 
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
 * @POSICAO-CURSOR = 2560; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */