package people.workers;

import java.util.*;

/**
 * 
 */
public class Gerente extends Assistente {

    /**
     * Default constructor
     */
    public Gerente() {
    }

    /**
     * 
     */
    private int senha;

    /**
     * @param nome 
     * @param sobrenome 
     * @param cPF 
     * @param telefone 
     * @param email 
     * @param salario 
     * @param matricula 
     * @param senha
     */
    public void Gerente(String nome, String sobrenome, String cPF, String telefone, String email, double salario, int matricula, int senha) {
        // TODO implement here
    }

    /**
     * @param senha 
     * @return
     */
    public boolean autentica(int senha) {
        // TODO implement here
        return false;
    }

    /**
     * @param senha 
     * @return
     */
    public void setSenha(int senha) {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public double getBonificacao() {
        // TODO implement here
        return 0.0d;
    }

    /**
     * @return
     */
    public String toString() {
        // TODO implement here
        return "";
    }

}