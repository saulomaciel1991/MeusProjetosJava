package fachada;

import java.util.ArrayList;

import basicas.Usuario;

public interface IFachada {
	public void inserir(Usuario usuario);

	public Usuario pesquisar(Integer codigo);

	public ArrayList<Usuario> listar();
}
