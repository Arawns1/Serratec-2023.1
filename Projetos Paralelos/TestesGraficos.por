programa
{
	inclua biblioteca Graficos --> g
	inclua biblioteca Teclado --> t
	inclua biblioteca Util --> u

	
	inteiro ALTURA_JANELA = 600
	inteiro LARGURA_JANELA = 600
	inteiro x_Menu = 110
	inteiro y_Menu = 100
	inteiro centralizar_Menu = 220
	

	
	funcao inicio()
	{
		
		
		montarJanela()
		enquanto(verdadeiro)
		{
			pintarTela()
			Menu()
			VerificaEscolha()
			g.renderizar()
		}
		
	}


	funcao montarJanela(){
		g.iniciar_modo_grafico(verdadeiro)
		g.definir_dimensoes_janela(LARGURA_JANELA, ALTURA_JANELA)
		g.definir_titulo_janela("Sistema XPTO v0.0.1")
		
	
		
		
		}
		
	funcao pintarTela(){
		g.definir_cor(g.COR_BRANCO)
		g.limpar()
		}
	funcao Menu(){
		
		
		g.definir_tamanho_texto(20.0)
		g.definir_cor(g.COR_PRETO)
		g.definir_estilo_texto(falso, falso, falso)
		inteiro logo_imagem = g.carregar_imagem("D:\\Drive\\SSD\\Programação\\Serratec\\Serratec-2023.1\\Projetos Paralelos\\media\\logo_XPTO.jpg")
		inteiro logo_red = g.redimensionar_imagem(logo_imagem, 300, 300, verdadeiro)
		
		g.desenhar_imagem(centralizar_Menu-85, y_Menu-110, logo_red)
		
		g.desenhar_texto(x_Menu, y_Menu+150, "Bem-vindo ao sistema do hospital XPTO")
		g.definir_tamanho_texto(17.0)
		g.desenhar_texto(centralizar_Menu, y_Menu+40+150, "Digite uma opção:")
		g.definir_tamanho_texto(16.0)
		g.desenhar_texto(centralizar_Menu-20, y_Menu+80+150, "1 - Consulta Ambulatorial")
		g.desenhar_texto(centralizar_Menu-20, y_Menu+110+150, "2 - Internacao")
		g.desenhar_texto(centralizar_Menu-20, y_Menu+140+150, "3 - Listar Dados")
		g.desenhar_texto(centralizar_Menu-20, y_Menu+170+150, "4 - Faturamento")
		g.desenhar_texto(centralizar_Menu-20, y_Menu+200+150, "5 - Encerrar programa")
		}
	
	funcao VerificaEscolha()
	{
		
			g.definir_tamanho_texto(16.0)
			g.definir_cor(g.COR_VERDE)
			g.definir_estilo_texto(falso, falso, falso)

			se(t.tecla_pressionada(t.TECLA_1))
			{
				
				g.desenhar_texto(centralizar_Menu-20, y_Menu+80+150, "1 - Consulta Ambulatorial")
				g.definir_cor(g.COR_VERDE)
				
				enquanto(nao t.tecla_pressionada(t.TECLA_ESC))
				{
					
					Consulta()
					g.renderizar()
				}
				
	
			}
			se(t.tecla_pressionada(t.TECLA_2))
			{
				
				g.desenhar_texto(centralizar_Menu-20, y_Menu+110+150, "2 - Internacao")
				
			}
			se(t.tecla_pressionada(t.TECLA_3))
			{
			
				g.desenhar_texto(centralizar_Menu-20, y_Menu+140+150, "3 - Listar Dados")
				
			}
			se(t.tecla_pressionada(t.TECLA_4))
			{
				
				g.desenhar_texto(centralizar_Menu-20, y_Menu+170+150, "4 - Faturamento")
				
			}
			se(t.tecla_pressionada(t.TECLA_5))
			{
				
				g.definir_cor(g.COR_VERMELHO)
				g.desenhar_texto(centralizar_Menu-20, y_Menu+200+150, "5 - Encerrar programa")
			}
		
	}
	funcao Consulta()
	{
		g.definir_cor(g.COR_BRANCO)
		g.limpar()
		Voltar()
		g.definir_tamanho_texto(20.0)
		g.definir_cor(g.COR_PRETO)
		g.definir_estilo_texto(falso, falso, falso)
		g.desenhar_texto(x_Menu+110, y_Menu, "Menu Consulta")
	}

	funcao Voltar()
	{
		g.definir_tamanho_texto(14.0)
		g.definir_cor(g.COR_PRETO)
		g.definir_estilo_texto(falso, falso, falso)
		g.desenhar_texto(x_Menu-100, y_Menu+460, "<< Para voltar a tela anterior aperte a tecla ESC")
	}
}
	
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1684; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */