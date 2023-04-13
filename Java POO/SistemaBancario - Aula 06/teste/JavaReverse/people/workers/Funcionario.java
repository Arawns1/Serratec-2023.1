package people.workers;

import java.util.*;

/**
 * 
 */
public abstract class Funcionario extends Pessoa {

    /**
     * Default constructor
     */
    public Funcionario() {
    }

    /**
     * 
     */
    protected double salario;

    /**
     * 
     */
    protected int matricula;

    /**
     * 
     */
    protected static int totalDeFuncionarios;

    /**
     * Cria uma nova derivação de funcionario
     * @param nome 
     * @param sobrenome 
     * @param cPF 
     * @param telefone 
     * @param email 
     * @param salario 
     * @param matricula
     */
    public void Funcionario(String nome, String sobrenome, String cPF, String telefone, String email, double salario, int matricula) {
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
    public double getSalario() {
        // TODO implement here
        return 0.0d;
    }

    /**
     * @param salario 
     * @return
     */
    public void setSalario(double salario) {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public int getMatricula() {
        // TODO implement here
        return 0;
    }

    /**
     * @param matricula 
     * @return
     */
    public void setMatricula(int matricula) {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public String getCargo() {
        // TODO implement here
        return "";
    }

    /**
     * @return
     */
    public String toString() {
        // TODO implement here
        return "";
    }

}