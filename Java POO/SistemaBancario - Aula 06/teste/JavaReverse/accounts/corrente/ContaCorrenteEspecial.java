package accounts.corrente;

import java.util.*;

/**
 * 
 */
public class ContaCorrenteEspecial extends ContaCorrente {

    /**
     * Default constructor
     */
    public ContaCorrenteEspecial() {
    }

    /**
     * 
     */
    private double cartaoCredito;

    /**
     * 
     */
    private double investimento;

    /**
     * @param titular 
     * @param numero 
     * @param agencia 
     * @param saldo 
     * @param tipo 
     * @param tarifa 
     * @param limite 
     * @param cartaoCredito 
     * @param investimento
     */
    public void ContaCorrenteEspecial(String titular, int numero, int agencia, double saldo, String tipo, double tarifa, double limite, double cartaoCredito, double investimento) {
        // TODO implement here
    }

    /**
     * 
     */
    public void ContaCorrenteEspecial() {
        // TODO implement here
    }

    /**
     * @return
     */
    public double getCartaoCredito() {
        // TODO implement here
        return 0.0d;
    }

    /**
     * @param cartaoCredito 
     * @return
     */
    public void setCartaoCredito(double cartaoCredito) {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public double getInvestimento() {
        // TODO implement here
        return 0.0d;
    }

    /**
     * @param investimento 
     * @return
     */
    public void setInvestimento(double investimento) {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public String toString() {
        // TODO implement here
        return "";
    }

}