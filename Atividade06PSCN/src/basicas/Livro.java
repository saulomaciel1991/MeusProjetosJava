package basicas;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Livro {
	@Id
	private Integer Id;
	private String titulo;
	private Short anoPublicacao;
	
	@ManyToOne
	@JoinColumn(name="idEditora")
	private Editora editora;
	
	@ManyToMany
	@JoinTable(name="LivroAutor", 
			   joinColumns={@JoinColumn(name="idLivro")},
			   inverseJoinColumns={@JoinColumn(name="idAutor")})
	private List<Autor> autores;

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Short getAnoPublicacao() {
		return anoPublicacao;
	}

	public void setAnoPublicacao(Short anoPublicacao) {
		this.anoPublicacao = anoPublicacao;
	}

	public List<Autor> getAutores() {
		return autores;
	}

	public void setAutores(List<Autor> autores) {
		this.autores = autores;
	}

	public Editora getEditora() {
		return editora;
	}

	public void setEditora(Editora editora) {
		this.editora = editora;
	}

}
