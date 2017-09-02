package rn;

import java.util.ArrayList;

import basicas.Usuario;
import dao.DAOUsuario;

public class RNUsuario implements IRNUsuario {

	@Override
	public void inserir(Usuario usuario) {
		DAOUsuario dao = new DAOUsuario();
		dao.inserir(usuario);
		System.out.println(usuario.getNome() + " adicionado(a) com sucesso!");
	}

	@Override
	public Usuario pesquisar(String login) {
		DAOUsuario dao = new DAOUsuario();
		return dao.pesquisar(login);
	}

	@Override
	public ArrayList<Usuario> listar() {
		DAOUsuario dao = new DAOUsuario();
		return dao.listar();
	}

	@Override
	public void fazerLogin(String login, String senha) {
		DAOUsuario dao = new DAOUsuario();
		Usuario u = new Usuario();

		u = dao.pesquisar(login);

		if (login.isEmpty() || senha.isEmpty()) {
			System.out.println("Campos obrigatórios não informados!");
		} else {

			if (u.getSenha() == senha) {
				System.out.println("Login realizado!");
				System.out.println("Escolha uma das opções abaixo:");
				System.out.println("");
				System.out.println("1 - Cadastrar contatos telefônicos");
				System.out.println("2 - Listar contatos telefônicos");
				System.out.println("3 - Deslogar");
			} else {
				System.out.println("Login/Senha inválidos!");
			}

		}
	}

	@Override
	public void cadastrarUsuario(Usuario usuario, String confirmacaoSenha) {
		DAOUsuario dao = new DAOUsuario();
		
		if (usuario.getLogin().length() > 4 && usuario.getLogin().length() < 11) {
			if (usuario.getSenha().length() > 5 && usuario.getSenha().length() < 13) {
				if (usuario.getSenha() == confirmacaoSenha) {
					if (usuario.getNome().length() <= 50) {
						if (usuario.getEmail().length() <= 30) {
							dao.inserir(usuario);
							System.out.println(usuario.getNome() + " adicionado(a) com sucesso!");
						}else{
							System.out.println("Campos obrigatórios não informados!");
						}
					}else{
						System.out.println("Campos obrigatórios não informados!");
					}
				}else{
					System.out.println("Senha não confere!");
				}
			}else{
				System.out.println("Campos obrigatórios não informados!");
			}
		}else{
			System.out.println("Campos obrigatórios não informados!");
		}
	}

	@Override
	public void popularColecao() {
		DAOUsuario dao = new DAOUsuario();
		dao.popular();
	}

}
