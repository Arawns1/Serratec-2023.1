import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		List<Funcionario> lista = new ArrayList();
		
		Funcionario f1 = new Funcionario();
		f1.setNome("Gabriel");
		f1.setSalario(10.0);
		Funcionario f2 = new Funcionario();
		f2.setNome("Abriel");
		f2.setSalario(12.0);
		
		Funcionario f3 = new Funcionario();
		f3.setNome("Abriel");
		f3.setSalario(9.0);
		
		Funcionario f4 = new Funcionario();
		f4.setNome("ZAbriel");
		f4.setSalario(9.0);
		
		Funcionario f5 = new Funcionario();
		f5.setNome("ZAbriel");
		f5.setSalario(14.0);
		
		lista.add(f1);
		lista.add(f2);
		lista.add(f3);
		lista.add(f4);
		lista.add(f5);
		lista.forEach(item -> System.out.println(item));
		
		System.out.println(lista.size());
		
		Collections.sort(lista);
		System.out.println(lista);
	
	}

}
