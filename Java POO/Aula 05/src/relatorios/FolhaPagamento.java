package relatorios;

import workers.Funcionario;

public class FolhaPagamento {
	public double calculaFolhaPagamento(Funcionario funcionario) {
		return funcionario.getSalario() + funcionario.getBonificacao();
	}
}
