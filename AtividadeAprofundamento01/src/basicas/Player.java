package basicas;

import java.util.ArrayList;

import util.EletronicoDesligadoException;

public class Player{

	private Integer numeroMusicaAtual;
	private Integer tempoMusicaAtual;
	private ArrayList<Musica> musicas;

	public void play() throws EletronicoDesligadoException {
		this.setNumeroMusicaAtual(1);
		System.out.println("Executando a música: " + musicas.get(this.getNumeroMusicaAtual() - 1).getNomeMusica());
	}

	public void stop() throws EletronicoDesligadoException {
		this.setNumeroMusicaAtual(0);
		System.out.println("Player parado");
	}

	public void avancarMusica() throws EletronicoDesligadoException {
		Integer tamanho = musicas.size();
		Integer num = this.getNumeroMusicaAtual();

		if (tamanho > num) {
			this.setNumeroMusicaAtual(this.getNumeroMusicaAtual() + 1);
			num = this.getNumeroMusicaAtual();
			System.out.println(
					num + " - " + musicas.get(num - 1).getNomeMusica() + " - " + musicas.get(num - 1).getNomeArtista());
		} else {
			System.out.println("Você está na útima música da playlist");
		}
	}

	public void recuarMusica() throws EletronicoDesligadoException {
		
		Integer num = this.getNumeroMusicaAtual();

		if (num > 1) {
			this.setNumeroMusicaAtual(this.getNumeroMusicaAtual() - 1);
			num = this.getNumeroMusicaAtual();
			System.out.println(
					num + " - " + musicas.get(num - 1).getNomeMusica() + " - " + musicas.get(num - 1).getNomeArtista());
		}else{
			System.out.println("Você está na primeira musica da playlist");
		}
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

	public ArrayList<Musica> getMusicas() {
		return musicas;
	}

	public void setMusicas(ArrayList<Musica> musicas) {
		this.musicas = musicas;
	}
}
