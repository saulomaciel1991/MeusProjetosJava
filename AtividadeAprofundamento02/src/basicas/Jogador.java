package basicas;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Jogador extends Pessoa {

	private Integer numeroCamisa;
	private Boolean cartaoAmarelo = true;
	private Integer quantidadeCartoesAmarelos;
	private Integer quantidadeCartoesVermelhos;

	@ManyToOne
	@JoinColumn(name = "idTime")
	private Time time;

	public Integer getNumeroCamisa() {
		return numeroCamisa;
	}

	public void setNumeroCamisa(Integer numeroCamisa) {
		this.numeroCamisa = numeroCamisa;
	}

	public Boolean getCartaoAmarelo() {
		return cartaoAmarelo;
	}

	public void setCartaoAmarelo(Boolean cartaoAmarelo) {
		this.cartaoAmarelo = cartaoAmarelo;
	}

	public Integer getQuantidadeCartoesAmarelos() {
		return quantidadeCartoesAmarelos;
	}

	public void setQuantidadeCartoesAmarelos(Integer quantidadeCartoesAmarelos) {
		this.quantidadeCartoesAmarelos = quantidadeCartoesAmarelos;
	}

	public Integer getQuantidadeCartoesVermelhos() {
		return quantidadeCartoesVermelhos;
	}

	public void setQuantidadeCartoesVermelhos(Integer quantidadeCartoesVermelhos) {
		this.quantidadeCartoesVermelhos = quantidadeCartoesVermelhos;
	}

	public Time getTime() {
		return time;
	}

	public void setTime(Time time) {
		this.time = time;
	}

}
