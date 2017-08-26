package basicas;

public abstract class Player {

	private Integer numeroMusicaAtual;
	private Integer tempoMusicaAtual;

	public abstract void play();

	public abstract void stop();

	public abstract void avancarMusica();

	public abstract void recuarMusica();

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
