programa
{
	inclua biblioteca Graficos --> g
	inclua biblioteca Teclado --> t
	inclua biblioteca Util --> u
	inclua biblioteca Mouse
	inclua biblioteca Tipos
	inclua biblioteca Texto
	
	inteiro ALTURA_JANELA = 600
	inteiro LARGURA_JANELA = 600
	inteiro x_Menu = 110
	inteiro y_Menu = 100
	inteiro centralizar_Menu = 220
	inteiro logo_imagem = g.carregar_imagem("D:\\Drive\\SSD\\Programação\\Serratec\\Serratec-2023.1\\Projetos Paralelos\\media\\logo_XPTO.jpg")
	inteiro logo_red = g.redimensionar_imagem(logo_imagem, 300, 300, verdadeiro)
	cadeia opcoes[5] = {"1 - Consulta Ambulatorial", "2 - Internacao", "3 - Listar Dados","4 - Faturamento", "5 - Encerrar programa"}
	cadeia nome = ""
	
	funcao inicio()
	{
		
		
		montarJanela()
		enquanto(verdadeiro)
		{
			background()
			Menu()
			verificaMouse()
			VerificaEscolha()
			g.renderizar()
		}
		
	}

	funcao montarJanela(){
		g.iniciar_modo_grafico(verdadeiro)
		g.definir_dimensoes_janela(LARGURA_JANELA, ALTURA_JANELA)
		g.definir_titulo_janela("Sistema XPTO v0.0.1")
		}
	funcao background()
	{
		g.definir_cor(g.COR_BRANCO)
		g.limpar()
	}
	
	funcao Menu(){
		g.definir_tamanho_texto(20.0)
		g.definir_cor(g.COR_PRETO)
		g.desenhar_imagem(centralizar_Menu-85, y_Menu-110, logo_red)
		
		g.desenhar_texto(x_Menu, y_Menu+150, "Bem-vindo ao sistema do hospital XPTO")
		g.definir_tamanho_texto(16.0)
		g.definir_estilo_texto(falso, verdadeiro, falso)
		g.desenhar_texto(centralizar_Menu, y_Menu+40+150, "Digite uma opção:")
		g.definir_estilo_texto(falso, falso, falso)
		g.definir_tamanho_texto(16.0)
		
		inteiro y = 330
		para(inteiro i=0; i <= 4; i++){
			g.desenhar_texto(190, y , opcoes[i])
			g.definir_cor(g.COR_PRETO)
			g.desenhar_retangulo(180, y-10, 210, 30, verdadeiro, falso)
			y += 40 //espacamento entre os textos 
		}

		
		}
	funcao VerificaEscolha()
	{
		
			g.definir_tamanho_texto(16.0)
			g.definir_cor(g.COR_VERDE)
			g.definir_estilo_texto(falso, falso, falso)

			se(t.tecla_pressionada(t.TECLA_1))
			{
				Consulta()
			
	
			}
			se(t.tecla_pressionada(t.TECLA_2))
			{
				g.definir_cor(g.COR_VERDE)
				g.desenhar_texto(190, 370, "2 - Internacao")
			}
			se(t.tecla_pressionada(t.TECLA_3))
			{
				g.definir_cor(g.COR_VERDE)
				g.desenhar_texto(190, 410, "3 - Listar Dados")
			}
			se(t.tecla_pressionada(t.TECLA_4))
			{
				
				g.definir_cor(g.COR_VERDE)
				g.desenhar_texto(190, 450, "4 - Faturamento")
				
			}
			se(t.tecla_pressionada(t.TECLA_5))
			{
				
				g.definir_cor(g.COR_VERMELHO)
				g.desenhar_texto(190, 490, "5 - Encerrar programa")
				g.encerrar_modo_grafico()
			}
		
	}
	
	funcao Consulta()
	{
		enquanto(nao(t.tecla_pressionada(t.TECLA_ESC)))
		{
		background()
		Voltar()
		g.definir_tamanho_texto(20.0)
		g.definir_cor(g.COR_PRETO)
		g.definir_estilo_texto(falso, falso, verdadeiro)
		g.desenhar_texto(x_Menu+130, y_Menu-50, "Menu Consulta")
		g.definir_estilo_texto(falso, falso, falso)
		g.definir_tamanho_texto(16.0)
		
		g.definir_cor(g.COR_PRETO)
		g.desenhar_texto(80,100, "Nome do paciente: ")
		g.desenhar_retangulo(220, 100, 300, 20, falso, falso)
		
		g.desenhar_texto(80,140, "Telefone do paciente: ")
		g.desenhar_retangulo(240, 140, 280, 20, falso, falso)
		g.desenhar_texto(10, 10, "X: " + Mouse.posicao_x() + " Y: " + Mouse.posicao_y())
			digitaNome()
			g.renderizar()
		}
	}
	

	funcao digitaNome()
	{
		g.definir_tamanho_texto(20.0)
		g.definir_cor(g.COR_PRETO)
		g.definir_estilo_texto(falso, falso, verdadeiro)
		g.desenhar_texto(x_Menu+130, y_Menu-50, "Menu Consulta")
		g.definir_estilo_texto(falso, falso, falso)
		g.definir_tamanho_texto(16.0)
		
		g.definir_cor(g.COR_PRETO)
		g.desenhar_texto(80,100, "Nome do paciente: ")
		g.desenhar_retangulo(220, 100, 300, 20, falso, falso)
		
		g.desenhar_texto(80,140, "Telefone do paciente: ")
		g.desenhar_retangulo(240, 140, 280, 20, falso, falso)
		g.desenhar_texto(10, 10, "X: " + Mouse.posicao_x() + " Y: " + Mouse.posicao_y())
		
		se(Texto.numero_caracteres(nome) >= 26)
		{
			g.definir_cor(g.COR_VERMELHO)
			g.definir_estilo_texto(falso, verdadeiro, falso)
			g.desenhar_texto(120,304, "Nome com número máximo de caracteres!")	
		}
		
		se(Teclado.alguma_tecla_pressionada())
		{
			se(Teclado.tecla_pressionada(127) ou Teclado.tecla_pressionada(8))
			{
				nome = " "
			
			}
			
			senao {
				nome += Teclado.caracter_tecla(Teclado.ler_tecla())
			}
		}
		
		g.definir_estilo_texto(falso, falso, falso)
		g.desenhar_texto(224,104, nome)

	}
	funcao Internacao(){}
	funcao ListarDados(){}
	funcao verificaMouse()
	{
		g.desenhar_texto(10, 10, "X: " + Mouse.posicao_x() + " Y: " + Mouse.posicao_y())
		se(Mouse.botao_pressionado(0)  )
		{
			g.desenhar_texto(20, 20, "apertou")
			se(Mouse.posicao_x() >= 180 e Mouse.posicao_x() <= 390){
				
				se(Mouse.posicao_y() >= 320 e Mouse.posicao_y() <= 350){
					enquanto(nao t.tecla_pressionada(t.TECLA_ESC))
					{
						Consulta()
						g.renderizar()
					}
				}
				
				se(Mouse.posicao_y() >= 360 e Mouse.posicao_y() <= 390){
					enquanto(nao t.tecla_pressionada(t.TECLA_ESC))
					{
						Internacao()
						g.renderizar()
					}
				}
		}
			
				
		}
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
 * @POSICAO-CURSOR = 1440; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */