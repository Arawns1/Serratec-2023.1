package accounts;

import java.util.*;

/**
 * 
 */
public abstract class Conta implements IConta {

    /**
     * Default constructor
     */
    public Conta() {
    }

    /**
     * 
     */
    protected String titular;

    /**
     * 
     */
    protected int numero;

    /**
     * 
     */
    protected int agencia;

    /**
     * 
     */
    protected double saldo;

    /**
     * 
     */
    protected String tipo;

    /**
     * 
     */
    protected static int totalDeContas;

    /**
     * @param titular 
     * @param numero 
     * @param agencia 
     * @param saldo 
     * @param tipo
     */
    public void Conta(String titular, int numero, int agencia, double saldo, String tipo) {
        // TODO implement here
    }

    /**
     * 
     */
    public void Conta() {
        // TODO implement here
    }

    /**
     * @param valor 
     * @return
     */
    public void depositar(double valor) {
        // TODO implement here
        return null;
    }

    /**
     * @param valor 
     * @return
     */
    public void sacar(double valor) {
        // TODO implement here
        return null;
    }

    /**
     * @param valor 
     * @return
     */
    public boolean verificaSaldo(double valor) {
        // TODO implement here
        return false;
    }

    /**
     * @param destino 
     * @param valor 
     * @return
     */
    public void transferir(Conta destino, double valor) {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public void imprimeExtrato() {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public String getTitular() {
        // TODO implement here
        return "";
    }

    /**
     * @param titular 
     * @return
     */
    public void setTitular(String titular) {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public int getNumero() {
        // TODO implement here
        return 0;
    }

    /**
     * @param numero 
     * @return
     */
    public void setNumero(int numero) {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public int getAgencia() {
        // TODO implement here
        return 0;
    }

    /**
     * @param agencia 
     * @return
     */
    public void setAgencia(int agencia) {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public double getSaldo() {
        // TODO implement here
        return 0.0d;
    }

    /**
     * @return
     */
    public String getTipo() {
        // TODO implement here
        return "";
    }

    /**
     * @param tipo 
     * @return
     */
    public void setTipo(String tipo) {
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

    /**
     * @param valor 
     * @return
     */
    public void depositar(double valor) {
        // TODO implement here
        return null;
    }

    /**
     * @param valor 
     * @return
     */
    public void sacar(double valor) {
        // TODO implement here
        return null;
    }

    /**
     * @param destino 
     * @param valor 
     * @return
     */
    public void transferir(Conta destino, double valor) {
        // TODO implement here
        return null;
    }

}