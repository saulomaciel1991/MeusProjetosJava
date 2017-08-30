package gui;

import basicas.Usuario;
import dao.DAOUsuario;

public class GUIUsuario {

	public static void main(String[] args) {
		Usuario a = new Usuario(00001,"Saulo");
		Usuario b = new Usuario(00002,"Maciel");
		Usuario c = new Usuario(00003, "Correia");
		Usuario d = new Usuario(00004, "Melo");
		DAOUsuario dao = new DAOUsuario();

		dao.inserir(a);
		dao.inserir(b);
		dao.inserir(c);
		dao.inserir(d);

		for (Usuario u : dao.listar()) {
			System.out.println(u.toString());
		}

	}

}
