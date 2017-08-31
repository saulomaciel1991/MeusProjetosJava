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
	public Usuario pesquisar(Integer codigo) {
		return rn.pesquisar(codigo);
	}

	@Override
	public ArrayList<Usuario> listar() {
		return rn.listar();
	}

}
