package basicas;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Time {
	
	@Id
	@GeneratedValue
	private Integer id;
	private String nome;
	private String estado;
	private Integer pontos;
	
	@OneToOne
	@JoinColumn(name = "id")
	private Tecnico tecnico;
	
	@OneToMany(mappedBy="time")
	private List<Jogador> jogadores;
	
	

	public String getNome() {
		return nome;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Integer getPontos() {
		return pontos;
	}

	public void setPontos(Integer pontos) {
		this.pontos = pontos;
	}

	public List<Jogador> getJogadores() {
		return jogadores;
	}

	public void setJogadores(List<Jogador> jogadores) {
		this.jogadores = jogadores;
	}

	public Tecnico getTecnico() {
		return tecnico;
	}

	public void setTecnico(Tecnico tecnico) {
		this.tecnico = tecnico;
	}

	public Time(Integer id, String nome, String estado, Integer pontos, Tecnico tecnico, List<Jogador> jogadores) {
		super();
		this.id = id;
		this.nome = nome;
		this.estado = estado;
		this.pontos = pontos;
		this.tecnico = tecnico;
		this.jogadores = jogadores;
	}
	
	public Time(Integer id, String nome, String estado, Integer pontos, Tecnico tecnico) {
		super();
		this.id = id;
		this.nome = nome;
		this.estado = estado;
		this.pontos = pontos;
		this.tecnico = tecnico;
	}
	
	public Time(){
		super();
	}
		
}
