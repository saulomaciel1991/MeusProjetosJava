package basicas;

import javax.persistence.Entity;

@Entity
public class Tecnico extends Pessoa{

	public Double salario;

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}
	
	
	
}
