programa {
    funcao inicio() {
        cadeia senha, usuario
        escreva("Digite o Usuario:")
        leia(usuario)
        escreva("Digite a senha:")
        leia(senha)
        escreva(acessarSistema(usuario, senha))
    }
    
    funcao cadeia acessarSistema(cadeia usuario, cadeia senha) {
        
        cadeia matriz[5][2] = { {"carlos","1"},
                                {"Jose","2"},
                                {"Marlão","3"},
                                {"Tutu","4"},
                                {"Mumu","5"}}
        
          para(inteiro i = 0; i < 5; i++)
          {
             se(usuario == matriz[i][0] e senha == matriz[i][1])
              {
               retorne "Encontrei!\nBem vindo ao sistema "
              }
          }
          retorne "Usuário não encontrado ou senha inválida"
        }
    }
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 385; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */