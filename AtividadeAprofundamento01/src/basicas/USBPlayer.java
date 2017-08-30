package basicas;

import java.util.ArrayList;

public class USBPlayer extends Player {

	private ArrayList<Musica> musicas;

	@Override
	public void play() {
		Integer num = 0;

		this.setNumeroMusicaAtual(1);
		num = this.getNumeroMusicaAtual();
		System.out.println("Músicas carregadas!");
		System.out.println("Executando a música: " + musicas.get(num - 1).getNomeMusica());

	}

	@Override
	public void stop() {
		this.setNumeroMusicaAtual(0);
		System.out.println("Player parado");
	}

	@Override
	public void avancarMusica() {
		Integer num = 0;
		String nomeMusica = null, nomeArtista = null;

		if (this.getNumeroMusicaAtual() < (musicas.size())) {
			this.setNumeroMusicaAtual(this.getNumeroMusicaAtual() + 1);
			num = this.getNumeroMusicaAtual();
			nomeMusica = musicas.get(num - 1).getNomeMusica();
			nomeArtista = musicas.get(num - 1).getNomeArtista();
			System.out.println(num + " - " + nomeMusica + " - " + nomeArtista);
		} else {
			this.setNumeroMusicaAtual(0);
			this.avancarMusica();
		}

	}

	@Override
	public void recuarMusica() {
		Integer num = 0;
		String nomeMusica = null, nomeArtista = null;

		if (this.getNumeroMusicaAtual() > 0) {
			num = this.getNumeroMusicaAtual();
			nomeMusica = musicas.get(num - 1).getNomeMusica();
			nomeArtista = musicas.get(num - 1).getNomeArtista();
			System.out.println(num + " - " + nomeMusica + " - " + nomeArtista);
			this.setNumeroMusicaAtual(this.getNumeroMusicaAtual() - 1);
		} else {
			this.setNumeroMusicaAtual(musicas.size());
			this.play();
			this.recuarMusica();
		}

	}

	public ArrayList<Musica> getMusicas() {
		return musicas;
	}

	public void setMusicas(ArrayList<Musica> musicas) {
		this.musicas = musicas;
	}

}
