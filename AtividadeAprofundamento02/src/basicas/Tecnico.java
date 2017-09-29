package basicas;

import javax.persistence.Entity;

@Entity
public class Tecnico extends Pessoa{

	public Double salario;
	
	
	public Tecnico(Integer id, String nome, String dataNascimento, Double salario) {
		super(id, nome, dataNascimento);
		this.salario = salario;
	}
	
	public Tecnico(){
		super();
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}
	
	@Override
	public boolean equals(Object arg0) {
		Tecnico t = new Tecnico();
		Boolean retorno = false;
		t = (Tecnico) arg0;
		if (this.getNome().equals(t.getNome())) {
			if (this.getDataNascimento() == t.getDataNascimento()) {
				retorno = true;
			}
		}
		return retorno;
	}
	
}
