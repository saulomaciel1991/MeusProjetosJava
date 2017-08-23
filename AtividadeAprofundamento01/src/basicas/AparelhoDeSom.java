package basicas;

public class AparelhoDeSom extends Eletronico {
	private Double potencia;
	private Player player;
	private Integer volume;
	private String controlafor;

	public void aumentarVolume() {
		if (this.getVolume() < 20) {
			this.setVolume(volume++);
		}
	}

	public void diminuirVolume() {
		if (this.getVolume() > 0) {
			this.setVolume(volume--);
		}
	}

	public void alterarFuncao(String funcao) {
		if (funcao == "CD") {
			System.out.println("Alterado para CD player!");
		}else{
			if(funcao == "USB"){
				System.out.println("Alterado para USB!");
			}else{
				this.setPlayer(null);
				System.out.println("Alterado para rádio!");
			}
		}
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

	public String getControlafor() {
		return controlafor;
	}

	public void setControlafor(String controlafor) {
		this.controlafor = controlafor;
	}

}
