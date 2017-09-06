package dao;

import java.util.ArrayList;
import java.util.List;

import basicas.Usuario;

public class DAOUsuario implements IDAOUsuario {
	List<Usuario> usuarios;
	private static DAOUsuario dao;

	private DAOUsuario() {
		super();
		usuarios = new ArrayList<>();
		this.popular();
	}

	public static DAOUsuario getInstance() {
		if (dao == null) {
			dao = new DAOUsuario();
		}
		return dao;
	}

	@Override
	public void inserir(Usuario usuario) {
		usuarios.add(usuario);
	}

	@Override
	public ArrayList<Usuario> listar() {
		return (ArrayList<Usuario>) this.usuarios;
	}

	@Override
	public Usuario pesquisar(String login) {
		Usuario u = new Usuario();

		for (Usuario usuario : usuarios) {
			if (usuario.getLogin() == login) {
				u = usuario;
			}
		}

		return u;
	}

	public void popular() {
		Usuario a = new Usuario(00001, "Saulo", "123456", "Saulo Maciel", "saulomcm@gmail.com");
		Usuario b = new Usuario(00002, "Renato", "123456", "Renato Andrade", "rnandrade@gmail.com");
		Usuario c = new Usuario(00003, "Darlene", "123456", "Darlene Rose", "darlenerose@gmail.com");
		Usuario d = new Usuario(00004, "Nathaly", "123456", "Nathaly Kelten", "nathy@gmail.com");

		usuarios.add(a);
		usuarios.add(b);
		usuarios.add(c);
		usuarios.add(d);
	}

}
