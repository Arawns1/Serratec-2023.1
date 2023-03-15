programa
{

    funcao inicio()
    {
    	//1a linha horizontal começo
        para(inteiro i=0; i < 25; i++){
            escreva("*")
            
        }
        
        escreva("\t\t") // espaço entre orelhas
        
        para(inteiro i=0; i < 25; i++){ //2a linha horinzontal
            escreva("*")
            
        }
        
        escreva("\n") //inicio descida
        
		
        para(inteiro j=0; j < 10; j++){ //descida até retangulo interno
            escreva("*\t\t\t*\t\t*\t\t\t*")
            escreva("\n")
        }
        
        
        para(inteiro j=0; j < 1; j++){
            escreva("*\t*********\t*\t\t*\t*********\t*") //linha horizontal interna
            escreva("\n")
            
        }
      
      para(inteiro j=0; j < 10; j++){ //linha vertical interno
            escreva("*\t*\t*\t*\t\t*\t*\t*\t*")
            escreva("\n")
        }
        
       para(inteiro i=0; i < 65; i++){//linha horizontal baixo
            escreva("*")
        }
        escreva("\n")
        para(inteiro i=0; i < 1; i++){//linha horizontal baixo
            escreva(" *\t\t\t\t\t\t\t       *")
        }
        
        
        
    }
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 990; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */