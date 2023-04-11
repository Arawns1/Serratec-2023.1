package accounts;

public interface IConta {
	public void depositar(double valor) throws Exception;
	public void sacar(double valor) throws Exception;
	public void transferir(Conta destino, double valor) throws Exception;
}
