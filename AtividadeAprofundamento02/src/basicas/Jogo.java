package basicas;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Jogo {

	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	private Integer id;

	@OneToOne
	@JoinColumn(name = "idTimeCasa")
	private Time timeCasa;

	@OneToOne
	@JoinColumn(name = "idTimeVisitante")
	private Time timeVisitante;

	private String nomeCampo;

	@OneToOne
	@JoinColumn(name = "idJuiz")
	private Juiz juiz;
	private String placar;
	private Date dataDoJogo;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Time getTimeCasa() {
		return timeCasa;
	}

	public void setTimeCasa(Time timeCasa) {
		this.timeCasa = timeCasa;
	}

	public Time getTimeVisitante() {
		return timeVisitante;
	}

	public void setTimeVisitante(Time timeVisitante) {
		this.timeVisitante = timeVisitante;
	}

	public String getNomeCampo() {
		return nomeCampo;
	}

	public void setNomeCampo(String nomeCampo) {
		this.nomeCampo = nomeCampo;
	}

	public Juiz getJuiz() {
		return juiz;
	}

	public void setJuiz(Juiz juiz) {
		this.juiz = juiz;
	}

	public String getPlacar() {
		return placar;
	}

	public void setPlacar(String placar) {
		this.placar = placar;
	}

	public Date getDataDoJogo() {
		return dataDoJogo;
	}

	public void setDataDoJogo(Date dataDoJogo) {
		this.dataDoJogo = dataDoJogo;
	}

	public Jogo(Integer id, Time timeCasa, Time timeVisitante, String nomeCampo, Juiz juiz, String placar,
			Date dataDoJogo) {
		super();
		this.id = id;
		this.timeCasa = timeCasa;
		this.timeVisitante = timeVisitante;
		this.nomeCampo = nomeCampo;
		this.juiz = juiz;
		this.placar = placar;
		this.dataDoJogo = dataDoJogo;
	}

	@Override
	public boolean equals(Object obj) {
		Jogo j = (Jogo) obj;
		Boolean retorno = false;
		if (this.getTimeCasa() == j.getTimeCasa()) {
			if (this.getTimeVisitante() == j.getTimeVisitante()) {
				if (this.getDataDoJogo() == j.getDataDoJogo()) {
					retorno = true;
				}
			}
		}

		return retorno;
	}

}
