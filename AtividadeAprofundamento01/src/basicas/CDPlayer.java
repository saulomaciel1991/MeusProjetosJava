package basicas;

import java.util.ArrayList;

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
	public void play() {
		ArrayList<Musica> musicas = new ArrayList<>();
		Integer num = 0;

		musicas = this.CDCarregado.getMusicas();
		this.setNumeroMusicaAtual(1);
		num = this.getNumeroMusicaAtual();
		System.out.println("Executando a música: " + musicas.get(num - 1).getNomeMusica());

	}

	@Override
	public void stop() {
		this.setNumeroMusicaAtual(0);
		System.out.println("Player parado");
	}

	@Override
	public void avancarMusica() {
		ArrayList<Musica> musicas = new ArrayList<>();
		Integer num = 0;

		try {
			musicas = this.CDCarregado.getMusicas();
			this.setNumeroMusicaAtual(this.getNumeroMusicaAtual() + 1);
			num = this.getNumeroMusicaAtual();
			System.out.println("Executando a música: " + musicas.get(num - 1).getNomeMusica());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Você já está na ultima musica do CD");
		}

	}

	@Override
	public void recuarMusica() {
		ArrayList<Musica> musicas = new ArrayList<>();
		Integer num = 0;

		try {
			musicas = this.CDCarregado.getMusicas();
			this.setNumeroMusicaAtual(this.getNumeroMusicaAtual() - 1);
			num = this.getNumeroMusicaAtual();
			System.out.println("Executando a música: " + musicas.get(num - 1).getNomeMusica());
		} catch (Exception e) {
			System.out.println("Você já está na primeira musica do CD");
		}

	}

	public CD getCDCarregado() {
		return CDCarregado;
	}

	public void setCDCarregado(CD cDCarregado) {
		CDCarregado = cDCarregado;
	}

}
