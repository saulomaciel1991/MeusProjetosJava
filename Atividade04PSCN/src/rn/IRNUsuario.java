package rn;

import java.util.ArrayList;

import basicas.Usuario;

public interface IRNUsuario {
	public void inserir(Usuario usuario);

	public Usuario pesquisar(Integer codigo);

	public ArrayList<Usuario> listar();

}
