package basicas;

import util.EletronicoDesligadoException;

public class CDPlayer extends Player {
	private CD CDCarregado;

	public void colocarCD(CD CDCarregado) {
		this.setCDCarregado(CDCarregado);
		System.out.println("Foi colocado o CD de " + CDCarregado.getNomeArtista());
	}

	public void tirarCD() {
		System.out.println("Foi tirado o CD de " + this.CDCarregado.getNomeArtista());
		this.setCDCarregado(null);
	}

	@Override
	public void play() throws EletronicoDesligadoException {
		this.setNumeroMusicaAtual(1);
		System.out.println("Executando a música: "
				+ this.CDCarregado.getMusicas().get(this.getNumeroMusicaAtual() - 1).getNomeMusica());
	}

	@Override
	public void avancarMusica() {
		Integer num = this.getNumeroMusicaAtual();

		if (num > 1) {
			this.setNumeroMusicaAtual(this.getNumeroMusicaAtual() - 1);
			num = this.getNumeroMusicaAtual();
			System.out.println(num + " - " + this.CDCarregado.getMusicas().get(num - 1).getNomeMusica() + " - "
					+ this.CDCarregado.getMusicas().get(num - 1).getNomeArtista());
		} else {
			System.out.println("Você está na primeira musica da playlist");
		}
	}

	public CD getCDCarregado() {
		return CDCarregado;
	}

	public void setCDCarregado(CD cDCarregado) {
		CDCarregado = cDCarregado;
	}

}
