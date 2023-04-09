package accounts;

public interface IConta {
	public void depositar(double valor);
	public void sacar(double valor);
	public void transferir(Conta destino, double valor);
}
