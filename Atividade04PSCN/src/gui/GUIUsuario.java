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

		Usuario u2 = new Usuario();
		u2.setCodigo(00006);
		u2.setNome("Karen Andrade");
		u2.setLogin("Karen");
		u2.setSenha("123456");
		String confirmacaoSenha2 = "123456";
		u2.setEmail("karen@hotmail.com");
		fc.cadastrarUsuario(u2, confirmacaoSenha2);

		System.out.println("");

		String login = "Bianca";
		String senha = "123456";
		fc.fazerLogin(login, senha);
		System.out.println("");
		
		for (Usuario usuario : fc.listar()) {
			System.out.println(usuario);
		}
		

	}

}
