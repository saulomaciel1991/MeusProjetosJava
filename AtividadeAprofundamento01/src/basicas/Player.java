package basicas;

public class Player<E>{

	private Integer numeroMusicaAtual;
	private Integer tempoMusicaAtual;

	public void play() {
		this.setNumeroMusicaAtual(1);
	}

	public void stop() {

	}

	public void avancarMusica() {

	}

	public void recuarMusica() {

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
