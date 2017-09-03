package rn;

import java.util.ArrayList;

import basicas.Usuario;
import dao.DAOUsuario;
import dao.IDAOUsuario;

public class RNUsuario implements IRNUsuario {
	IDAOUsuario dao;

	public void instanciarDao() {
		if (dao == null) {
			dao = new DAOUsuario();
		}
	}
	
	public RNUsuario(){
		super();
		this.instanciarDao();
	}

	@Override
	public void inserir(Usuario usuario) {
		dao.inserir(usuario);
		System.out.println(usuario.getNome() + " adicionado(a) com sucesso!");
	}

	@Override
	public Usuario pesquisar(String login) {
		return dao.pesquisar(login);
	}

	@Override
	public ArrayList<Usuario> listar() {		
		return dao.listar();
	}

	@Override
	public void fazerLogin(String login, String senha) {		
		Usuario u = new Usuario();

		u = dao.pesquisar(login);

		if (login.isEmpty() || senha.isEmpty()) {
			System.out.println("Campos obrigatórios não informados!");
		} else {

			if (u.getSenha() == senha) {
				System.out.println("Autenticando...");
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

		if (usuario.getLogin().length() > 4 && usuario.getLogin().length() < 11) {
			if (usuario.getSenha().length() > 5 && usuario.getSenha().length() < 13) {
				if (usuario.getSenha() == confirmacaoSenha) {
					if (usuario.getNome().length() <= 50) {
						if (usuario.getEmail().length() <= 30) {
							if (this.verificarDuplicidade(usuario) == false) {
								dao.inserir(usuario);
								System.out.println(usuario.getNome() + " adicionado(a) com sucesso!");
							}else{
								System.out.println("Login já existente!");
							}
						} else {
							System.out.println("Campos obrigatórios não informados!");
						}
					} else {
						System.out.println("Nome maior que o permitido!");
					}
				} else {
					System.out.println("Senha não confere!");
				}
			} else {
				System.out.println("Campos obrigatórios não informados!");
			}
		} else {
			System.out.println("Campos obrigatórios não informados!");
		}
	}

	@Override
	public Boolean verificarDuplicidade(Usuario usuario) {
		Boolean retorno = false;
		Usuario u = dao.pesquisar(usuario.getLogin());
		if (u.getLogin() != null) {
			retorno = true;
		}
		return retorno;
	}

}
