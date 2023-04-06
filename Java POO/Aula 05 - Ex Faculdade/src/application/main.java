package application;

import entities.Empregado;
import entities.Professor;
import entities.RelatorioDeGastos;

public class main {

	public static void main(String[] args) {
		Empregado emp = new Empregado("Gabriel", 1000);
		Professor prof = new Professor("José", 1000, 10);
		
		System.out.println(emp.getInfo());
		System.out.println(prof.getInfo());
		
		RelatorioDeGastos RG = new RelatorioDeGastos();
		RG.calculaGastos(emp, prof);

	}

}
