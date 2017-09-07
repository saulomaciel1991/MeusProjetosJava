package gui;

import basicas.Usuario;
import fachada.Fachada;

public class GUIUsuario {

	public static void main(String[] args) {

		Fachada fc = Fachada.getInstance();

		Usuario u = new Usuario();
		u.setCodigo(00005);
		u.setNome("Bianca Barbosa");
		u.setLogin("Bianca");
		u.setSenha("123456");
		String confirmacaoSenha = "123456";
		u.setEmail("bia2017@hotmail.com");
		fc.cadastrarUsuario(u, confirmacaoSenha);

		System.out.println("");

		String login = "Bianca";
		String senha = "123456";
		fc.fazerLogin(login, senha);

	}

}
