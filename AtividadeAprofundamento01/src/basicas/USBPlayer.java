package basicas;

import java.util.ArrayList;

public class USBPlayer extends Player<Object> {

	private ArrayList<Musica> musicas;

	@Override
	public void avancarMusica() {
		super.avancarMusica();
	}

	@Override
	public void recuarMusica() {
		super.recuarMusica();
	}

	public ArrayList<Musica> getMusicas() {
		return musicas;
	}

	public void setMusicas(ArrayList<Musica> musicas) {
		this.musicas = musicas;
	}

}
