package gui;

import basicas.Usuario;
import dao.DAOUsuario;
import fachada.Fachada;

public class GUIUsuario {

	public static void main(String[] args) {

		int choice = 0;
		Fachada fc = new Fachada();
		fc.popularColecao();
		
		System.out.println("Escolha uma das opções abaixo:");
		System.out.println("");
		System.out.println("1 - Fazer login");
		System.out.println("2 - Cadastrar usuario");
		System.out.println("");
		System.out.println("");
		
		choice = 2;

		switch (choice) {
		case 1:

			System.out.println("Favor digite as informações de login:");
			String login = "Saulo";// JOptionPane.showInputDialog(null,"Informe
									// o seu login:");;
			String senha = "123456";// JOptionPane.showInputDialog(null,"Informe
									// a sua senha:");
			System.out.println("Autenticando...");
			fc.fazerLogin(login, senha);
			break;
		case 2:

			System.out.println("Favor digite os seus dados para cadastro:");
			Usuario u = new Usuario();
			u.setCodigo(00005);
			u.setNome("Bianca Barbosa");
			u.setLogin("Bianca");
			u.setSenha("123456");
			String confirmacaoSenha = "123456";
			u.setEmail("bia2017@hotmail.com");
			fc.cadastrarUsuario(u, confirmacaoSenha);	
			break;

		default:
			System.out.println("Nenhuma opção válida foi selecionada!");
			break;
		}
		
		DAOUsuario dao = new DAOUsuario();
		for (Usuario usuario : dao.listar()) {
			System.out.println(usuario);
		}
	}

}
