package gui;

import javax.swing.JOptionPane;

import basicas.Usuario;
import fachada.Fachada;
import fachada.IFachada;

public class GUIUsuario {

	public static void main(String[] args) {
		Usuario a = new Usuario(00001, "Saulo");
		
		IFachada fachada = new Fachada();
		a.setCodigo(Integer.parseInt(JOptionPane.showInputDialog(null,"Informe o seu codigo:")));
		a.setLogin(JOptionPane.showInputDialog(null,"Informe o seu login:"));
		a.setSenha(JOptionPane.showInputDialog(null,"Informe o sua senha:"));
		System.out.println(fachada.pesquisar(a.getCodigo()));
		
	}

}
