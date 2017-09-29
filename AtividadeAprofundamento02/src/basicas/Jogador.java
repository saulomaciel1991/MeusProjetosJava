package basicas;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Jogador extends Pessoa {

	private Integer numeroCamisa;
	private Boolean cartaoAmarelo = true;
	private Boolean estaEmCampo;
	private Integer quantidadeCartoesAmarelos;
	private Integer quantidadeCartoesVermelhos;
	private Double Salario;

	@ManyToOne
	@JoinColumn(name = "idTime")
	private Time time;

	public Jogador(Integer id, String nome, String dataNascimento, Integer numeroCamisa, Boolean cartaoAmarelo,
			Boolean estaEmCampo, Integer quantidadeCartoesAmarelos, Integer quantidadeCartoesVermelhos, Double salario,
			Time time) {
		super(id, nome, dataNascimento);
		this.numeroCamisa = numeroCamisa;
		this.cartaoAmarelo = cartaoAmarelo;
		this.estaEmCampo = estaEmCampo;
		this.quantidadeCartoesAmarelos = quantidadeCartoesAmarelos;
		this.quantidadeCartoesVermelhos = quantidadeCartoesVermelhos;
		this.Salario = salario;
		this.time = time;
	}

	public Jogador() {
		super();
	}

	public Boolean getEstaEmCampo() {
		return estaEmCampo;
	}

	public void setEstaEmCampo(Boolean estaEmCampo) {
		this.estaEmCampo = estaEmCampo;
	}

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

	public Double getSalario() {
		return Salario;
	}

	public void setSalario(Double salario) {
		Salario = salario;
	}

	@Override
	public boolean equals(Object arg0) {
		Jogador j = new Jogador();
		Boolean retorno = false;
		j = (Jogador) arg0;
		if (this.getNome().equals(j.getNome())) {
			if (this.getNumeroCamisa() == j.getNumeroCamisa()) {
				retorno = true;
			}
		}
		return retorno;
	}

}
