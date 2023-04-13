package people.workers;

import java.util.*;

/**
 * 
 */
public class Diretor extends Gerente implements ItotalContas, ITotalFuncionarios {

    /**
     * Default constructor
     */
    public Diretor() {
    }

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
    public void Diretor(String nome, String sobrenome, String cPF, String telefone, String email, double salario, int matricula, int senha) {
        // TODO implement here
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
    public int getTotalFuncionarios() {
        // TODO implement here
        return 0;
    }

    /**
     * @return
     */
    public int getTotalContas() {
        // TODO implement here
        return 0;
    }

    /**
     * @return
     */
    public String toString() {
        // TODO implement here
        return "";
    }

}