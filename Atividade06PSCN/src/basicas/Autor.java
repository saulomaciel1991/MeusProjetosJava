package basicas;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Autor extends Pessoa {
	private String nomeAutor;

	@ManyToMany
	@JoinTable(name = "LivroAutor", 
	joinColumns = { @JoinColumn(name = "idAutor") }, 
	inverseJoinColumns = { @JoinColumn(name = "idLivro") })
	private List<Livro> livros;

	public String getNomeAutor() {
		return nomeAutor;
	}

	public void setNomeAutor(String nomeAutor) {
		this.nomeAutor = nomeAutor;
	}

	public List<Livro> getLivros() {
		return livros;
	}

	public void setLivros(List<Livro> livros) {
		this.livros = livros;
	}

}
