package basicas;

import util.EletronicoDesligadoException;

public class AparelhoDeSom extends Eletronico {
	private Double potencia;
	private Player<?> player;
	private Integer volume;
	private String controlador;

	public AparelhoDeSom() {
		super();
		this.setVolume(0);
	}

	public void aumentarVolume() throws EletronicoDesligadoException {

		if (this.getLigado()) {
			if (this.getVolume() < 20) {
				this.setVolume(this.getVolume() + 1);
				System.out.println("Volume " + this.getVolume());
			} else {
				System.out.println("Você atingiu o volume maximo!");
			}
		} else {
			throw new EletronicoDesligadoException();
		}

	}

	public void diminuirVolume() throws EletronicoDesligadoException {
		if (this.getLigado()) {
			if (this.getVolume() > 0) {
				this.setVolume(this.getVolume() - 1);
				System.out.println("Volume " + this.getVolume());
			} else {
				System.out.println("Você atingiu o volume minimo!");
			}
		} else {
			throw new EletronicoDesligadoException();
		}
	}

	public void alterarFuncao(String funcao) throws EletronicoDesligadoException {
		if (this.getLigado()) {
			if (funcao == "CD") {
				CDPlayer cdPlayer = new CDPlayer();
				this.setPlayer(cdPlayer);
				System.out.println("Alterado para CD player!");
			} else {
				if (funcao == "USB") {
					USBPlayer usbPlayer = new USBPlayer();
					this.setPlayer(usbPlayer);
					System.out.println("Alterado para USB!");
				} else {
					this.setPlayer(null);
					System.out.println("Alterado para rádio!");
				}
			}
		}else{
			throw new EletronicoDesligadoException();
		}
	}

	public Double getPotencia() {
		return potencia;
	}

	public void setPotencia(Double potencia) {
		this.potencia = potencia;
	}

	public Player<?> getPlayer() {
		return player;
	}

	public void setPlayer(Player<?> player) {
		this.player = player;
	}

	public Integer getVolume() {
		return volume;
	}

	public void setVolume(Integer volume) {
		this.volume = volume;
	}

	public String getControlador() {
		return controlador;
	}

	public void setControlador(String controlador) {
		this.controlador = controlador;
	}

}
