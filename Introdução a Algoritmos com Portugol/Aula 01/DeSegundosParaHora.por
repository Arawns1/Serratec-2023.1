/* Criar um algoritmo para ler um tempo em segundos e fazer a impressão no console no seguinte formato:
 * hora:minuto:segundos 
 */

programa
{
	
	funcao inicio()
	{
		inteiro segundos, minutos, horas 
		
		escreva("Digite um tempo em segundos: ")
		leia(segundos) //3762

		horas = segundos / 3600 // 1,045
		minutos = (segundos % 3600) /60 // (162)/60 = 2,7
		segundos = (segundos % 3600) % 60 //(162) = 2,7

		escreva(horas, "h ", minutos, "m ", segundos, "s" )
		
		
	} 
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 484; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */