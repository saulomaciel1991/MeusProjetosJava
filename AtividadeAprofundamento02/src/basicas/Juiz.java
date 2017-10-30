package basicas;

import javax.persistence.Entity;

@Entity
public class Juiz extends Pessoa {

	private Double salario;

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	@Override
	public boolean equals(Object arg0) {
		Juiz j = new Juiz();
		Boolean retorno = false;
		j = (Juiz) arg0;
		if (this.getNome().equals(j.getNome())) {
			if (this.getDataNascimento() == j.getDataNascimento()) {
				retorno = true;
			}
		}
		return retorno;
	}
	
	public Juiz(Integer id, String nome, String dataNascimento, Double salario) {
		super(id, nome, dataNascimento);
		this.salario = salario;
	}
	
	public Juiz(){
		super();
	}

}
