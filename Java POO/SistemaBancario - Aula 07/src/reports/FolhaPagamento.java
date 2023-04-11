package reports;

import people.workers.Funcionario;

public class FolhaPagamento {
	public static double calculaFolhaPagamento(Funcionario func) {
		return func.getSalario() + func.getBonificacao();
	}
}
