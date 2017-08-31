package dao;

import java.util.ArrayList;

import basicas.Usuario;

public interface IDAOUsuario {
	public void inserir(Usuario usuario);

	public Usuario pesquisar(Usuario usuario);

	public ArrayList<Usuario> listar();
}
