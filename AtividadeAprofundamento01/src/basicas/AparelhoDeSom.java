package basicas;

public class AparelhoDeSom extends Eletronico {
	private Double potencia;
	private Player player;
	private Integer volume;
	private String funcao;

	public void aumentarVolume(){
		
	}
	
	public void diminuirVolume(){
		
	}
	
	public void alterarFuncao(){
		
	}
	
	public Double getPotencia() {
		return potencia;
	}

	public void setPotencia(Double potencia) {
		this.potencia = potencia;
	}

	public Player getPlayer() {
		return player;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}

	public Integer getVolume() {
		return volume;
	}

	public void setVolume(Integer volume) {
		this.volume = volume;
	}

	public String getFuncao() {
		return funcao;
	}

	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}

}
