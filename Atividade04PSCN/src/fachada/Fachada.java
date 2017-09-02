package fachada;

import java.util.ArrayList;

import basicas.Usuario;
import rn.IRNUsuario;
import rn.RNUsuario;

public class Fachada implements IFachada {
	private IRNUsuario rn;

	public Fachada() {
		super();
		rn = new RNUsuario();
	}

	@Override
	public void inserir(Usuario usuario) {
		rn.inserir(usuario);
	}

	@Override
	public Usuario pesquisar(String login) {
		return rn.pesquisar(login);
	}

	@Override
	public ArrayList<Usuario> listar() {
		return rn.listar();
	}

	@Override
	public void fazerLogin(String login, String senha) {
		rn.fazerLogin(login, senha);
	}

}
