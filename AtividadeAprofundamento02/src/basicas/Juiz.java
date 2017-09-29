package basicas;

import javax.persistence.Entity;

@Entity
public class Juiz extends Pessoa{

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

}
