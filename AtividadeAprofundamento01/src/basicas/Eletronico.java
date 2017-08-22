package basicas;

public class Eletronico {
	private String marca;
	private String modelo;
	private Boolean ligado;

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Boolean getLigado() {
		return ligado;
	}

	public void setLigado(Boolean ligado) {
		this.ligado = ligado;
	}
	
	public void ligar(){
		this.setLigado(true);
	}
	
	public void desligar(){
		this.setLigado(false);
	}
}
