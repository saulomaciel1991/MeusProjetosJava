package rn;

import java.util.ArrayList;

import basicas.Usuario;
import dao.DAOUsuario;

public class RNUsuario implements IRNUsuario {

	@Override
	public void inserir(Usuario usuario) {
		DAOUsuario dao = new DAOUsuario();
		dao.inserir(usuario);
	}

	@Override
	public Usuario pesquisar(Integer codigo) {
		DAOUsuario dao = new DAOUsuario();
		return dao.pesquisar(codigo);
	}

	@Override
	public ArrayList<Usuario> listar() {
		DAOUsuario dao = new DAOUsuario();
		return dao.listar();
	}

}
