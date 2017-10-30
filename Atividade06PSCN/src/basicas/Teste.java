package basicas;

import dao.AutorDAO;

public class Teste {

	public static void main(String[] args) {
		Autor au = new Autor();
		au.setNome("Saulo");
		au.setCpf("12345678900");
		au.setDataNascimento("10-10-2000");
		au.setEmail("example@mail.com");
		au.setNomeAutor("Saulo M.");
		
		AutorDAO dao = new AutorDAO();
		dao.inserirAutor(au);

	}

}
