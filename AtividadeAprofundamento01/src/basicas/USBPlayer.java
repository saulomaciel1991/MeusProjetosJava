package basicas;

import java.util.ArrayList;

import util.EletronicoDesligadoException;

public class USBPlayer extends Player {

	private ArrayList<Musica> musicas;

	@Override
	public void avancarMusica() throws EletronicoDesligadoException {
		super.avancarMusica();
	}

	@Override
	public void recuarMusica() throws EletronicoDesligadoException {
		super.recuarMusica();
	}

	public ArrayList<Musica> getMusicas() {
		return musicas;
	}

	public void setMusicas(ArrayList<Musica> musicas) {
		this.musicas = musicas;
	}

}
