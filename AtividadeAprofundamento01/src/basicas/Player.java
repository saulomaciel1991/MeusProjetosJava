package basicas;

import util.EletronicoDesligadoException;

public class Player<E> {

	private Integer numeroMusicaAtual;
	private Integer tempoMusicaAtual;

	public void play() throws EletronicoDesligadoException {
		this.setNumeroMusicaAtual(1);
	}

	public void stop() throws EletronicoDesligadoException {

	}

	public void avancarMusica() throws EletronicoDesligadoException {

	}

	public void recuarMusica() throws EletronicoDesligadoException {

	}

	public Integer getNumeroMusicaAtual() {
		return numeroMusicaAtual;
	}

	public void setNumeroMusicaAtual(Integer numeroMusicaAtual) {
		this.numeroMusicaAtual = numeroMusicaAtual;
	}

	public Integer getTempoMusicaAtual() {
		return tempoMusicaAtual;
	}

	public void setTempoMusicaAtual(Integer tempoMusicaAtual) {
		this.tempoMusicaAtual = tempoMusicaAtual;
	}

}
