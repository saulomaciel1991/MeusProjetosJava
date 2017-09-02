package rn;

import java.util.ArrayList;

import basicas.Usuario;

public interface IRNUsuario {
	public void inserir(Usuario usuario);

	public Usuario pesquisar(String login);

	public ArrayList<Usuario> listar();
	
	public void fazerLogin(String login, String senha);
	
	public void cadastrarUsuario(Usuario usuario, String confirmacaoSenha);
	
	public void popularColecao();
	
}
