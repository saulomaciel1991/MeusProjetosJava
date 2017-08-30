package dao;

import java.util.ArrayList;

import basicas.Usuario;

public class DAOUsuario implements IDAOUsuario {
	ArrayList<Usuario> usuarios;

	public DAOUsuario() {
		super();
		usuarios = new ArrayList<>();
	}

	@Override
	public void inserir(Usuario usuario) {
		usuarios.add(usuario);
	}

	@Override
	public void excluir(Usuario usuario) {
		Integer index = usuarios.indexOf(usuario);
		usuarios.remove(index);
	}

	@Override
	public void altera(Usuario usuario) {
		Usuario u = new Usuario(usuario.getCodigo(), usuario.getLogin(), usuario.getSenha(), usuario.getNome(),
				usuario.getEmail());
		usuarios.remove(usuario);
		usuarios.add(u);
	}

	@Override
	public ArrayList<Usuario> listar() {
		return this.usuarios;
	}

	@Override
	public Usuario pesquisa(Usuario usuario) {
		// TODO Auto-generated method stub
		return null;
	}

}
