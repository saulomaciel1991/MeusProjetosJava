package basicas;

import java.util.ArrayList;

import util.EletronicoDesligadoException;

public class CDPlayer extends Player<Object> {
	private CD CDCarregado;

	public void colocarCD(CD CDCarregado) throws EletronicoDesligadoException {
		this.setCDCarregado(CDCarregado);
		System.out.println("Foi colocado o CD de " + CDCarregado.getNomeArtista());
	}

	public void tirarCD() throws EletronicoDesligadoException {
		System.out.println("Foi tirado o CD de " + this.CDCarregado.getNomeArtista());
		this.setCDCarregado(null);
	}

	
	
	@Override
	public void avancarMusica() throws EletronicoDesligadoException {
		ArrayList<Musica> musicas = CDCarregado.getMusicas();
		Integer tamanho = CDCarregado.getMusicas().size();
		Integer num = 0;

		if (tamanho > num) {
			num++;
			System.out.println(
					num + " - " + musicas.get(num - 1).getNomeMusica() + " - " + musicas.get(num - 1).getNomeArtista());
		} else {
			System.out.println("Você está na útima música da playlist");
		}
	}

	public CD getCDCarregado() {
		return CDCarregado;
	}

	public void setCDCarregado(CD cDCarregado) {
		CDCarregado = cDCarregado;
	}

}
