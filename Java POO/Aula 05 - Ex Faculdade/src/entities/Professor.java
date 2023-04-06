package entities;

public class Professor extends Empregado {

	protected int horasDeAula;
	
	public Professor(String nome, double salario, int horasDeAula) {
		super(nome, salario);
		this.horasDeAula = horasDeAula;
	}

	public int getHorasDeAula() {
		return horasDeAula;
	}

	public void setHorasDeAula(int horasDeAula) {
		this.horasDeAula = horasDeAula;
	}

	@Override
	public double getGastos() {
		return super.getSalario() + this.horasDeAula*10;
	}

	@Override
	public String getInfo() {
		return "Professor [nome=" + nome + ", salario=" + salario + ", horasDeAula=" + horasDeAula + "]";
	}


	
	
	

}
