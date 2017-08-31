package dao;

import java.util.ArrayList;

import basicas.Usuario;

public class DAOUsuario implements IDAOUsuario {
	ArrayList<Usuario> usuarios;

	public DAOUsuario() {
		super();
		usuarios = new ArrayList<>();
		this.popular();
	}

	@Override
	public void inserir(Usuario usuario) {
		usuarios.add(usuario);
		System.out.println(usuario.getNome() + " adicionado com sucesso!");
	}

	@Override
	public ArrayList<Usuario> listar() {
		return this.usuarios;
	}

	@Override
	public Usuario pesquisar(Usuario usuario) {
		return usuarios.get(usuario.getCodigo() - 1);
	}

	public void popular() {
		Usuario a = new Usuario(00001, "Saulo", "123456", "Saulo Maciel", "saulomcm@gmail.com");
		Usuario b = new Usuario(00002, "Renato", "123456", "Renato Andrade", "rnandrade@gmail.com");
		Usuario c = new Usuario(00003, "Darlene", "123456", "Darlene Rose", "darlenerose@gmail.com");

		usuarios.add(a);
		usuarios.add(b);
		usuarios.add(c);
	}

}
