programa
{
	inclua biblioteca Matematica -->mat
	inclua biblioteca Util --> u
	inclua biblioteca Tipos --> t
	
	real totalVotosUteis, totalVotos, votosCandidatoX=0.0, votosCandidatoY=0.0, votosEmBranco=0.0, votosInvalidos = 0.0
	inteiro votoUsuario = 0

	
		
	funcao inicio()
	{	
		faca
		{
		escreva("Digite o número do candidato que você quer votar!\n" +
		        "1 - Candidato X \n" +
		        "2 - Candidato Y\n" +
		        "3 - Votar em Branco\n" +
		        "0 - Finalizar Votação\n" +
		        "Digite seu voto: ")
		leia(votoUsuario)

		escolha (votoUsuario)
		{
			caso 1: 
				votosCandidatoX++
				computaVoto()
				pare
		
			caso 2: 
				votosCandidatoY++
				computaVoto()
				pare
		
			caso 3: 
				votosEmBranco++
				computaVoto()
				pare

			caso contrario: 
				se(votoUsuario != 0) 
				{
				 limpa()
				 escreva("Voto inválido, porém computado! ")
				 u.aguarde(800)
				 votosInvalidos++
				 limpa()
				}
				senao limpa() pare
		}	

		
	} enquanto (votoUsuario!=0)

	   totalVotosUteis = votosCandidatoX + votosCandidatoY + votosEmBranco
	   totalVotos = votosCandidatoX + votosCandidatoY + votosEmBranco + votosInvalidos

		escreva("----- Votação Finalizada ----- \n")
		escreva("> O Total de votos validos foram: ", t.real_para_inteiro(totalVotosUteis),"\n")
		escreva("> O total de votos úteis no Candidato X foram: ", t.real_para_inteiro(votosCandidatoX), " (",mat.arredondar((votosCandidatoX/totalVotosUteis)*100,2),"%)","\n")
		escreva("> O total de votos úteis do Candidato Y foram: ", t.real_para_inteiro(votosCandidatoY)," (",mat.arredondar((votosCandidatoY/totalVotosUteis)*100,2),"%)","\n")
		escreva("> O total de votos úteis em branco foram: ", t.real_para_inteiro(votosEmBranco), " (",mat.arredondar((votosEmBranco/totalVotosUteis)*100,2),"%)","\n")
		escreva("> Tiveram: ",t.real_para_inteiro(votosInvalidos)," (", mat.arredondar((votosInvalidos/totalVotos)*100,2) ,"%)"," votos nulos\n")
	}

	funcao computaVoto(){
		limpa()
		escreva("Voto computado com Sucesso!")
		u.aguarde(500)
		limpa()
	}

}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 2049; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */