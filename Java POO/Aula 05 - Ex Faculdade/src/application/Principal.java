package application;

import entities.Empregado;
import entities.Professor;
import entities.RelatorioDeGastos;

public class Principal {
	
	public static void main(String[] args) {
		Empregado emp = new Empregado("Gabriel", 1000);
		Professor prof = new Professor("José", 1000, 10);
		Professor prof2 = new Professor("Pedro", 1200, 30);
		
		System.out.println(emp.getInfo());
		System.out.println(prof.getInfo());
		
		RelatorioDeGastos.calculaGastos(emp, prof, prof2);
	}

}
