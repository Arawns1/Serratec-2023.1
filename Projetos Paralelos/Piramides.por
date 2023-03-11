programa
{

	
	funcao inicio()
	{	
	
		
		//meiaPiramideInversa(10)
		//meiaPiramideDireita(10)
		//meiaPiramide(10)
		piramideInteira(10)
		

		
	}

inteiro numvezes = 0
	funcao piramideInteira(inteiro tamanho)
	{
		inteiro contador = 10, contador2 = 0
		
		para(inteiro i=0; i < (tamanho); i++){
			
			para(inteiro j=0; j < contador; j++){
				escreva(" ")
				
			}

			escreva("*")
			
			

			
			para(inteiro j=0; j < contador2; j++){
				escreva("**")
			}
			escreva("\n")
			contador2++
			contador--

			
			
			
			
		}
	}

	funcao meiaPiramideDireita(inteiro tamanho)
	{
		inteiro contador = 10, contador2 = 0
		
		para(inteiro i=0; i < (tamanho+1); i++){
			
			para(inteiro j=0; j < contador; j++){
				escreva(" ")
			}

			
			para(inteiro j=0; j < contador2; j++){
				escreva("*")
			}
			contador2++
			contador--
			escreva("\n")
			
		}
		
	}

	funcao meiaPiramide(inteiro base)
	{
		inteiro contador = 1
		
		para(inteiro j=0; j < base ; j++){
			
			para(inteiro i=0; i < contador; i++){
				escreva("*")
			}
			escreva("\n")
			contador++
		}	
	}
	
	funcao meiaPiramideInversa(inteiro base)
	{
		//Piramide inversa

		para(inteiro i=0; i < (base-1); i++){
			escreva("*")
			
			para(inteiro j=i; j < (base-2); j++){
			escreva("*")
			}

			
			escreva("*")
			escreva("\n")
		}
		escreva("*")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 536; 
 * @DOBRAMENTO-CODIGO = [48, 70, 84];
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */