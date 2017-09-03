package dao;

import java.util.ArrayList;

import basicas.Usuario;

public interface IDAOUsuario {
	public void inserir(Usuario usuario);

	public Usuario pesquisar(String login);

	public ArrayList<Usuario> listar();
	
	public void popular();
}
