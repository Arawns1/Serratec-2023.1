package exemplo;

import Contas.Conta;

public class Sistema {

	public static void main(String[] args) {
		
		System.out.println("~~~Sistema bancário~~~");
		
		Conta aluno = new Conta("Gabriel", 1, 10, 1000, "Corrente");
		
		Conta professor = new Conta("Marcelo", 3, 11, 1000, "Corrente");

		professor.depositar(200);
		
		// Transfere da conta Aluno para o professor o valor de 200
		aluno.transferir(professor, 200);
		
		System.out.println(professor);
		System.out.println(aluno);
		
		
		
		
		
	}
}

