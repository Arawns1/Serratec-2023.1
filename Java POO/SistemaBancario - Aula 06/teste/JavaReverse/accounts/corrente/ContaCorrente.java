package accounts.corrente;

import java.util.*;

/**
 * 
 */
public class ContaCorrente extends Conta {

    /**
     * Default constructor
     */
    public ContaCorrente() {
    }

    /**
     * 
     */
    private double tarifa;

    /**
     * 
     */
    private double limiteSaque;

    /**
     * @param titular 
     * @param numero 
     * @param agencia 
     * @param saldo 
     * @param tipo 
     * @param tarifa 
     * @param limite
     */
    public void ContaCorrente(String titular, int numero, int agencia, double saldo, String tipo, double tarifa, double limite) {
        // TODO implement here
    }

    /**
     * 
     */
    public void ContaCorrente() {
        // TODO implement here
    }

    /**
     * @return
     */
    public double getTarifa() {
        // TODO implement here
        return 0.0d;
    }

    /**
     * @param tarifa 
     * @return
     */
    public void setTarifa(double tarifa) {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public double getLimite() {
        // TODO implement here
        return 0.0d;
    }

    /**
     * @param limite 
     * @return
     */
    public void setLimite(double limite) {
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