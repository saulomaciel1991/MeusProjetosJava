package dao;

import java.util.ArrayList;

import basicas.Usuario;

public interface IDAOUsuario {
	public void inserir(Usuario usuario);

	public void excluir(Usuario usuario);

	public void altera(Usuario usuario);

	public Usuario pesquisa(Usuario usuario);

	public ArrayList<Usuario> listar();
}
