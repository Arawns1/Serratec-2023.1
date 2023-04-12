package people;

public class Cliente extends Pessoa {
	protected static int totalDeClientes;
	protected int ID;

	

	public Cliente(String nome, String sobrenome, String cPF, String telefone, String email, int senha) {
		super(nome, sobrenome, cPF, telefone, email, senha);
		this.ID = totalDeClientes;
		totalDeClientes++;
	}

	public static void addCliente(Pessoa client) {
		pessoas.add(client);
	}

	

	/*
	 * public static boolean verificaLogin(String CPF, int senha) { for (Cliente
	 * cliente : clientes) {
	 * 
	 * if (CPF.equals(cliente.getCPF()) && senha == cliente.getSenha()) { return
	 * true; } } return false; }
	 */

	@Override
	public String toString() {
		return "Cliente [ID=" + ID + ", nome=" + nome + ", sobrenome=" + sobrenome + ", CPF=" + CPF + ", telefone="
				+ telefone + ", email=" + email + ", senha=" + senha + "]";
	}

}
