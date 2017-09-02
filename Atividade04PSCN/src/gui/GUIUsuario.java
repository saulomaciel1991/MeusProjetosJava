package gui;

import javax.swing.JOptionPane;

import fachada.Fachada;

public class GUIUsuario {

	public static void main(String[] args) {

		Fachada fc = new Fachada();
		System.out.println("Favor digite as informações de login:");			
		String login = JOptionPane.showInputDialog(null,"Informe o seu login:");;
		String senha = JOptionPane.showInputDialog(null,"Informe a sua senha:");
		
		System.out.println("Autenticando...");
		fc.fazerLogin(login, senha);
	}

}
