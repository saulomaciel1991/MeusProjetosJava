package basicas;

public class Usuario {
	private Integer codigo;
	private String login;
	private String senha;
	private String nome;
	private String email;

	public Usuario(Integer codigo, String nome) {
		super();
		this.codigo = codigo;
		this.nome = nome;
	}

	public Usuario(Integer codigo, String login, String senha, String nome, String email) {
		super();
		this.codigo = codigo;
		this.login = login;
		this.senha = senha;
		this.nome = nome;
		this.email = email;
	}

	public Usuario() {
		super();
	}

	@Override
	public boolean equals(Object arg0) {
		Usuario u = (Usuario) arg0;
		if (this.getLogin() == u.getLogin()) {
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return "ID: " + this.getCodigo() + ", " + "Nome: " + this.getNome();
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
