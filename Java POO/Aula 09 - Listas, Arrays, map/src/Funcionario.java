
public class Funcionario implements Comparable<Funcionario> {
	public String nome;
	public double salario;
	public Funcionario() {};
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "Funcionario [nome=" + nome + ", salario=" + salario + "]";
	}

	@Override
	public int compareTo(Funcionario func) { //Ordenar com letras crescentes
		if((this.getNome().compareTo(func.getNome()) < 0)) { 
			return -1;
		}
		else if(this.getNome().compareTo(func.getNome()) > 0) {
			return 1;
		}
		else {  //Se nomes forem iguais....
			if(this.getSalario() < func.getSalario()){
				return 1;
			}
			else if(this.getSalario() > func.getSalario()){
				return -1;
			}
			else {
				return 0;
			}
		}
		
	}
	
	
	
}
