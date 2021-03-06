package basicas;

public class Musica {

	private String nomeMusica;
	private String nomeArtista;
	private String nomeCompositor;
	private Integer tempoMusica;

	public Musica(String nomeMusica, String nomeArtista, String nomeCompositor, Integer tempoMusica) {
		super();
		this.nomeMusica = nomeMusica;
		this.nomeArtista = nomeArtista;
		this.nomeCompositor = nomeCompositor;
		this.tempoMusica = tempoMusica;
	}
	
	public Musica(){
		super();
	}

	public String getNomeMusica() {
		return nomeMusica;
	}

	public void setNomeMusica(String nomeMusica) {
		this.nomeMusica = nomeMusica;
	}

	public String getNomeArtista() {
		return nomeArtista;
	}

	public void setNomeArtista(String nomeArtista) {
		this.nomeArtista = nomeArtista;
	}

	public String getNomeCompositor() {
		return nomeCompositor;
	}

	public void setNomeCompositor(String nomeCompositor) {
		this.nomeCompositor = nomeCompositor;
	}

	public Integer getTempoMusica() {
		return tempoMusica;
	}

	public void setTempoMusica(Integer tempoMusica) {
		this.tempoMusica = tempoMusica;
	}

}
