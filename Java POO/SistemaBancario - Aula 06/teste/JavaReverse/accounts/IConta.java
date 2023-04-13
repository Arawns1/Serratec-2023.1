package accounts;

import java.util.*;

/**
 * 
 */
public interface IConta {

    /**
     * @param valor 
     * @return
     */
    public void depositar(double valor);

    /**
     * @param valor 
     * @return
     */
    public void sacar(double valor);

    /**
     * @param destino 
     * @param valor 
     * @return
     */
    public void transferir(Conta destino, double valor);

}